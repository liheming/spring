<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  String str = "hello world"; %>

<%-- woshi 注释  --%>
<%= page.toString() %><br />
     session的唯一标识符 <%= session.getId()   %><br />
     session的创建时间 <%= new Date(session.getCreationTime()) 
   
     %><br />
   
     session的唯一标识符 <%= new Date(session.getLastAccessedTime())   %><br />
     session的唯一标识符 <%= session.getMaxInactiveInterval()   %><br />
   用户名 <%= config.getInitParameter("user") %><br />
      密码<%= config.getInitParameter("pass") %><br />

</body>
</html>