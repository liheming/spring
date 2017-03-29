package cn.heming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.heming.db.JDBCOption;
import cn.heming.db.SQLConstant;
import cn.heming.util.Common;

/**
 * Servlet implementation class Login_in
 */
@WebServlet("/Login_in")
public class Login_in extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_in() {
        super();
        // TODO Auto-generated constructor stub
    }
//    processRequest
    protected void processRequest( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String  username = request.getParameter("username");
        List<?>  list = JDBCOption.query(SQLConstant.getUserByName, username);
        if (list.size() > 0) {
            HashMap hashMap = (HashMap) list.get(0);
            String  password = (String) hashMap.get("password");
//            out.print(hashMap.get("password")); 
            if (password.equals(request.getParameter("password"))) {
            	out.print(Common.AlertBack(" congratulation  login success  "));
//                 session.setAttribute("username", username);
            } else {
                out.print(Common.AlertBack(" password illegal  你输入的密码不正确"));
            }

        } else {
            out.print(Common.AlertBack(" username illegal  用户名不存在,请先进行注册?"));
            
        }

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		processRequest(session,request,response);
		processRequest(request,response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
		doGet(request, response);
	}

}
