package org.edu.servlet;

import org.edu.entity.Employee;
import org.edu.model.EmployeeModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String empName = req.getParameter("name");
        String password = req.getParameter("pass");
        Employee user = new Employee(empName, password);
        EmployeeModel model = EmployeeModel.getInstance();
        model.add(user);

        req.setAttribute("employee", empName);
        doGet(req, resp);
    }
}
