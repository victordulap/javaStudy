package com.step.model.person;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDate;

public class PersonManagerTest {

    // cand scriem test, la compilre se executa el automat, si daca da exeptie se stopeaza
    @Test
    public void testAdd_2IdenticalPersons() throws Exception {
        PersonManager manager = new PersonManager();

        Person random = new Person("Name", 100.0, Gender.MALE, LocalDate.now());
//        pers repetitiva, care nu se permite de add()
        Person random2 = new Person("Name", 100.0, Gender.MALE, LocalDate.now());
        manager.add(random);
        manager.add(random2);

//        if(manager.getPeople().size() == 1) throw new Exception("Found duplicate");
        // in loc sa scriem if-ul de sus, folosim assertEquals
        TestCase.assertEquals("The list should contain 1 entry only", 1, manager.getPeople().size());
    }

}
