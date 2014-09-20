<%--
  Created by IntelliJ IDEA.
  User: glaucia
  Date: 10/08/14
  Time: 01:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container-fluid panel-body">
    <div class="row">
        <div class="col-md-8 col-sm-8 col-md-offset-2 col-sm-offset-2 main">
            <h1 class="page-header">${title}</h1>

            <div class="row placeholders">
                <div class="col-md-12 col-sm-12 pager">
                    <div class="row">
                        <form role="form" id="userAdd" method="post" modelAtribute="modelplayer">
                            <input type="hidden" name="idPlayer" value="${player.idPlayer}" >
                            <input type="hidden" name="idUser" value="${player.idUser}" >
                            <div class="form-horizontal" role="form">
                                <label for="namestudent" class="col-sm-2 control-label">Nome do Aluno</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <input name="name" type="text" class="form-control" id="namestudent"
                                           placeholder="Digite aqui o nome" value="${player.name}">
                                </div>
                            </div>
                            <div class="form-horizontal" role="form">
                                <label for="loginstudent" class="col-sm-2 control-label">Login</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <input name="login" type="text" class="form-control" id="loginstudent"
                                           placeholder="Digite aqui o login" value="${player.login}">
                                </div>
                            </div>

                            <div class="form-horizontal" role="form">
                                <label for="passwordstudent" class="col-sm-2 control-label">Senha</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <input name="password" type="password" class="form-control" id="passwordstudent"
                                           placeholder="Digite aqui a senha" value="${player.password}">
                                </div>
                            </div>
                                <div class="form-horizontal" id="datetimepicker">
                                    <label for="datestudent" class="col-sm-2 control-label">Data de Nascimento</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <input name="dateOfBirth" type="datetime" class="form-control" id="datestudent"
                                           value="${player.dateOfBirth}" placeholder="dd/mm/aaa">
                                </div>
                                </div>
                                <div class="form-horizontal" role="form">
                                    <label for="genderstudent" class="col-sm-2 control-label">Sexo</label>

                                    <div class="col-sm-10" style="padding-bottom: 25px;">
                                        <select name="gender" class="form-control" id="genderstudent" >
                                            <option value="${player.gender}">${player.gender.valor}</option>
                                            <c:forEach var="item" items="${genders}">
                                                <option value="${item}">${item.valor}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <c:if test="${!empty player.listSchool}">
                                    <table class="table table-bordered">
                                        <thead>
                                            <tr class="success">
                                                <td>Escola</td>
                                                <td>Classe</td>
                                                <td>Ano</td>
                                                <td>Ação</td>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="item" items="${player.listSchool}" >
                                                <tr class="active">
                                                    <td>${item.school.title}</td>
                                                    <td>${item.classe}</td>
                                                    <td>${item.yearClasse}</td>
                                                    <td>
                                                        <a class="btn btn-warning" href="${pageContext.request.contextPath}/player/edit${item.id}">Editar</a>
                                                        <a class="btn btn-danger" href="${pageContext.request.contextPath}/player/delete${item.id}">Deletar</a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </c:if>

                                        <button type="submit" class="btn btn-info">Salvar</button>
                                        <a class="btn btn-info" href="${pageContext.request.contextPath}/player">Voltar</a>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

