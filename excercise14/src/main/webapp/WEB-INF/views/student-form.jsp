<%--
  Created by IntelliJ IDEA.
  User: drika
  Date: 07/10/19
  Time: 10.33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="data" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Ini FORM</h1>
<data:form modelAttribute="student" method="post" action="student">
    <data:input path="idStudent" />
    <data:input path="name"/>
    <data:input path="birthPlace"/>
   <%-- <data:input path="birthDate"/>--%>
    <data:input path="gender"/>
    <data:input path="major"/>
    <input type="submit">
</data:form>
<%--<form action="student" method="post">
    <input type="text" name="idStudent" placeholder="idStudent">
    <input type="text" name="name" placeholder="name">
    <input type="text" name="birthPlace" placeholder="birth palce">
    <input type="submit">

</form>--%>
</body>
</html>
