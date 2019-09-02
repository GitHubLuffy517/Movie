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
    <%--电影添加--%>
    <div class="row" style="margin-top: 80px">
        <form method="post" action="/admin/addMovie" enctype="multipart/form-data">
            <table class="layui-table" style="background-color: #92B8B1">
                <tr>
                    <td>电影名称</td>
                    <td>电影类型</td>
                    <td>导演</td>
                    <td>主演</td>
                    <td>是否投票</td>
                    <td>上传图片</td>
                    <td>操作</td>
                </tr>
                <tr>
                    <td><input type="text" class="layui-input" placeholder="请输入电影名称" name="movieName"
                               required="required"></td>
                    <td><select name="typeId">
                        <c:forEach items="${typeList}" var="type">
                            <option value="${type.typeId}">${type.typeName}</option>
                        </c:forEach>
                    </select></td>
                    <td><input type="text" class="layui-input" placeholder="请输入导演" name="daoYan" required="required">
                    </td>
                    <td><input type="text" class="layui-input" placeholder="请输入主演" name="zhuYan" required="required">
                    </td>
                    <td><select name="vote">
                        <option value="是">&nbsp;是&nbsp;&nbsp;&nbsp;</option>
                        <option value="否">&nbsp;否</option>
                    </select></td>
                    <td><input name="photo" type="file" size="30" required="required"></td>
                    <td>
                        <button class="layui-btn layui-btn-sm">添加</button>
                    </td>
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
    <c:when test="${msg=='movie_repeat'}">
        <script>
            alert("该电影已存在")
        </script>
    </c:when>
</c:choose>
</body>
</html>
