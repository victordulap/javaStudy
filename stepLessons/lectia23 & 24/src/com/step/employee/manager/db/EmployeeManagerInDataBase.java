package com.step.employee.manager.db;

import com.step.employee.Employee;
import com.step.employee.manager.IEmployeeManager;

import java.sql.SQLException;
import java.util.List;

public class EmployeeManagerInDataBase implements IEmployeeManager {
    EmployeeDao dao = new EmployeeDao();

    @Override
    public int insert(Employee employee) {
        try {
            return dao.insert(employee);
        } catch (SQLException throwables) {
            //solve error
            return -1;
        }
    }

    @Override
    public int update(Employee employee) {
        return 0;
    }

    @Override
    public List<Employee> read() {
        return null;
    }

    @Override
    public int delete(Employee employee) {
        return 0;
    }

    @Override
    public void close() {

    }
}
