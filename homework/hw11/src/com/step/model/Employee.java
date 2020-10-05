package com.step.model;

public class Employee {
    private String name;
    private String surname;
    private double salary;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
}
