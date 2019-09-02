<%--
  Created by IntelliJ IDEA.
  User: 目光
  Date: 2019/7/30
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>管理员登陆</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <link rel="stylesheet" href="../../resources/css/main.css">
</head>
<body>
<script type="text/javascript" src="../../resources/js/loginValidate.js"></script>

<div class="login">
    <h1>登陆</h1>
    <form method="post" action="/admin_Login" >
        <input type="text" name="adminName" placeholder="请输入管理员用户名" required="required" id="username"/><span id="msg" style="color: red"></span>
        <input type="password" name="adminPass" placeholder="请输入管理员密码" required="required"/>
        <button type="submit" class="btn btn-primary btn-block btn-large">登陆</button>
    </form>
</div>
</body>
<c:choose>
    <c:when test="${msg=='n'}">
        <script>
            alert("登陆失败，请检查用户名或密码")
        </script>
    </c:when>
</c:choose>

</html>
