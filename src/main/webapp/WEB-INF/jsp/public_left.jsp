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
<!--侧边导航栏-->
<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
    <form role="search">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="搜索">
        </div>
    </form>
    <ul class="nav menu">
        <li><a href="/view/main"><span class="glyphicon glyphicon-dashboard"></span> 网站概况</a></li>
        <li class="parent ">
            <a href="/view/movie">
                <span class="glyphicon glyphicon-list"></span>电影管理
                <span data-toggle="collapse" href="#sub-item-1"
                      class="icon pull-right"><em
                        class="glyphicon glyphicon-s glyphicon-plus"></em></span>
            </a>
            <ul class="children collapse" id="sub-item-1">
                <li>
                    <a href="/view/movie_add">
                        <span class="glyphicon glyphicon-share-alt"></span> 电影添加
                    </a>
                </li>
                <li>
                    <a href="/view/movie_type">
                        <span class="glyphicon glyphicon-share-alt"></span> 电影类型
                    </a>
                </li>
            </ul>
        </li>
        <li class="parent ">
            <a href="/view/advance">
                <span class="glyphicon glyphicon-list"></span> 预告片管理 <span data-toggle="collapse" href="#sub-item-2"
                                                                           class="icon pull-right"><em
                    class="glyphicon glyphicon-s glyphicon-plus"></em></span>
            </a>
            <ul class="children collapse" id="sub-item-2">
                <li>
                    <a href="/view/advance">
                        <span class="glyphicon glyphicon-share-alt"></span> 预告片设置
                    </a>
                </li>
                <li>
                    <a href="/view/advance_add">
                        <span class="glyphicon glyphicon-share-alt"></span> 预告片添加
                    </a>
                </li>
            </ul>
        </li>
        <li class="parent ">
            <a href="/view/comment">
                <span class="glyphicon glyphicon-list"></span> 影评管理 <span data-toggle="collapse" href="#sub-item-3"
                                                                          class="icon pull-right"><em
                    class="glyphicon glyphicon-s glyphicon-plus"></em></span>
            </a>
            <ul class="children collapse" id="sub-item-3">
                <li>
                    <a href="/view/comment">
                        <span class="glyphicon glyphicon-share-alt"></span> 影评设置
                    </a>
                </li>
                <li>
                    <a href="/view/comment_add">
                        <span class="glyphicon glyphicon-share-alt"></span> 影评添加
                    </a>
                </li>
            </ul>
        </li>
        <li class="parent ">
            <a href="/view/poster">
                <span class="glyphicon glyphicon-list"></span> 海报管理 <span data-toggle="collapse" href="#sub-item-4"
                                                                          class="icon pull-right"><em
                    class="glyphicon glyphicon-s glyphicon-plus"></em></span>
            </a>
            <ul class="children collapse" id="sub-item-4">
                <li>
                    <a href="/view/poster_add">
                        <span class="glyphicon glyphicon-share-alt"></span> 海报添加
                    </a>
                </li>
                <li>
                    <a href="/view/poster">
                        <span class="glyphicon glyphicon-share-alt"></span> 海报设置
                    </a>
                </li>
            </ul>
        </li>
        <li class="parent ">
            <a href="/view/user">
                <span class="glyphicon glyphicon-list"></span> 用户管理
            </a>
        </li>
        <li><a href="/view/admin"><span class="glyphicon glyphicon-user"></span> 管理员设置</a></li>
    </ul>

</div>
</body>
</html>
