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
    <!--模块标题-->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">网站概况</h1>
        </div>
    </div>
    <!--网站用户数与评论数-->
    <div class="row">
        <div class="col-xs-12 col-md-6 col-lg-3">
            <div class="panel panel-orange panel-widget">
                <div class="row no-padding">
                    <div class="col-sm-3 col-lg-5 widget-left">
                        <em class="glyphicon glyphicon-comment glyphicon-l"></em>
                    </div>
                    <div class="col-sm-9 col-lg-7 widget-right">
                        <div class="large">${commentCount}</div>
                        <div class="text-muted">评论数</div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-xs-12 col-md-6 col-lg-3">
            <div class="panel panel-teal panel-widget">
                <div class="row no-padding">
                    <div class="col-sm-3 col-lg-5 widget-left">
                        <em class="glyphicon glyphicon-user glyphicon-l"></em>
                    </div>
                    <div class="col-sm-9 col-lg-7 widget-right">
                        <div class="large">${userCount}</div>
                        <div class="text-muted">用户数</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <table width="573" border="0" cellpadding="0" cellspacing="0">
            <td valign="middle">
                <table border="0" align="center" cellpadding="0" cellspacing="0" style="width: 700px;height: 400px;margin-left: 13px">
                    <tr style="margin-top: 5px">
                        <td width="81" height="88"><a href="/view/movie"><img src="../../resources/images/article.jpg" width="81"
                                                           height="72"></a></td>
                        <td width="140" height="88"><a href="/view/movie" > 电影管理</a><br>
                            <span class="style4">这里提供最方便的方式来管理电影，由你选择。</span></td>
                        <td width="81"><a href="/view/comment"><img src="../../resources/images/review.jpg" width="81" height="72"></a></td>
                        <td width="140"><a href="/view/comment" >影评管理</a><br>
                            <span class="style4">这里提供最方便的方式来管理影评，由你选择。</span></td>
                    </tr>
                    <tr>
                        <td height="76"><a href="/view/advance"><img src="../../resources/images/photo.jpg" width="81" height="72"></a></td>
                        <td width="140" height="88"><a href="/view/advance" >预告片管理</a><br>
                            <span class="style4">这里提供最方便的方式来上传你的照片，由你选择。</span></td>
                        <td><a href="/view/poster"><img src="../../resources/images/vote.jpg" width="81" height="72"></a></td>
                        <td width="140"><a href="/view/poster" >海报管理</a><br>
                            <span class="style4">这里提供最方便的方式来设置你自己的个人信息，由你选择。</span></td>
                    </tr>
                    <tr>
                        <td height="74"><a href="/view/advance"><img
                                src="../../resources/images/manager.jpg" width="81" height="72"></a></td>
                        <td width="140" height="88"><a href="/view/advance" >公告管理</a><br>
                            <span class="style4">这里提供最方便的方式来管理公告，由你选择。</span></td>
                        <td><a href="/view/user"><img src="../../resources/images/friend.jpg" width="81"
                                                              height="72"></a></td>
                        <td width="140"><a href="/view/user" >用户管理</a><br>
                            <span class="style4">这里提供最方便的方式来管理用户，由你选择。</span></td>
                    </tr>
                </table>
            </td>
            </tr>
        </table>
    </div>
</div>
</body>

</html>
