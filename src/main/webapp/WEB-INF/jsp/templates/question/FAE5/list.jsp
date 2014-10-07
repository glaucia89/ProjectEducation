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
                    <td class="text-center">Habilidade</td>
                    <td class="text-center">Dificuldade</td>
                    <td>Pergunta</td>
                    <td class="text-center">Ação</td>
                </tr>
                </thead>
                <tbody>
                    <c:forEach var="item" items="${questions}" >
                        <c:if test="${!empty item}">
                            <tr class="active">
                                <td class="text-center">${item.hability.valor}</td>
                                <td class="text-center">${item.difficulty}</td>
                                <td>${item.asking}</td>
                                <td class="text-center">
                                    <a class="btn btn-danger" href="${pageContext.request.contextPath}/question/FAE5/delete${item.id}">Remover</a>
                                </td>
                            </tr>
                        </c:if>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
</div>

