<%@page import="tools.Common"%>
<%@page import="java.util.HashMap"%>
<%@page import="jdbc.SQLConstant"%>
<%@page import="java.util.List"%>
<%@page import="jdbc.JDBCOption"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String  username = request.getParameter("username");
List<?>  list = JDBCOption.query(SQLConstant.getUserByName, username);
if (list.size() > 0) {
    HashMap hashMap = (HashMap) list.get(0);
    String  password = (String) hashMap.get("password");
    out.print(hashMap.get("password")); ;
    if (password.equals(request.getParameter("password"))) {
    	out.print(Common.AlertBack(" congratulation  login success  "));
         session.setAttribute("username", username);
    } else {
        out.print(Common.AlertBack(" password illegal  你输入的密码不正确"));
    }

} else {
    out.print(Common.AlertBack(" username illegal  用户名不存在,请先进行注册?"));
    
}
%>
<%
String path =(request.getRealPath("/")).replace('\\', '/');//获取当前路径并转换格式
    out.print(path);
%>

</body>
</html>