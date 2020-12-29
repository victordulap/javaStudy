package com.step;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("ion");
        List<Person> people = new ArrayList<>();


        //1
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //2
//        Collections.sort(people, (Person p1, Person p2) -> {
        //3
//        Collections.sort(people, (p1, p2) -> {
        //4
        Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        people.forEach(person -> {
        });
    }

}
