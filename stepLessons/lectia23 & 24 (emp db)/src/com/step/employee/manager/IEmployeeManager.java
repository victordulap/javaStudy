package com.step.employee.manager;

import com.step.employee.Employee;

import java.util.List;

public interface IEmployeeManager {
    public int insert(Employee employee);
    public int update(Employee employee);
    public List<Employee> read();
    public int delete(Employee employee);
    public void close();
}
