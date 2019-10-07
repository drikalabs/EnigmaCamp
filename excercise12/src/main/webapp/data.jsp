<%@ page import="com.enigma.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 01-Oct-19
  Time: 11:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Something</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<header>
    <h1>Enigma Academy</h1>
</header>
<div class="sidenav">
    <li><a href="index.jsp">Home</a></li>
    <li><a href="data">Data</a></li>
    <li><a href="insert.jsp">Input</a></li>
</div>
<div class="main">
    <% List<Student> result= (List<Student>) request.getAttribute("students");%>
    <table>
        <tr>
            <th>No</th>
            <th>Name</th>
            <th>Birth Place</th>
            <th>Action</th>
        </tr>
        <% for (Student data:result) {%>
        <tr>
            <td><%=data.getId()%></td>
            <td><%=data.getName()%></td>
            <td><%=data.getBirthPlace()%></td>
            <td><a href="detail?id=<%=data.getId()%>"><button>Detail</button></a></td>
        </tr>
        <%}%>
    </table>
</div>
</body>
</html>
