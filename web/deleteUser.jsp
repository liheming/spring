<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="tools.Common"%>
<%@page import="jdbc.SQLConstant"%>
<%@page import="jdbc.JDBCOption"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		boolean isDel = JDBCOption.deleteUuerById(SQLConstant.DeleteUserByiD, id);
		if (isDel) {
			System.out.println("删除成功");
	%>
	<script>
		window.location = "showAllUser.jsp";
	</script>
	<%
		}
	%>
</body>
</html>