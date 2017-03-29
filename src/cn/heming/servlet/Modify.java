package cn.heming.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.heming.db.JDBCOption;
import cn.heming.db.SQLConstant;
import cn.heming.util.Common;

/**
 * Servlet implementation class Modify
 */
@WebServlet("/Modify")
public class Modify extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String  username;
	String  password;
	String  email;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Modify() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processrequest(HttpServletRequest  request,HttpServletResponse response) {
//    	 HttpSession session= request.getSession(true);
//    	 String sessionusername= (String)session.getAttribute("username") ;
//		username  =new String(username.getBytes("ISO-8859-1"),"UTF-8");
    	PrintWriter pWriter = null;
    	try {
			 pWriter =  response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String id = request.getParameter("id");
   
    	String username = request.getParameter("username");
    	String email = request.getParameter("email");
    	String sex = request.getParameter("sex");
    	System.out.println("����ҳ�� username==" + username +"==email>" + email+"sex=="+sex+"id==" +id);
		boolean  isok = JDBCOption.update(SQLConstant.UpdateUserInfo,username,email,sex ,id );
		if (isok) {
			System.out.println("�������ݳɹ�����");
			pWriter.println(Common.AlertTo("�������ݳɹ�  modify date success ", "showAllUser.jsp"));
			
		}else {
			
			pWriter.println(Common.AlertTo("��������ʧ��", "modify.jsp?"+username));
			System.out.println("��������ʧ�ܣ���modify date false");
			
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ִ��doGet");
		processrequest(request, response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ִ��doPost");
		doGet(request, response);
	}

}
