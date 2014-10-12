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
            <h2>Biblioteca de Som</h2><br/>
            <div class="row">
            <c:forEach var="item" items="${list}" >
                <c:if test="${!empty item}">
                    <div class="col-md-4 col-xs-4 placeholder centralizado">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <audio id="audio" controls src="${pageContext.request.contextPath}/assets/audio/${item}.ogg" type="audio/ogg"/>
                        </div>
                            <div class="col-md-12 col-sm-12 col-xs-12 centralizado">
                                <h4 class="text-center" >${item}</h4>
                        </div>
                    </div>
                    </c:if>
                </c:forEach>

            </div>
        </div>
    </div>
</div>

