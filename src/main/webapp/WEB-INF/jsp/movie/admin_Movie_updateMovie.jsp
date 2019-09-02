
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../public_top.jsp" %>
<%@include file="../public_left.jsp" %>
<html>
<head>
    <title>欢迎您</title>
    <link href="../../../resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../../resources/css/bootstrap-table.css" rel="stylesheet">
    <link href="../../../resources/css/datepicker3.css" rel="stylesheet">
    <link href="../../../resources/css/styles.css" rel="stylesheet">
    <link href="../../../resources/layui/css/layui.css" rel="stylesheet">
    <script src="../../../resources/js/respond.min.js"></script>
    <script src="../../../resources/layui/layui.all.js"></script>
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
                <td><input class="layui-input" placeholder="请输入要搜索的电影关键字" name="MovieName"></td>
                <td><select name="typeId">
                    <c:forEach items="${typeList}" var="type">
                        <option value="${type.typeId}">${type.typeName}</option>
                    </c:forEach>
                </select></td>
                <td><input class="layui-input" placeholder="请输入要搜索的电影主演" name="ZhuYan"></td>
                <td><button class="layui-btn layui-btn-sm">搜索<i class="layui-icon layui-icon-search"></i></button></td>
            </tr>
        </table>
    </form>
    <%--电影设置--%>
    <div class="row">
        <table class="layui-table" style="background-color: #92B8B1">
            <tr>
                <td>电影名称</td>
                <td>电影类型<i class="layui-icon layui-icon-edit"/></td>
                <td>导演<i class="layui-icon layui-icon-edit"/></td>
                <td>主演<i class="layui-icon layui-icon-edit"/></td>
                <td>是否投票<i class="layui-icon layui-icon-edit"/></td>
                <td>操作</td>
            </tr>
            <c:forEach items="${infoList}" var="movie">
                <form action="/admin/updateMovie?id=${movie.movieId}" method="post">
                    <tr>
                        <td><input class="layui-input" value="${movie.movieName}" readonly="readonly" name="movieName">
                        </td>
                        <td>
                        <select name="typeId">
                            <option value="${movie.typeId}" disabled selected hidden>${typeMap.containsKey(movie.typeId)?typeMap.get(movie.typeId):'无类型'}</option>
                            <c:forEach items="${typeList}" var="type">
                                <option value="${type.typeId}">${type.typeName}</option>
                            </c:forEach>
                        </select>
                        </td>
                        <td><input class="layui-input" value="${movie.daoYan}" required="required" name="daoYan"></td>
                        <td><input class="layui-input" value="${movie.zhuYan}" required="required" name="zhuYan"></td>
                        <td><input class="layui-input" value="${movie.vote}" required="required" name="vote"></td>
                        <td>
                            <button class="layui-btn layui-btn-sm">更新</button>
                            <button class="layui-btn layui-btn-sm layui-btn-danger"><a
                                    href="/admin/deleteMovie?id=${movie.movieId}">删除</a></button>
                        </td>
                    </tr>
                </form>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
