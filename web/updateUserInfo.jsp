<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="tools.Common"%>
<%@page import="java.util.HashMap"%>
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
		boolean isDel = JDBCOption.update(SQLConstant.UpdateUserInfo, id);
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