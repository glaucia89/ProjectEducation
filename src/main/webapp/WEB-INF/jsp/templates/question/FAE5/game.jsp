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

<div class="panel-body">
    <div class="row">
        <div class="col-md-8 col-sm-8 col-md-offset-2 col-sm-offset-2 main">
            <h1 class="page-header">${title}</h1>
        </div>
    </div>
    <div class="row placeholders">
        <div class="col-md-12 col-sm-12 pager">
            <h3>Está é a questão</h3>
            <button type="button" class="btn btn-lg btn-block btn-info center-block" style="width: 200px; margin-top: 10px;">
                <img src="${pageContext.request.contextPath}/assets/img/menu/audio.png" style="width: 30px; height: 30px"></img>
            </button>
        </div>
    </div>
    <div class="row placeholders center-block" style="margin-top: 30px" >
        <div class="col-md-3 col-md-offset-2" >
            <img class="img-thumbnail" src="${pageContext.request.contextPath}/assets/img/bancoImg/abelha.png"  style="width: 200px; height: 200px;"/>
            <input id="ckbox1" type="checkbox" class="form-control form-horizontal" style="width: 200px;" onclick="checkbox1Validade()" on/>
        </div><div class="col-md-3" >
            <img class="img-thumbnail" src="${pageContext.request.contextPath}/assets/img/menu/escola.jpg"  style="width: 200px; height: 200px;"/>
            <input id="ckbox2" type="checkbox" class="form-control form-horizontal" style="width: 200px;" onclick="checkbox2Validade()" />
        </div><div class="col-md-3">
            <img class="img-thumbnail" src="${pageContext.request.contextPath}/assets/img/menu/escola.jpg"  style="width: 200px; height: 200px;"/>
            <input id="ckbox3" type="checkbox" class="form-control form-horizontal" style="width: 200px;" onclick="checkbox3Validade()"/>
        </div>
    </div>
    <div class="row placeholders center-block" style="margin-top: 30px">
        <div class="col-md-3 col-md-offset-2" >
            <input type="button" class="btn btn-lg btn-danger"  style="width: 200px;" value="SAIR" />
        </div><div class="col-md-3" >
            <input type="button" class="btn btn-lg btn-warning" style="width: 200px;" value="PULAR" />
        </div><div class="col-md-3" >
            <input type="button" class="btn btn-lg btn-success" style="width: 200px;" value="PROXIMA" />
        </div>
     </div>
</div>

