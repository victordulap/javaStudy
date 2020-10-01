package com.step.model;

public class Teacher extends Person {
    private String type; // math, english etc...
    private double salary;

    public Teacher(String type, double salary, String name, String surname, float height, String race, String birthDate) {
        super(name, surname, height, race, birthDate);
        this.type = type;
        this.salary = salary;
    }

    public void giveStudentAMark(Person student, byte mark) {
        System.out.println(student.getName() + " " + student.getSurname() + " got a " + mark + " for " + this.type + " item.");
        System.out.println("Teacher: " + this.getName() + " " + this.getSurname() + " (" + this.type + ").");
    }

    public void yeelAtStudents() {
        System.out.println("Calm down you all!!!");
    }
}
