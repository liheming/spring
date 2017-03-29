<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <%--<title>注册页面</title>--%>
    <link rel="stylesheet" href="css/bootstrap.css">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>


</head>
<body>

<div class="section well">
    <div class="container">
        <div class="row">
            <div class="col-lg-4 col-md-4">
                <h3 class="text-center">WHO I AM</h3>
                <h5></h5>
            </div>
            <div class="col-lg-4 col-md-4">
                <h3 class="text-center">GET IN TOUCH</h3>
                <address class="text-center">
                    <strong>hemingli.cn, Inc.</strong><br>

                    Email:1325789491@qq.com<br>
                    <abbr title="Phone">Phone:</abbr> 18942433927
                </address>
            </div>
            <div class="col-lg-4 col-md-4">
                <h3 class="text-center">匿名留言</h3>
                <form method="post" action="/anonymous">
                    <div class="form-group col-lg-9 col-md-8 col-sm-10 col-xs-10">
                        <input name="anonymous" type="text" required="required" class="form-control" id="exampleInputEmail1"
                               placeholder="你不吐槽两句么^_^">
                    </div>
                    <button type="submit" class="btn btn-default">提交<br>
                    </button>
                </form>
            </div>
        </div>
    </div>
</div>

<footer class="text-center glyphicon-folder-open ">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <a href="index.jsp"> © hemingli.cn.2016 版权所有.</a>
            </div>
            <div class="col-xs-12">
                <a href=http://www.miitbeian.gov.cn/publish/query/indexFirst.action target=_blank><i></i>粤ICP备16035498号</a>
            </div>
        </div>
    </div>
</footer>

</body>
</html>
