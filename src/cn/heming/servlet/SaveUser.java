package cn.heming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.heming.db.JDBCOption;
import cn.heming.db.SQLConstant;
import cn.heming.enteity.Admin;
import cn.heming.util.Common;
       
/**
 * Servlet implementation class SaveUser
 */
@WebServlet("/SaveUser")
public class SaveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveUser() {
        super();
       
    }
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setCharacterEncoding("GBK");
        PrintWriter out = response.getWriter();
        String security = request.getParameter("security");
        if (!request.getSession().getAttribute("security").toString().equals(security)) {
        	 out.print(Common.AlertBack("identifing code  error 验证码错误"));
            return;
        } else {
            addUser(out, request);
        }


    }

@Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	super.init();
}
@Override
public void destroy() {
	// TODO Auto-generated method stub
	super.destroy();
}
    protected void addUser(PrintWriter out, HttpServletRequest request) {
        List list = JDBCOption.query(SQLConstant.getUserByName, request.getParameter("username"));
        if (list.size() > 0) {
        	  out.print(Common.AlertBack("username have exist!!用户名已经存在"));
            return ;
        }
        Admin admin = new Admin();
        admin.setUsername(request.getParameter("username"));
        admin.setPassword(request.getParameter("password"));
        admin.setEmail(request.getParameter("email"));
       boolean isok =  JDBCOption.update(SQLConstant.AddMessage, null, admin.getUsername(), admin.getPassword(), admin.getEmail());
       if (isok) {		
    	   out.print(Common.AlertTo("congratulation" + admin.getUsername() + "register success!! go login now ", "login.jsp"));
	}
        
//        out.print("<script charset=\"utf-8\">\n" +
//                "   alert(\"register success 注册成功)" + "\n" +
//                "    window.location= \"login.jsp\";\n" +
//                "</script>");
//        out.print(Common.AlertBack("congratulation" + admin.getUsername() + "register success!!注册成功"));

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
//		response.getWriter().append("").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
//		doGet(request, response);
	}

}
