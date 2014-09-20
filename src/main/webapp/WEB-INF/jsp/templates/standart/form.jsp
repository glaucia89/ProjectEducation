<%--
  Created by IntelliJ IDEA.
  User: glaucia
  Date: 10/08/14
  Time: 01:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container-fluid panel-body">
    <div class="row">
        <div class="col-md-8 col-sm-8 col-md-offset-2 col-sm-offset-2 main">
            <h1 class="page-header">${title}</h1>

            <div class="row placeholders">
                <div class="col-md-12 col-sm-12 pager">
                    <div class="row">

                        <form role="form" id="schoolAdd" method="post" modelAtribute="standartmodel">
                            <div class="form-horizontal" role="form">
                                <label for="hability" class="col-sm-2 control-label">Habilidade</label>
                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <select name="hability" class="form-control" id="hability">
                                        <option value="${question.hability}">${question.hability.valor}</option>
                                        <c:forEach var="item" items="${habilities}">
                                            <option value="${item}">${item.valor}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                                        <label for="dificulty" class="col-sm-2 control-label">Nível de Dificuldade</label>
                                        <div class="col-sm-10" style="padding-bottom: 25px;">
                                            <input name="dificulty" type="number" class="form-control" id="dificulty" min="0" max="10"
                                                   placeholder="Entre que o nível da dificuldade" value="${question.dificulty}">
                                        </div>

                            <button type="submit" class="btn btn-info">Salvar</button>

                            <a class="btn btn-info" href="${pageContext.request.contextPath}/standart">Voltar</a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>