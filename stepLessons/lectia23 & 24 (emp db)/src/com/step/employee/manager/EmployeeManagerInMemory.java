package com.step.employee.manager;

import com.step.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerInMemory implements IEmployeeManager {
    List<Employee> employees = new ArrayList<>();

    @Override
    public int insert(Employee employee) {
        return 0;
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