package com.step.model.person;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

//        2.  Adăugați clasa Person
//        Câmpuri: name, salary, gender (enum), birthdate (localdate)
public class Person {
    private String name;
    private Double salary;
    private Gender gender;
    private LocalDate birthDate;

    public Person(String name, Double salary, Gender gender, LocalDate birthDate) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public static List<Person> getDummyPeople() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Victor", 1500.0, Gender.MALE, LocalDate.of(2003, Month.JANUARY, 10)));
        people.add(new Person("Ion", 1000.0, Gender.MALE, LocalDate.of(2000, Month.AUGUST, 15)));
        people.add(new Person("Oleg", 1220.0, Gender.MALE, LocalDate.of(1987, Month.JULY, 16)));
        people.add(new Person("Ina", 990.0, Gender.FEMALE, LocalDate.of(2001, Month.JUNE, 2)));
        people.add(new Person("Maria", 300.0, Gender.FEMALE, LocalDate.of(2005, Month.SEPTEMBER, 13)));
        people.add(new Person("Alisa", 1800.0, Gender.FEMALE, LocalDate.of(1970, Month.DECEMBER, 23)));
        people.add(new Person("Robot", 2500.0, Gender.OTHER, LocalDate.of(1999, Month.FEBRUARY, 22)));
        people.add(new Person("Bob", 500.0, Gender.OTHER, LocalDate.of(2001, Month.MARCH, 1)));
        people.add(new Person("Unexpected", 10.0, Gender.OTHER, LocalDate.of(1994, Month.OCTOBER, 19)));

        return people;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return name + '\'' +
                " / " + salary +
                " /" + gender +
                " / " + birthDate;
    }
}
