package com.step.data;

import java.time.LocalDate;

public class Person {
    String name;
    private Buletin buletin;

    static class Buletin {
        String idnp;
        String seria;
        LocalDate dataEmitere;
    }

    public static void main(String[] args) {
////      ca sa facem un buletin folostind clasa nested non static
//        Person person = new Person();
////      apelam prin object constructorul
//        Person.Buletin buletin = person.new Buletin();


//      ca sa facem un buletin folostind clasa nested static
        Person person = new Person();
//      apelam prin object constructorul
        Person.Buletin buletin = new Person.Buletin();
    }
}
