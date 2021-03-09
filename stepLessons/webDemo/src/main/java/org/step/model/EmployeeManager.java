package org.step.model;

import org.step.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
//    singleton
    private static EmployeeManager instance = new EmployeeManager();

    public static EmployeeManager getInstance() {
        return instance;
    }

    private List<Employee> emps;

    private EmployeeManager() {
        emps = new ArrayList<>();
    }

    public List<Employee> getEmps() {
        return emps;
    }
}
