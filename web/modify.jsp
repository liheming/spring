<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@page import="java.util.List"%>
<%@page import="tools.Common"%>
<%@page import="java.util.HashMap"%>
<%@page import="jdbc.SQLConstant"%>
<%@page import="jdbc.JDBCOption"%>
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
<%! String  username,password,authority, email,sex; int id; %>
	<%
	
	username  = request.getParameter("username");
	List<?>  list = JDBCOption.query(SQLConstant.getUserByName, username);
	if (list.size() > 0) {
		HashMap hashMap = (HashMap) list.get(0);
    	  id = Integer.parseInt(String.valueOf(hashMap.get("id")));
		 password = (String)hashMap.get("password");
		 authority = (String)hashMap.get("authority");
		 email = (String)hashMap.get("email");
		 sex = (String)hashMap.get("sex");
	}
		

	%>
	<script>
	</script>

<form class="form-horizontal" name="form1" id="form1" role="form" action="<%= request.getContextPath() %>/Modify"  method="get" >
    
      <div class="form-group">
        <label for="username" class="col-sm-4 control-label">id</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="id" id="id" 
                    value="<%=id%> ">
        </div>
    </div>
    
    <div class="form-group">
        <label for="username" class="col-sm-4 control-label">用户名</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="username" id="username" 
              value="<%  //String user= (String) session.getAttribute("username"); 
        		out.print(username);%> ">
        </div>
    </div>
    
    

    
    
    
    <div class="form-group">
        <label for="password" class="col-sm-4 control-label">新密码</label>
        <div class="col-sm-3">
            <input type="password" class="form-control" value="<%=password %> name="password"  id="password"
                   placeholder="请输入密码!">
        </div>
    </div>
s

    <div class="form-group">
        <label for="confirmpassword" class="col-sm-4 control-label">确认新密码</label>
        <div class="col-sm-3">
            <input type="password" class="form-control" value="<%=password %> name="confirmpassword"  id="confirmpassword"
                   placeholder="请再次输入密码!">
        </div>
    </div>


    <div class="form-group">
        <label for="email" class="col-sm-4 control-label">新邮箱</label>
        <div class="col-sm-3">
            <input type="email" class="form-control" value="<%=email %> " name="email" id="email"
                   placeholder="请输入邮箱!">
        </div>
    </div>

    <div class="form-group">
        <label for="email" class="col-sm-4 control-label">请计算:
        <jsp:include page="/Security" flush="true"></jsp:include>=
            
        </label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="security"
                   placeholder="请输入正确的验证码">
        </div>
    </div>

    <div class="form-inline">
        <div class="col-sm-offset-4 col-sm-3">
            <div class="radio">
                <label>
                    <input class="radio" type="radio" name="sex" id="optionsRadios1"
                           value="0" checked="checked">男
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" class="radio" name="sex" id="optionsRadios2"
                           value="1">
                    女
                </label>
            </div>
        </div>
    </div>


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
            <button type="submit" onclick="check()" class="btn btn-block">确定修改</button>
        </div>
    </div>
    
</form>

<script>
    function check() {
        if (password.value != confirmpassword.value) {
            alert("两次输入的密码不一致!!!!!!!");
            return;
        }
   

    }

</script>


<br/><br/>
<jsp:include page="footer.jsp" flush="true"></jsp:include>
</body>
</html>