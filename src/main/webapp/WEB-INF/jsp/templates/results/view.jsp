<%-- 
    Document   : view
    Created on : 28/09/2014, 11:50:25
    Author     : glaucia
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
                        <table class="table table-bordered">
                            <tr class="success">
                                <td>Nome</td>
                                <td>${player.name}</td>
                            </tr>
                            <tr class="active">
                                <td>Data de Nascimento</td>
                                <td>${player.dateOfBirth}</td>
                            </tr>
                            <tr class="active">
                                <td>Sexo</td>
                                <td>${player.gender.valor}</td>
                            </tr>
                        </table>


                        <table class="table table-bordered">
                            <thead>
                                <tr class="success">
                                    <td>Escola</td>
                                    <td>Ano</td>
                                    <td>Classe</td>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="item" items="${player.listSchool}" >
                                    <c:if test="${!empty item}">
                                        <tr class="active">
                                            <td>${item.fkSchool.title}</td>
                                            <td>${item.yearClasse}</td>
                                            <td>${item.classe}</td>
                                        </tr>
                                    </c:if>
                                </c:forEach>
                            </tbody>
                        </table>
                        <table class="table table-bordered">
                            <thead>
                                <tr class="success">
                                    <td>Habilidade</td>
                                    <td>level</td>
                                    <td>Data da criação</td>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="item" items="${player.listStandart}" >
                                    <c:if test="${!empty item}">
                                        <tr class="active">
                                            <td>${item.hability.valor}</td>
                                            <td>${item.difficulty}</td>
                                            <td>${item.creationDate}</td>
                                        </tr>
                                    </c:if>
                                </c:forEach>
                            </tbody>
                        </table>
                        <table class="table table-bordered">
                            <thead>
                                <tr class="success">
                                    <td>Habilidate</td>
                                    <td>Porcentagem de Acertos</td>
                                </tr>
                            </thead>
                            <tbody>
                                <tr class="active">
                                    <td>${ALITERACAO}</td>
                                    <td>${player_ALITERACAO}</td>
                                </tr>
                                <tr class="active">
                                    <td>${RIMA}</td>
                                    <td>${player_RIMA}</td>
                                </tr>
                                <tr class="active">
                                    <td>${SEGMENTACAOSILABICA}</td>
                                    <td>${player_SEGMENTACAOSILABICA}</td>
                                </tr>
                                <tr class="active">
                                    <td>${DISCRIMINACAOFONEMICA}</td>
                                    <td>${player_DISCRIMINACAOFONEMICA}</td>
                                </tr>
                                <tr class="active">
                                    <td>${MEMORIAFONOLOGICA}</td>
                                    <td>${player_MEMORIAFONOLOGICA}</td>
                                </tr>
                                <tr class="active">
                                    <td>${REPETICAODEPSEUDOPALAVRAS}</td>
                                    <td>${player_REPETICAODEPSEUDOPALAVRAS}</td>
                                </tr>
                                <tr class="active">
                                    <td>${COPIADEERITMO}</td>
                                    <td>${player_COPIADEERITMO}</td>
                                </tr>
                                <tr class="active">
                                    <td>${MEMORIAVISUAL}</td>
                                    <td>${player_MEMORIAVISUAL}</td>
                                </tr>
                                <tr class="active">
                                    <td>${COPIADEFORMAS}</td>
                                    <td>${player_COPIADEFORMAS}</td>
                                </tr>
                            </tbody>
                        </table>
                                    <a class="btn btn-info" href="${pageContext.request.contextPath}/result">Voltar</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

