package org.edu.servlet;

import org.edu.entity.Employee;
import org.edu.model.EmployeeModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        get data
        EmployeeModel model = EmployeeModel.getInstance();
        List<Employee> emps = model.list();

//        set attr to display list on page
//        req.setAttribute("employees", emps);

//        send to jsp page
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
//        requestDispatcher.forward(req, resp);
        resp.sendRedirect("list");
    }
}
