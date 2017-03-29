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
import javax.servlet.http.HttpSession;
import cn.heming.db.JDBCOption;
import cn.heming.db.SQLConstant;
import cn.heming.util.Common;


/**
 * Servlet implementation class Login
 */
@WebServlet(name = "Login",value = "/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}
	 protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        PrintWriter out = response.getWriter();
	        String security = request.getParameter("security");
//	      String se=  request.getSession().getAttribute("security").toString();
	        if (!request.getSession().getAttribute("security").toString().equals(security)) {
	        	 out.print(Common.AlertBack("identifing code  error 验证码错误"));
	            return;
	        } else {
	        	processRequestlogin(out,request, response);
	        }


	    }


	protected void processRequestlogin(PrintWriter out , HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String  username = request.getParameter("username");
		String  returnUrl = request.getParameter("return_url");
		System.out.println("processRequestlogin 用户名是："+username);

		System.out.println(returnUrl);
		username  =new String(username.getBytes("ISO-8859-1"),"UTF-8");
		List<?>  list = JDBCOption.query(SQLConstant.getUserByName, username);
		if (list.size() > 0) {
			HashMap hashMap = (HashMap) list.get(0);
			String  password = (String) hashMap.get("password");
			System.out.println("用密码是："+password);
			password  =new String(password.getBytes("ISO-8859-1"),"UTF-8");
			//            out.print(hashMap.get("password")); 
			if (password.equals(request.getParameter("password"))) {
//				 out.print("<script>\n" +
//	                        "    window.location = \"index.jsp\";\n" +
//	                        "</script>");
				out.print(Common.AlertTo("登陆Login success", "index.jsp"));
				HttpSession session=request.getSession(true);
				session.setAttribute("username", username);
			} else {
				out.print(Common.AlertBack(" password error  密码错误"));
//				out.print("<script>\n" +
//			              "    alert(\"password illegal  ");\n" +
//			              "</script>");
			}

		} else {
			out.print(Common.AlertBack(" username error  用户名错误"));
//			out.print("<script>\n" +
//		              "    alert(\"password illegal  username illegal   用户名错误\");\n" +
//		              "    window.history.back();\n" +
//		              "</script>");

		}

	}
	protected void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
//		doGet(request, response);
	}

}
