<%--
  Created by IntelliJ IDEA.
  User: glaucia
  Date: 09/08/14
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Header</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="" version="2.0">
    <title>New Education</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/vendor/bootstrap/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/game.css"/>
    <!--<link href="/WEB-INF/pages/boostrap/css/game.css" rel="stylesheet" type="text/css" media="screen" />-->

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" >NewEducation</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/home">Inicial</a></li>
            </ul>
                <a class="btn btn-success navbar-left" href="${pageContext.request.contextPath}/">Sair</a>
        </div>
    </div>
</div>

</body>
</html>
