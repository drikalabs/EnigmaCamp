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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="artist">Artist</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="songs">Songs</a>
        </li>
    </ul>
</nav>
<hr>
<div class="container">
    <h1>Ini Song List</h1>
    <a href="songs-form" class="btn btn-primary">Add song</a>
    <table class="table table-striped">
        <tr>
            <th>IdSong</th>
            <th>Artist Name</th>
            <th>Title Song</th>
            <th>Detail</th>
        </tr>
        <c:forEach items="${song}" var="data">
            <tr>
                <td><c:out value="${data.idSong}"/></td>
                <td><c:out value="${data.idArtist.name}"/></td>
                <td><c:out value="${data.titleSong}"/></td>
                <td> <a href="detailsongs?idSong=${data.idSong}" class="btn btn-success">Detail</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>