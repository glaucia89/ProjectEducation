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
        <div class="col-md-2 col-sm-2" style="position:fixed">
            <jsp:include page="../../others/menulateral.jsp"/>
        </div>
            <div class="col-md-8 col-sm-8 main col-md-offset-2 col-sm-offset-2">
                <h1 class="page-header">${title}</h1>
            <table class="table table-bordered">
                <thead>
                <tr class="success">
                    <td>Habilidade</td>
                    <td>Dificuldade</td>
                    <td>Pergunta</td>
                    <td>Ação</td>
                </tr>
                </thead>
                <tbody>
                    <c:forEach var="item" items="${questions}" >
                        <c:if test="${!empty item}">
                            <tr class="active">
                                <td>${item.hability.valor}</td>
                                <td>${item.difficulty}</td>
                                <td>${item.asking}</td>
                                <td>
                                   <a class="btn btn-danger" href="${pageContext.request.contextPath}/questions/FAE3/delete${item.id}">Deletar</a>
                                </td>
                            </tr>
                        </c:if>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
</div>

