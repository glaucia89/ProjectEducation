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

                        <form role="form" id="playerSchoolAdd" method="post" modelAtribute="modelPlayerSchool">
                            <div class="form-horizontal" role="form">


                                <div class="form-horizontal" role="form">

                                    <label for="yearschool" class="col-sm-2 control-label">Ano</label>

                                    <div class="col-sm-10" style="padding-bottom: 25px;">
                                        <input name="yearClasse" type="number" class="form-control" id="yearschool"
                                               placeholder="Digite aqui o ano" value="${player.yearClasse}">
                                    </div>
                                </div>

                                    <div class="form-horizontal" role="form">
                                        <label for="gradeschool" class="col-sm-2 control-label">Classe</label>

                                    <div class="col-sm-10" style="padding-bottom: 25px;">
                                        <input name="classe" type="number" class="form-control" id="gradeschool"
                                               placeholder="Digite aqui a classe" value="${player.classe}">
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-info">Salvar</button>
                                <a class="btn btn-info" href="${pageContext.request.contextPath}/player">Voltar</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

