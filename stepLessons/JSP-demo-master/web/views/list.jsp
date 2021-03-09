<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: sscerbatiuc
  Date: 2/23/2021
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View employees</title>
</head>
<body>
    Employees
    <%
        List<String> employees = (List<String>) request.getAttribute("employees");

        if (employees != null && !employees.isEmpty()) {
            out.println("<ui>");
            for (int i = 0; i < employees.size(); i++) {
                out.println("<li>" + employees.get(i) + "</li>");
//                out.print("<a href='delete'>Delete</a>");
                out.print("<a href='delete?position=" + i + "'>Delete</a>");
                out.print("<a href='edit?position=" + i + "'>Edit</a>");

            }
            out.println("</ui>");
        } else {
            out.println("<p>There are no employees yet!</p>");
        }
    %>
    <a href="${pageContext.request.contextPath}/">Back to main page</a>
</body>
</html>
