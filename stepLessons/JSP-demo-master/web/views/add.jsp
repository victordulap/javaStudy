<%--
  Created by IntelliJ IDEA.
  User: sscerbatiuc
  Date: 2/23/2021
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add employee</title>
</head>
<body>
<div>
    <%
        if (request.getAttribute("employee") != null) {
            out.println("<p>Employee '" + request.getAttribute("employee") + "' added!</p>");
        }
    %>
    Add employees
    <form method="post">
        <label>Name:
            <input type="text" name="name"><br/>
        </label>

        <label>Password:
            <input type="password" name="pass"><br/>
        </label>
        <button type="submit">Submit</button>
    </form>

    <a href="${pageContext.request.contextPath}/">Back to main page</a>
</div>
</body>
</html>
