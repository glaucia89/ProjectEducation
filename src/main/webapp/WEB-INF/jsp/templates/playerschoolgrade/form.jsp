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

                        <form role="form" id="formschoolplayergrade" method="post"
                              modelAtribute="modelschoolplayergrade">
                            <div class="form-horizontal" role="form">
                                <label for="namestudent" class="col-sm-2 control-label">Aluno</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <select name="player" class="form-control" id="namestudent">
                                        <c:forEach var="item" items="${players}">
                                            <option value="${item}">${item.name}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <label for="yearschool" class="col-sm-2 control-label">Escola:</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <input name="year" type="number" class="form-control" id="yearschool"
                                           placeholder="ano" value="${student.year}">
                                </div>
                                <label for="gradeschool" class="col-sm-2 control-label">Escola:</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <input name="year" type="number" class="form-control" id="gradeschool"
                                           placeholder="classe" value="${student.grade}">
                                </div>
                            </div>
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

