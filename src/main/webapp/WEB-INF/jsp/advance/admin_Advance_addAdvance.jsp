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
    <%--预告片添加--%>
    <div class="row" style="margin-top: 80px">
        <form method="post" action="/admin/addAdvance" >
            <table class="layui-table" style="background-color: #92B8B1">
                <tr>
                    <td>电影名称</td>
                    <td>电影简介</td>
                    <td>预告片视频地址</td>
                    <td>上映时间</td>
                    <td>操作</td>
                </tr>
                <tr>
                    <td><select name="MovieId">
                        <c:forEach items="${advanceNullList}" var="advanceNull">
                            <option value="${advanceNull.movieId}">${advanceNull.movieName}</option>
                        </c:forEach>
                    </select></td>
                    <td><textarea class="layui-textarea" required="required" name="Content" placeholder="请输入电影简介"></textarea></td>
                    <td><input name="AudioAddress" required="required" class="layui-input" placeholder="请输入视频地址"></td>
                    <td><input type="date" class="layui-input" required="required" name="ShowTime"></td>
                    <td>
                        <button class="layui-btn layui-btn-sm">添加</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>
