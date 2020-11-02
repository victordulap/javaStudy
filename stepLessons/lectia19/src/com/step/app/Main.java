package com.step.app;

import com.step.data.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    De creat o clasa Person (String name, LocalDate birthDate).
    De creat 1 clasa Main (main()).
    În Interiorul la main de creat un array list care sa păstreze 5 obiecte person.
    De sortat colecția respectivă dupa name
    și de explicat care sunt modificarile necesare pentru a sorta colecția dupa birthdate.
 */
public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // generate
        for (int i = 0; i < 5; i++) {
            people.add(new Person("pers" + (5 - i), LocalDate.now().minusYears(i)));
        }

        // show before sort
        System.out.println("before sort");
        for (int i = 0; i < people.size(); i++) {
            //System.out.println(people.get(i).getName() + " / " + people.get(i).getBirthDate());
            System.out.println(people.get(i));
        }

//        people.sort(Person::compareTo);
        Collections.sort(people);

        // show after sort
        System.out.println("after sort");
        for (int i = 0; i < people.size(); i++) {
            //System.out.println(people.get(i).getName() + " / " + people.get(i).getBirthDate());
            System.out.println(people.get(i));
        }
    }
}
