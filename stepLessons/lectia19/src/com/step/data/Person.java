package com.step.data;

import java.time.LocalDate;

/*
    De creat o clasa Person (String name, LocalDate birthDate).
    De creat 1 clasa Main (main()).
    În Interiorul la main de creat un array list care sa păstreze 5 obiecte person.
    De sortat colecția respectivă dupa name
    și de explicat care sunt modificarile necesare pentru a sorta colecția dupa birthdate.
 */
public class Person implements Comparable<Person> {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Person o) {
        // name
        return name.compareTo(o.name);

        // birthDate
        // return birthDate.compareTo(o.birthDate);
    }

    @Override
    public String toString() {
        return this.name + " / " + this.birthDate;
    }
}
