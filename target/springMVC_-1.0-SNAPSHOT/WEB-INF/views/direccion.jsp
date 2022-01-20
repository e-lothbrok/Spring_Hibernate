<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="<c:url value='/resources/js/jquery.js'/>"></script>
    <title>Admin</title>
</head>
<body>
<h1>Direccion.jsp</h1>
<form:form action="${pageContext.request.contextPath}/direccion/save" method="post" modelAttribute="direccion">
    <table>
        <tr>
            <td>Calle</td>
            <td><form:input path="calle" type="text"/></td>
        </tr>
        <tr>
            <td>cp</td>
            <td><form:input path="cp" type="text"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Guardar cambios"></td>
        </tr>
    </table>
</form:form>
<br/>
<c:out value="${resultado}"></c:out>
<br/>
<br/>
<c:forEach items="${direcciones}" var="direccion">
    <c:out value="${direccion}"></c:out>
    <br/>
</c:forEach>
</body>
</html>
