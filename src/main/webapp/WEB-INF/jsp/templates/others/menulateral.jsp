<%--
  Created by IntelliJ IDEA.
  User: glaucia
  Date: 10/08/14
  Time: 01:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="btn-group-vertical" role="toolbar">
    <div class="btn-group  btn-group-justified">
        <button type="button" class="btn btn-success btn-lg dropdown-toggle" data-toggle="dropdown">
            Escolas <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu">
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/school/add">
                    Nova Escola</a></li>
            <li role="presentation" class="divider"></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/school">
                    Escolas</a></li>
        </ul>
    </div>
    <div class="btn-group  btn-group-justified">
        <button type="button" class="btn btn-success btn-lg dropdown-toggle" data-toggle="dropdown">
            Questões <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu">
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaeone/add">
                    Nova Questão FAE1</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaetwo/add">
                    Nova Questão FAE2</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaethree/add">
                    Nova Questão FAE3</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaefour/add">
                    Nova Questão FAE4</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaefive/add">
                    Nova Questão FAE5</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaesix/add">
                    Nova Questão FAE6</a></li>
            <li role="presentation" class="divider"></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaeone">
                    Questões FAE1</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaetwo">
                    Questões FAE2</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaethree">
                    Questões FAE3</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaefour">
                    Questões FAE4</a></li>
            <li role="presentation">
                   <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaefive">
                        Questões FAE5</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaesix">
                    Questões FAE6</a></li>
        </ul>
    </div>
    <div class="btn-group  btn-group-justified">
        <button type="button" class="btn btn-success btn-lg dropdown-toggle" data-toggle="dropdown">
            Usuários <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu">
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/player/add">
                    Novo Estudante</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/user/add">
                    Novo Educador</a></li>
            <li role="presentation" class="divider"></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/player">
                    Estudantes</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/user">
                    Educadores</a></li>
        </ul>
    </div>

    <div class="btn-group  btn-group-justified">
        <button type="button" class="btn btn-success btn-lg dropdown-toggle" data-toggle="dropdown">
            Resultados <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu">
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/game">
                    Resultados</a></li>
        </ul>
    </div>

</div>

