<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en" xmlns:jsp="http://www.w3.org/2001/XInclude">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap Portfolio template</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    
</head>
<body>
<jsp:include page="nav_head.jsp" flush="true"></jsp:include>
<br/><br/><br/>
<form class="form-horizontal" role="form"  action="<%= request.getContextPath() %>/Login" method=post>
 
    <% if(request.getAttribute("return_url" )!=null){
    	%>
    	<input  type="hidden" name="return_url"  value="<%=request.getAttribute("return_url") %>"/>
    <% }%>
    <div class="form-group">
        <label for="username" class="col-sm-4 control-label">用户名</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="username" required="required" id="username"
                   placeholder="请输入用户名">
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-4 control-label">密码</label>
        <div class="col-sm-3">
            <input type="password" class="form-control" name="password" required="required" id="password"
                   placeholder="请输入密码">
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-4 control-label">请计算:
        <jsp:include page="/Security" flush="true"></jsp:include>=</label>
        <div class="col-sm-3">
            <input type="password" class="form-control" name="security" required="required" id="security"
                   placeholder="请输入验证码">
        </div>
    </div>


    <%--<label for="sex">默认的复选框和单选按钮的实例</label>--%>
    <%--<div class="checkbox">--%>
    <%--<label><input type="checkbox" value="male" checked="checked">男</label>--%>
    <%--</div>--%>
    <%--<div class="checkbox">--%>
    <%--<label><input type="checkbox" value="female">女</label>--%>
    <%--</div>--%>


    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-3">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> 请记住我
                </label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-3">
            <button type="submit" class="btn btn-block">登录</button>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-3">
            <a href="register.jsp" class="a">立即注册</a>
        </div>
    </div>
    
</form>
<br/><br/>
<jsp:include page="footer.jsp" flush="true"></jsp:include>
</body>
</html>