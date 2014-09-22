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
            <h1>Efetue o Login</h1>

            <div class="row placeholders">
                <div class="col-md-12 col-sm-12 pager">
                    <div class="row">

                        <form role="form" id="login" method="post" modelAtribute="login">
                            <div class="form-horizontal" role="form">

                                <label for="loginuser" class="col-sm-2 control-label">Nome de usuario</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <input name="loginUser" type="text" class="form-control" id="loginuser"
                                           placeholder="Digite o nome de usuario" value="${user.loginUser}">
                                </div>
                            </div>
                            <div class="form-horizontal" role="form">

                                <label for="passworduser" class="col-sm-2 control-label">Senha</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <input name="password" type="password" class="form-control" id="passworduser"
                                           placeholder="Digite a senha" value="${user.password}">
                                </div>

                            </div>
                                <button type="submit" class="btn btn-default">Entrar</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

