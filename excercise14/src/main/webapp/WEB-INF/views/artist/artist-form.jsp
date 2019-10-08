<%--
  Created by IntelliJ IDEA.
  User: drika
  Date: 07/10/19
  Time: 16.00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
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
            <a class="nav-link" href="#">Link 1</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Link 2</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Link 3</a>
        </li>
    </ul>
</nav>
<hr>
<div class="container">
    <input:form modelAttribute="artist" action="artist" method="POST">
        <div class="form-group">
            <input:input path="idArtist" value="${artistlist.idArtist}" class="form-control" placeholder="Insert Id"/>
        </div>
        <div class="form-group">
            <input:input path="name" value="${artistlist.name}" class="form-control" placeholder="Insert Name"/>
        </div>
        <div class="form-group">
            <input:input path="debuteDate" value="${artistlist.debuteDate}" class="form-control" type="date"/>
        </div>
        <div class="form-group">
            <input:input path="bornPlace" value="${artistlist.bornPlace}" class="form-control"
                         placeholder="Insert Born PLace"/>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control btn btn-primary">
        </div>
    </input:form>
</div>
</body>
</html>
