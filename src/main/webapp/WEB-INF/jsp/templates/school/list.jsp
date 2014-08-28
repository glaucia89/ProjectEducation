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
            <jsp:include page="../others/menulateral.jsp"/>
        </div>
            <div class="col-md-8 col-sm-8 main col-md-offset-2 col-sm-offset-2">
                <h1 class="page-header">${title}</h1>
            <table class="table table-bordered">
                <thead>
                <tr class="success">
                    <td>Titulo</td>
                    <td>Cidadde</td>
                    <td>Estado</td>
                    <td>Ação</td>
                </tr>
                </thead>
                <tbody>
                    <c:if test="${empty item}">
                        <c:forEach var="item" items="${schools}" >
                            <tr>
                                <td>${item.title}</td>
                                <td>${item.city.valor}</td>
                                <td>${item.state.valor}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/school/edit${item.id}">Editar</a>
                                    <a href="${pageContext.request.contextPath}/school/delete${item.id}">Deletar</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </c:if>
                </tbody>
            </table>

        </div>
    </div>
</div>

