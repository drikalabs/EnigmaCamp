<%--
  Created by IntelliJ IDEA.
  User: EnigmaCamp
  Date: 30-Sep-19
  Time: 10:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
<% String result = (String) request.getAttribute("result"); %>
<h1>Hasilnya:<%=result %>
</h1>
</body>
</html>
