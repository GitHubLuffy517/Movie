<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../public_top.jsp"%>
<%@include file="../public_left.jsp"%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>欢迎您</title>
    <link href="../../../resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../../resources/css/datepicker3.css" rel="stylesheet">
    <link href="../../../resources/css/styles.css" rel="stylesheet">
    <link href="../../../resources/layui/css/layui.css" rel="stylesheet">
    <script src="../../../resources/js/respond.min.js"></script>
    <script src="../../../resources/layui/layui.all.js"></script>
</head>

<body>

<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
    <%--影评添加--%>
    <div class="row" style="margin-top: 80px">
        <div class="col-lg-12">
            <h1 class="page-header">发表影评</h1>
        </div>
        <form method="post" action="/admin/addComment" enctype="multipart/form-data">
            <table class="layui-table" style="background-color: #92B8B1">
                <tr>
                    <td>影评标题</td>
                    <td>电影名称</td>
                    <td>影评内容</td>
                    <td>影评作者</td>
                    <td>操作</td>
                </tr>
                <form method="post" action="/admin/addComment">
                    <tr>
                        <td><input class="layui-input" placeholder="请输入影评标题" required="required" name="commentTitle">
                        </td>
                        <td><select name="movieId">
                            <c:forEach items="${infoList}" var="info">
                                <option value="${info.movieId}">${info.movieName}</option>
                            </c:forEach>
                        </select></td>
                        <td><textarea class="layui-textarea" name="commentContent" required="required" placeholder="请输入影评内容"></textarea></td>
                        <td><input class="layui-input" required="required" name="commentAuthor" placeholder="请输入影评作者"></td>
                        <td>
                            <button class="layui-btn layui-btn-sm">添加</button>
                        </td>
                    </tr>
                </form>
            </table>
        </form>
    </div>
</div>
</body>
</html>
