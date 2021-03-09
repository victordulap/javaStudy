package com.step.model.person;

import java.time.LocalDate;

// no jUnit
public class PersonManagerTestDemo {
    PersonManager manager = new PersonManager();

    // testFuncName_scenary
    // testAdd_10males
    public void testAdd_randomPerson() throws Exception {
        Person random = new Person("Name", 100.0, Gender.MALE, LocalDate.now());
//        pers repetitiva, care nu se permite de add()
        Person random2 = new Person("Name", 100.0, Gender.MALE, LocalDate.now());
        manager.add(random);
        manager.add(random2);

        Person p = manager.getPeople().get(0);
        if(!p.getName().equals("Name")) throw new Exception("Expected name: \"Name\", got: ...");
        if(!p.getSalary().equals(100.0)) throw new Exception("Expected salary: 100, got: ...");

        if(manager.getPeople().size() > 1) throw new Exception("Found duplicate");
    }

    public static void main(String[] args) throws Exception {
        PersonManagerTestDemo test = new PersonManagerTestDemo();
        test.testAdd_randomPerson();
        System.out.println("Test passed");
    }
}
