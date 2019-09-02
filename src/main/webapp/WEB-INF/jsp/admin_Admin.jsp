<%@ page contentType="text/html;charset=UTF-8"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="public_top.jsp"%>
<%@include file="public_left.jsp"%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>欢迎您</title>
    <link href="../../resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../resources/css/datepicker3.css" rel="stylesheet">
    <link href="../../resources/css/styles.css" rel="stylesheet">
    <link href="../../resources/layui/css/layui.css" rel="stylesheet">
    <script src="../../resources/js/respond.min.js"></script>
    <script src="../../resources/layui/layui.all.js"></script>
</head>

<body>
<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
    <!--面包屑导航-->
    <div class="row">
        <ol class="breadcrumb">
            <li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
            <li class="active">网站概况</li>
        </ol>
    </div>
    <%--管理员设置--%>
    <div class="row">
        <table class="layui-table" style="background-color: #92B8B1">
            <tr>
                <td>Id</td>
                <td>账号</td>
                <td>密码<i class="layui-icon layui-icon-edit"/></td>
                <td>登陆次数</td>
                <td>操作</td>
            </tr>
                <form action="${pageContext.request.contextPath}/admin/updateAdmin?adminName=${admin.userName}" method="post">
                    <tr>
                        <td>${admin.id}</td>
                        <td>${admin.userName}</td>
                        <td><input type="text" name="Pwd" value="${admin.pwd}" class="layui-input" required="required"></td>
                        <td>${admin.logCount}</td>
                        <td>
                            <button class="layui-btn layui-btn-sm">修改密码</button>
                        </td>
                    </tr>
                </form>
        </table>
    </div>

</div>
</body>
</html>
