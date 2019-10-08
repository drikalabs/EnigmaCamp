<%--
  Created by IntelliJ IDEA.
  User: drika
  Date: 07/10/19
  Time: 22.14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="in" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>ini form songs</h1>
<in:form modelAttribute="song" method="post" action="songs">
    Id Songs <in:input path="idSong"/>
    Title Songs<in:input path="titleSong"/>
    artist<in:select path="idArtist">
    <c:forEach items="${artist}" var="data">
        <in:option value="${data.idArtist}"><c:out value="${data.name}"/></in:option>
    </c:forEach>
</in:select>
    <input type="submit">

</in:form>
</body>
</html>
