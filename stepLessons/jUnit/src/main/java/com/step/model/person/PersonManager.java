package com.step.model.person;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private List<Person> people = new ArrayList<>();

    public List<Person> getPeople() {
        return people;
    }

//  TODO:  trebuie sa verificam ca sa nu adaugam persoane repetitive
    public void add(Person p) {
        this.people.add(p);
    }
}
