<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <form role="search">
        <table class="layui-table">
            <tr>
                <td><input class="layui-input" placeholder="请输入要搜索的用户名" name="MovieName"></td>
                <td><input class="layui-input" placeholder="请输入要搜索的用户电话" name="CommentUser"></td>
                <td><button class="layui-btn layui-btn-sm">搜索<i class="layui-icon layui-icon-search"></i></button></td>
            </tr>
        </table>
    </form>
    <%--用户设置--%>
    <div class="row">
        <table class="layui-table" style="background-color: #92B8B1">
            <tr>
                <td>用户名</td>
                <td>用户密码<i class="layui-icon layui-icon-edit"/></td>
                <td>电话<i class="layui-icon layui-icon-edit"/></td>
                <td>QQ<i class="layui-icon layui-icon-edit"/></td>
                <td>邮箱<i class="layui-icon layui-icon-edit"/></td>
                <td>性别</td>
                <td>注册时间</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${userList}" var="user">
                <form action="/admin/updateUser?MemberId=${user.memberId}" method="post">
                <tr>
                    <td>${user.userName}</td>
                    <td><input value="${user.userPwd}" required="required" name="UserPwd" class="layui-input" type="text"></td>
                    <td><input value="${user.tel}" required="required" name="Tel" class="layui-input" type="number"></td>
                    <td><input value="${user.QQ}" required="required" name="QQ" class="layui-input" type="number"></td>
                    <td><input value="${user.email}" required="required" name="Email" class="layui-input" type="email"></td>
                    <td>${user.sex}</td>
                    <td>${user.regTime}</td>
                    <td>
                        <button class="layui-btn layui-btn-sm">更新</button>
                        <button class="layui-btn layui-btn-sm layui-btn-danger"><a
                                href="/admin/deleteUser?MemberId=${user.memberId}">删除</a></button>
                    </td>
                </tr>
                </form>
            </c:forEach>
        </table>
    </div>

</div>
</body>
</html>
