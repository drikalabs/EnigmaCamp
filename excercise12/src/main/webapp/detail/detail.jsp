<%@ page import="com.enigma.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 02-Oct-19
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>detil</title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body class="profile">
<table border="1" style="border-spacing: 0px">
    <%List<Student> result= (List<Student>) request.getAttribute("detail");
    for (Student data :result){
    %>
    <tr>
        <td>Nama</td>
        <td><%=data.getName()%></td>
    </tr>
    <tr>
        <td>Birth Place</td>
        <td><%=data.getBirthPlace()%></td>
    </tr>
    <tr>
        <td>Birth Date</td>
        <td><%=data.getBirthDate()%></td>
    </tr>
    <tr>
        <td>Gender</td>
        <td><%=data.getGender()%></td>
    </tr>
    <tr>
        <td>Major</td>
        <td><%=data.getMajor()%></td>
    </tr>
    <%}%>
</table>
<a href="data">
    <button>Back</button></a>
</body>
</html>
