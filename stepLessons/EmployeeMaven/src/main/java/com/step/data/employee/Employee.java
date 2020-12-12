package com.step.data.employee;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    public static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private String idnp;
    private LocalDate birthDate;
    private double salary;
    private Job job;

    public Employee(String name, String surname, String idnp, LocalDate birthDate, double salary, Job job) {
        this.name = name;
        this.surname = surname;
        this.idnp = idnp;
        this.birthDate = birthDate;
        this.salary = salary;
        this.job = job;
    }

    //getters
    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getBirthDateFormatted() {
        return birthDate.format(EmployeeManager.dateTimeFormatter);
    }

    protected String getIdnp() {
        return idnp;
    }

    public Job getJob() {
        return job;
    }

    // end getters

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    // end setters
}