package cn.heming.servlet;

import cn.heming.db.JDBCOption;
import cn.heming.db.SQLConstant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

/**
 * Servlet implementation class ShowAllUser
 */
@WebServlet("/ShowAllUser")
public class ShowAllUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowAllUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	private void ShowAllUser(HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<?> list = JDBCOption.query(SQLConstant.GetAllMessage);
		// out.print("<!DOCTYPE html> <html><head><meta
		// http-equiv=\"Content-Type\" content=\"text/html;
		// charset=UTF-8\"><title>�����û�</title></head><body><table
		// border=\"1px\">");
		for (int i = 0; i < list.size(); i++) {
			HashMap hashMap = (HashMap) list.get(i);
			Object id = hashMap.get("id");
			String username = (String) hashMap.get("username");
			String email = (String) hashMap.get("email");
			String datetime = hashMap.get("datetime").toString();
			System.out.println("��ʵ�������û�==username>" + username + "==email>" + email + "==datetime>" + datetime);
			out.print(" <tr>" + "         <td>" + username + " </td>" + "         <td>" + email + "</td>"
					+ "         <td>" + datetime + "</td>"
					+ "         <td> <a href=\" javascript:doDel("+ id+" ) \"><img src=\"img/delete.png\"   style=\"width: 20px ; height: 20px\"> </a> "
					+ " &nbsp;&nbsp;&nbsp;&nbsp; <a href=\"modify.jsp?username="+username+" \"><img src=\"img/edit.png\"   style=\"width: 20px ; height: 20px\"> </a>  </td>\n"
					+ "      </tr> ");

		}
		// out.print("</table></body> </html>");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ShowAllUser(response);
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ShowAllUser(response);
		doGet(request, response);
	}

}
