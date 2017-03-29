<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>注册页面</title>
<link rel="stylesheet" href="css/bootstrap.css">
<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#myDefaultNavbar1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">Haily &amp; Sun</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="myDefaultNavbar1">
				<ul class="nav navbar-nav">
					<li><a href="#">首页</a></li>
					<li class=""><a href="#">联系 <span class="sr-only">(current)</span></a></li>
					<li><a href="#">关于</a></li>



				</ul>
				<form class="navbar-form navbar-right" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="请输入关键字">
					</div>
					<button type="submit" class="btn btn-default">搜索</button>
					<% String sessname= (String)session.getAttribute("username")  ; if(sessname!=null){ %>
 
					<a href="modify.jsp" style=" margin: 0 10px;" ><%=sessname %></a> <a href="loginOut.jsp" style=" margin: 0 10px;">注销</a>
					<a href="showAllUser.jsp">浏览所有用户</a>
					<% } else {%>
					<a href="login.jsp" style=" margin: 0 20px;">登录</a>
					<%} %>
					<a href="vip.jsp" style=" margin: 0 20px;">vip</a>
				</form>	
			</div>

			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
</body>
</html>
