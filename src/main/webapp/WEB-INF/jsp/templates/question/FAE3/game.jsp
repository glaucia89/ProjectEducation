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
    <div class="row placeholders">
        <div class="col-md-12 col-sm-12 pager">
            <h3>${game.question.asking}</h3>
        </div>
    </div>
    <form role="form" id="addGame" method="post" modelAtribute="modelgame" >
        <div ng-app>
            <div class="row placeholders center-block" style="margin-top: 30px" >
                <div class="row">
                    <div class="col-md-4 col-md-offset-3" >
                        <img class="img-thumbnail" src="${pageContext.request.contextPath}/assets/img/bancoImg/${game.answerA.picture}.png"  style="width: 200px; height: 200px;"/>
                    </div>
                        <div class="col-md-4" >
                            <img class="img-thumbnail" src="${pageContext.request.contextPath}/assets/img/bancoImg/${game.answerB.picture}.png"  style="width: 200px; height: 200px;"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 col-md-offset-3" >
                        <button  style="width: 200px;" type="button" class="btn btn-lg btn-info" onclick="audioA.play();">
                            <img style="width: 30px; height: 30px; alignment-adjust: middle" src="${pageContext.request.contextPath}/assets/img/menu/audio.png" />

                            
                        </button>
                        <div style="display: none">
                            <audio id="audioA" controls src="${pageContext.request.contextPath}/assets/audio/${game.answerA.audio}.ogg" type="audio/ogg"/>
                        </div>
                    </div>
                            <div class="col-md-4" >
                                <button  style="width: 200px;" type="button" class="btn btn-lg btn-info" onclick="audioB.play();">
                                    <img style="width: 30px; height: 30px; alignment-adjust: middle" src="${pageContext.request.contextPath}/assets/img/menu/audio.png" />
                                    
                                </button>
                                <div style="display: none">
                                    <audio id="audioB" controls src="${pageContext.request.contextPath}/assets/audio/${game.answerB.audio}.ogg" type="audio/ogg"/>
                                </div>
                            </div>
                </div>
                <div class="row">
                    <div class="col-md-4 col-md-offset-3" >
                        <input id="ckbox1" type="checkbox" class="form-control form-horizontal" style="width: 200px;" onclick="checkbox1Validade()" ng-model="responseA"/>
                    </div>
                    <div class="col-md-4" >
                        <input id="ckbox2" type="checkbox" class="form-control form-horizontal" style="width: 200px;" onclick="checkbox2Validade()" ng-model="responseB" />
                    </div>
                </div>
            </div>
            <input type="hidden" name="responseA" value="{{responseA}}">
            <input type="hidden" name="responseB" value="{{responseB}}">
        </div>
        <div class="row placeholders center-block" style="margin-top: 30px">
            <div class="col-md-3 col-md-offset-2" >
                <a href="${pageContext.request.contextPath}/game/back" type="button" class="btn btn-lg btn-danger"  style="width: 200px;">SAIR</a>
            </div><div class="col-md-3" >
                <a href="${pageContext.request.contextPath}/game/gap" type="button" class="btn btn-lg btn-warning" style="width: 200px">PULAR</a>
            </div><div class="col-md-3" >
                <button type="submit" class="btn btn-lg btn-success" style="width: 200px;">PROXIMA</button>
            </div>
        </div>

    </form>
</div>

