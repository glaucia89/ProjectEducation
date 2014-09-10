<%--
  Created by IntelliJ IDEA.
  User: glaucia
  Date: 10/08/14
  Time: 01:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="/newEducation/assets/js/vendor/angularjs/angular.min.js"></script>

<div class="container-fluid panel-body">
    <div class="row">
        <div class="col-md-8 col-sm-8 col-md-offset-2 col-sm-offset-2 main">
            <h1 class="page-header">${title}</h1>

            <div class="row placeholders">
                <div class="col-md-12 col-sm-12 pager">
                    <div class="row">

                        <form role="form" id="questionadd" method="post" modelAtribute="quetionmodel">
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

                                <label for="dificulty" class="col-sm-2 control-label">Nível de Dificuldade</label>
                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <input name="dificulty" type="number" class="form-control" id="dificulty" min="0" max="10"
                                               placeholder="Entre que o nível da dificuldade" value="${question.dificulty}">
                                </div>

                                <label for="asking" class="col-sm-2 control-label">Pergunta</label>
                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <textarea name="asking" class="form-control" id="asking" maxlength="255"
                                              placeholder="Digite a questão" value="${question.asking}"></textarea>
                                </div>
                                <div class="col-sm-12" style="padding-bottom: 25px;">
                                    <label for="pictureA" class="col-sm-2 control-label">Imagem da alternativa A</label>
                                    <div class="col-sm-6" >
                                        <input name="pictureA" type="text" class="form-control" id="pictureA"
                                               value="${question.pictureA}" ng-model="picture">
                                    </div>
                                    <div class="col-sm-4">
                                        <label>
                                            <input name="isCorrectA" type="checkbox" id="isCorrectA"
                                                   value="${question.isCorrectA}">Marque se está correta
                                        </label>
                                    </div>
                                </div>
                                 <div class="col-sm-12" style="padding-bottom: 25px;">
                                     <label for="pictureB" class="col-sm-2 control-label">Imagem da alternativa B</label>
                                     <div class="col-sm-6" >
                                        <input name="pictureB" type="text" class="form-control" id="pictureA"
                                               value="${question.pictureB}">
                                    </div>
                                    <div class="col-sm-4">
                                        <label>
                                            <input name="isCorrectB" type="checkbox" id="isCorrectB"
                                                   value="${question.isCorrectB}">Marque se está correta
                                        </label>
                                    </div>
                                 </div>
                                 <div class="col-sm-12" style="padding-bottom: 25px;">
                                     <label for="pictureC" class="col-sm-2 control-label">Imagem da alternativa C</label>
                                     <div class="col-sm-6" >
                                         <input name="pictureC" type="text" class="form-control" id="pictureA"
                                                value="${question.pictureC}">
                                     </div>
                                     <div class="col-sm-4">
                                         <label>
                                             <input name="isCorrectC" type="checkbox" id="isCorrectC"
                                                    value="${question.isCorrectC}">Marque se está correta
                                         </label>
                                     </div>
                                 </div>

                            </div>
                            <button type="submit" class="btn btn-info">Salvar</button>
                            <a class="btn btn-info" href="${pageContext.request.contextPath}/question">Voltar</a>
                        </form>
                            <label>{{picture}}</label>
                            <img class="img-responsive" src="${pageContext.request.contextPath}/assets/img/bancoImg/{{picture}}.png"  style="width: 200px; height: 200px;"/>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

