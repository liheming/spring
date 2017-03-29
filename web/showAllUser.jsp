<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" xmlns:jsp="http://www.w3.org/2001/XInclude">
<jsp:directive.page import="jdbc.SQLConstant" />
<jsp:directive.page import="java.util.HashMap" />
<jsp:directive.page import="jdbc.JDBCOption" />
<jsp:directive.page import="java.util.List" />

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
<script>
        function  doDel(id) {
            if (confirm("确定要删除吗?")) {
                window.location = "deleteUser.jsp?id="+id;
            }
        }
    </script>
</head>
<body>
	<jsp:include page="nav_head.jsp" flush="true"></jsp:include>
	<div style="margin: 50px 100px">
		<table class="table table-striped" style="">
			<caption>所有用户列表</caption>
			<thead>
				<tr>
					<th>用户名</th>
					<th>邮箱</th>
					<th>注册时间</th>
					<th>删除和编辑</th>
				</tr>
	
			</thead>
			<tbody>
				<jsp:include page="/ShowAllUser" flush="true"></jsp:include>

			</tbody>
		</table>
	</div>



	<jsp:include page="footer.jsp" flush="true"></jsp:include>
</body>
</html>