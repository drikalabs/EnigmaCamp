<%--
  Created by IntelliJ IDEA.
  User: drika
  Date: 07/10/19
  Time: 16.00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ini Artist</h1>
<a href="artist-form"> tambah Artist</a>
<table border="1">
<tr>
    <th>Id</th>
    <th>Name</th>
    <th>Debute date</th>
    <th>from</th>
</tr>
    <c:forEach items="${artistlist}" var="dataArtist">
    <tr>
        <td><c:out value="${dataArtist.idArtist}"/></td>
        <td><c:out value="${dataArtist.name}"/></td>
        <td><c:out value="${dataArtist.debuteDate}"/></td>
        <td><c:out value="${dataArtist.bornPlace}"/></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
