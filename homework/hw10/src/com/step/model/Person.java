package com.step.model;

public class Person {
    protected String name;
    protected String surname;
    protected float height;
    protected String race;
    protected String birthDate;

    public Person(String name, String surname, float height, String race, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.race = race;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public float getHeight() {
        return height;
    }

    public String getRace() {
        return race;
    }
}
