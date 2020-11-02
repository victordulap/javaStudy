package com.step.data;

public class Person {
    private String name;
    private String surname;
    private String birthDate;
    private char gender;
    private String citizenShip;
    Integer int;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object obj) {
        // comparam adresa
        if (this == obj)
            return true;

        // verificam daca tipurile obiectilor sunt egale
        //1 (mai corect, mai optimizat ca nu chemam getClass() de 2 ori)
        boolean sameClass = obj instanceof Person;
        //2
        //boolean sameClass = this.getClass() == obj.getClass();

        if (!sameClass)
            return false;

        // convertim Object to  Person prin cast
        Person p = (Person) obj;

        return this.name.equalsIgnoreCase(p.name)
                && this.surname.equalsIgnoreCase(p.surname)
                && this.gender == p.gender
                && this.birthDate.equalsIgnoreCase(p.birthDate);
    }
}
