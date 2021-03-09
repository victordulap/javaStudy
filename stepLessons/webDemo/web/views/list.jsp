<%@ page import="org.step.entity.Employee" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: anunachi
  Date: 09/03/2021
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <div class="container">
        <h1>Emps:</h1>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Age</th>
            </tr>
            </thead>

            <tbody>
            <%
                List<Employee> emps = (List<Employee>) request.getAttribute("emps");
                for (Employee emp : emps) {
                    out.write("<tr><td>" + emp.getName() + "</td><td>" + emp.getAge() + "</td></tr>");
                }
            %>

            </tbody>
        </table>
    </div>
</body>
</html>
