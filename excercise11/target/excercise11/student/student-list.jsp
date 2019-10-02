<%@ page import="com.enigma.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 01-Oct-19
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
<%--<header>
    <h1>Enigma Academy</h1>
</header>
<div class="sidenav">
    <li><a href="data">Data</a></li>
    <li><a href="#">Input</a></li>
</div>--%>
    <c:forEach items="${requestScope.students}" var="students">
        <h1><c:out value="${students.name}"></h1>
    </c:out>
    </c:forEach>

<%--<div class="main">
    <% List<Student> result= (List<Student>) request.getAttribute("students");%>
<table border="1">
    <tr>
        <th>No</th>
        <th>Name</th>
        <th>Brith Place</th>
        <th>Birth Date</th>
        <th>Gender</th>
        <th>Major</th>
    </tr>
       <% for (Student data:result) {%>
    <tr>
        <td><%=data.getId()%> </td>
        <td><%=data.getName()%></td>
        <td><%=data.getBirthPlace()%></td>
        <td><%=data.getBirthDate()%></td>
        <td><%=data.getGender()%></td>
        <td><%=data.getMajor()%></td>
    </tr>
    <%; }%>
</table>
</div>--%>
</body>
</html>
