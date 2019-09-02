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
    <%--海报添加--%>
    <div class="row" style="margin-top: 80px" >
        <form method="post" action="/admin/addPoster" enctype="multipart/form-data">
        <table class="layui-table" style="background-color: #92B8B1">
            <tr>
                <td>电影名称</td>
                <td>海报描述</td>
                <td>选择海报</td>
                <td>操作</td>
            </tr>
            <tr>
                <td><select name="MovieId">
                    <c:forEach items="${infoList}" var="info">
                        <option value="${info.movieId}">${info.movieName}</option>
                    </c:forEach>
                </select></td>
                <td><input class="layui-input" required="required" placeholder="请输入海报描述" name="PostDescription"></td>
                <td><input name="photo" type="file" size="30" required="required"></td>
                <td><button class="layui-btn layui-btn-sm">添加</button></td>
            </tr>
        </table>
        </form>
    </div>
</div>
<c:choose>
    <c:when test="${msg=='failure'}">
        <script>
            alert("请选择jpg格式文件上传")
        </script>
    </c:when>
</c:choose>
</body>
</html>
