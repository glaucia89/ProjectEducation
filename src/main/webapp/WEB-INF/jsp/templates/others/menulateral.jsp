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
                    Adicionar Nova Escola</a></li>
            <li role="presentation" class="divider"></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/school">
                    Listar Escolas</a></li>
        </ul>
    </div>
    <div class="btn-group  btn-group-justified">
        <button type="button" class="btn btn-success btn-lg dropdown-toggle" data-toggle="dropdown">
            Questões <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu">
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaeone/add">
                    Adicionar Nova Questão FAE1</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaetwo/add">
                    Adicionar Nova Questão FAE2</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaethree/add">
                    Adicionar Nova Questão FAE3</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaefour/add">
                    Adicionar Nova Questão FAE4</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaefive/add">
                    Adicionar Nova Questão FAE5</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaesix/add">
                    Adicionar Nova Questão FAE6</a></li>
            <li role="presentation" class="divider"></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaeone">
                    Listar Questões FAE1</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaetwo">
                    Listar Questões FAE2</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaethree">
                    Listar Questões FAE3</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaefour
                   Listar Questões FAE4</a></li>
                   <li role="presentation">
                   <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaefive">
                        Listar Questões FAE5</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/questionfaesix">
                    Listar Questões FAE6</a></li>
        </ul>
    </div>
    <div class="btn-group  btn-group-justified">
        <button type="button" class="btn btn-success btn-lg dropdown-toggle" data-toggle="dropdown">
            Usuarios <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu">
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/player/add">
                    Adicionar Novo Estudante</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/admin/add">
                    Adicionar Novo Educador</a></li>
            <li role="presentation" class="divider"></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/player">
                    Listar Estudantes</a></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="${pageContext.request.contextPath}/admin">
                    Listar Educadores</a></li>
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

