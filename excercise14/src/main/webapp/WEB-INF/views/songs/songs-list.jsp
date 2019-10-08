<%--
  Created by IntelliJ IDEA.
  User: drika
  Date: 07/10/19
  Time: 22.13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ini Song List</h1>
<a href="songs-form">Add song</a>
<table border="1">
    <tr>
        <th>IdSong</th>
        <th>IdArtist</th>
        <th>Title Song</th>
        <th>Detail</th>
    </tr>
    <c:forEach items="${song}" var="data">
        <tr>
            <td><c:out value="${data.idSong}"/></td>
            <td><c:out value="${data.idArtist}"/></td>
            <td><c:out value="${data.titleSong}"/></td>
            <a href="">Detail</a>
        </tr>
    </c:forEach>
</table>
</body>
</html>
