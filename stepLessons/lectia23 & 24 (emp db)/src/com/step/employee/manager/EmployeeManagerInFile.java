package com.step.employee.manager;

import com.step.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerInFile implements IEmployeeManager {
    List<Employee> employees = new ArrayList<>();

    public EmployeeManagerInFile() {
        // importul datelor din fisier
    }

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
        //save to file
    }

}
