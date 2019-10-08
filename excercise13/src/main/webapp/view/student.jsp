<%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 02-Oct-19
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>ini student</h1>
<table>
    <c:forEach items="${send}" var="data">
        <tr>
            <td><c:out value="${data.idStudent}"/></td>
            <td><c:out value="${data.name}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
