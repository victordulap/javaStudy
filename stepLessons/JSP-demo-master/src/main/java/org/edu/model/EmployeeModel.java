package org.edu.model;

import org.edu.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeModel {
    private static EmployeeModel instance = new EmployeeModel();

    public static EmployeeModel getInstance() {
        return instance;
    }


    private List<Employee> employeeList;

    private EmployeeModel() {
        this.employeeList = new ArrayList<>();
    }

    public boolean add(Employee emp) {
        return this.employeeList.add(emp);
    }

    public List<String> list() {
        return employeeList.stream().map(user -> user.getName()).collect(Collectors.toList());
    }

    public void deleteEmployee(int position) {
        this.employeeList.remove(position);
    }

    public Employee get(int position) {
        return this.employeeList.get(position);
    }

    public void edit(int position, String newName) {
        this.employeeList.get(position).setName(newName);
    }
}
