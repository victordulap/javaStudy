package org.edu.servlet;

import org.edu.entity.Employee;
import org.edu.model.EmployeeModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final int position = Integer.parseInt(request.getParameter("position"));
        final Employee employeeToEdit = EmployeeModel.getInstance().get(position);
        request.setAttribute("name", employeeToEdit.getName());
        request.setAttribute("position", position);
        RequestDispatcher rd = request.getRequestDispatcher("views/edit.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String empName = req.getParameter("name");
        int position = Integer.parseInt(req.getParameter("position"));
        EmployeeModel model = EmployeeModel.getInstance();
        model.edit(position, empName);
        resp.sendRedirect("list");
    }
}
