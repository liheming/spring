package cn.heming.servlet;

import cn.heming.db.JDBCOption;
import cn.heming.db.SQLConstant;
import cn.heming.util.Common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class anonymous
 */
@WebServlet("/anonymous")
public class anonymous extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public anonymous() {
		super();

	}
	protected void record( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
   String anonymous = request.getParameter("anonymous");
//   anonymous=new String(anonymous.getBytes("ISO-8859-1"),"UTF-8");
   
   JDBCOption.update(SQLConstant.AddAnonymous, null, "145.14", anonymous );
   out.print(Common.AlertBack("添加成功>>Add success"));
   


	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		record(request,response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		record(request,response);
//		doGet(request, response);
	}

}
