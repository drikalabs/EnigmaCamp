<%--
  Created by IntelliJ IDEA.
  User: drika
  Date: 07/10/19
  Time: 10.33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="data" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<%--<h1>DUARR STUDENT</h1>
<h3>id :${balasan.idStudent}</h3>
<h3>name:${balasan.name}</h3>
<h3>Birthplace:${balasan.birthPlace}</h3>--%>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
    </tr>
    <tr>
        <c:forEach items="${studentlist}" var="list">
            <td><c:out value="${list.idStudent}"/></td>
            <td><c:out value="${list.name}"/></td>
        </c:forEach>
    </tr>
</table>
</body>
</html>
