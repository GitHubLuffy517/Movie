<%--
  Created by IntelliJ IDEA.
  User: 目光
  Date: 2019/8/25
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎您</title>
    <link href="../../resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../resources/css/datepicker3.css" rel="stylesheet">
    <link href="../../resources/css/styles.css" rel="stylesheet">
    <link href="../../resources/layui/css/layui.css" rel="stylesheet">
</head>
<body>
<!--顶部-->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/view/main"><span>Movie</span>Admin</a>
            <ul class="user-menu">
                <li class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span
                            class="glyphicon glyphicon-user"></span> 欢迎您！ ${adminName} <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="/view/admin"><span class="glyphicon glyphicon-user"></span> 修改密码</a></li>
                        <li><a href="/logoutAdmin"><span class="glyphicon glyphicon-log-out"></span> 退出</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<script src="../../resources/js/jquery-1.11.1.min.js"></script>
<script src="../../resources/js/bootstrap.min.js"></script>
<script src="../../resources/js/chart.min.js"></script>
<script src="../../resources/js/chart-data.js"></script>
<script src="../../resources/js/easypiechart.js"></script>
<script src="../../resources/js/easypiechart-data.js"></script>
<script src="../../resources/js/bootstrap-datepicker.js"></script>
<script>
    $('#calendar').datepicker({});

    !function ($) {
        $(document).on("click", "ul.nav li.parent > a > span.icon", function () {
            $(this).find('em:first').toggleClass("glyphicon-minus");
        });
        $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
    }(window.jQuery);

    $(window).on('resize', function () {
        if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
    })
    $(window).on('resize', function () {
        if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
    })
</script>
</body>
</html>
