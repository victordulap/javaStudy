<%--
  Created by IntelliJ IDEA.
  User: anunachi
  Date: 09/03/2021
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello emp!</title>
    <%@ include file="lib/bootstrap.html" %>
</head>
<body>
<div class="container">
    <h1 class="title">Employee manager</h1>
    <ul>
        <li><a href="${pageContext.request.contextPath}/list">List</a></li>
    </ul>
</div>
</body>
</html>
