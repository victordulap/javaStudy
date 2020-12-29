package com.step.data.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
    public static List<Employee> getDummyEmployeeList() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ion"));
        list.add(new Employee("Ion"));
        list.add(new Employee("Ion"));

        return list;
    }
}
