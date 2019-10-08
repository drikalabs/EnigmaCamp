<%--
  Created by IntelliJ IDEA.
  User: drika
  Date: 08/10/19
  Time: 22.32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <table class="table table-striped">
        <tr>
            <th>Title</th>
            <td>${data.titleSong}</td>
        </tr>
        <tr>
            <th>Artist Name</th>
            <td>${data.idArtist.name}</td>
        </tr>
        <tr>
            <th>From</th>
            <td>${data.idArtist.bornPlace}</td>
        </tr>
        <tr>
            <th>Debute Date</th>
            <td>${data.idArtist.debuteDate}</td>
        </tr>
    </table>
</div>
</body>
</html>
