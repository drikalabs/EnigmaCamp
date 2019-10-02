<%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 01-Oct-19
  Time: 10:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input Data</title>
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
<div class="main container">
    <form action="insert" method="post">
        <label for="idkey"><b>Id</b></label>
        <input type="text" placeholder="Enter Id" name="idkey" required>

        <label for="name"><b>Name</b></label>
        <input type="text" placeholder="Enter Name" name="name" required>

        <label for="birthPlace"><b>Birth Place</b></label>
        <input type="text" placeholder="Enter City" name="birthPlace" required>

        <label for="date"><b>Birth Date</b></label>
        <input type="text" name="date" placeholder="YYYY-MM-DD" required>

        <label for="gender"><b>Gender</b></label>
        <select name="gender" id="">
            <option value="">Select Your Gender</option>
            <option value="M">Male</option>
            <option value="F">Female</option>
        </select>

        <label for="major"><b>Major</b></label>
        <input type="text" placeholder="Enter Major" name="major" required>

        <input type="submit" class="btn">
</div>
</form>
</div>
</body>
</html>
