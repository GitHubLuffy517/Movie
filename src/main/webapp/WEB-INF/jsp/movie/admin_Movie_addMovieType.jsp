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
    <%--展示操作类型--%>
    <div class="row" style="margin-top: 80px">
        <table class="layui-table" style="background-color: #92B8B1">
            <tr>
                <td>类型ID</td>
                <td>类型名</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${typeList}" var="type">
                <tr>
                    <td>${type.typeId}</td>
                    <td>${type.typeName}</td>
                    <td>
                        <button class="layui-btn layui-btn-sm layui-btn-danger"><a
                                href="/admin/deleteType?typeId=${type.typeId}">删除</a></button>
                    </td>
                </tr>
            </c:forEach>
            <form action="/admin/addType" method="post">
                <tr>
                    <td><b style="font-size: large">类型添加</b></td>
                    <td><input placeholder="请输入类型名" class="layui-input" name="typeName" required="required"></td>
                    <td>
                        <button class="layui-btn layui-btn-sm">添加</button>
                    </td>
                </tr>

            </form>
        </table>
    </div>
</div>
<c:choose>
    <c:when test="${msg=='type_repeat'}">
        <script>
            alert("该类型已存在")
        </script>
    </c:when>
</c:choose>

</body>
</html>
