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
    <title>Inicial</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/vendor/bootstrap/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/game.css"/>
    <!--<link href="/WEB-INF/pages/boostrap/css/game.css" rel="stylesheet" type="text/css" media="screen" />-->

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" >NewEducation</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/game">Inicial</a></li>
                <li><a href="${pageContext.request.contextPath}/about">Sobre</a></li>
                <li><a href="${pageContext.request.contextPath}/developer">Desevolvedor</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="active" ><a class="btn btn-success btn-sm" style="background-color: #00E604" href="${pageContext.request.contextPath}/">Sair</a></li>
            </ul>
        </div>
    </div>
</div>

</body>
</html>
