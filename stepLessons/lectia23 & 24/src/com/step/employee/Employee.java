package com.step.employee;

public class Employee {
    private int id;
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
