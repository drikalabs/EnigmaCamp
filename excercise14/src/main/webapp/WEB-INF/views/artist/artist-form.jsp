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
</head>
<body>

<input:form modelAttribute="artist" action="artist" method="POST">
    <input:input path="idArtist"/>ID
    <input:input path="name"/>Name
    <input:input path="debuteDate"/>DebutDate
    <input:input path="bornPlace"/>BornPlace
    <input type="submit">
</input:form>
</body>
</html>
