package org.step.servlet;

import org.step.entity.Employee;
import org.step.model.EmployeeManager;

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
        // get emps
        EmployeeManager manager = EmployeeManager.getInstance();
        List<Employee> emps = manager.getEmps();
        emps.add(new Employee("test", 17));
        emps.add(new Employee("test2", 28));

        // set attr on the page
        req.setAttribute("emps", emps);

        // send to page
        RequestDispatcher dispatcher = req.getRequestDispatcher("views/list.jsp");
        dispatcher.forward(req, resp);
    }
}
