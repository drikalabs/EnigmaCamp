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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Title</title>

    <!-- Bootstrap CSS -->
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
    <a href="artist-form" class="btn btn-primary"> tambah Artist</a>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Debute date</th>
            <th>From</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${artistlist}" var="dataArtist">
            <tr>
                <td><c:out value="${dataArtist.idArtist}"/></td>
                <td><c:out value="${dataArtist.name}"/></td>
                <td><c:out value="${dataArtist.debuteDate}"/></td>
                <td><c:out value="${dataArtist.bornPlace}"/></td>
                <td><a href="detail?idArtist=${dataArtist.idArtist}" class="btn btn-primary">Detil</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
