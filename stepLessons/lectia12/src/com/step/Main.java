package com.step;

import com.step.data.Person;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Victor", "Dulap");
        Person p2 = new Person("Victor", "Dulap");

        // compara dupa adresa
        if(p1 == p2){

        }

        // compara dupa adresa
        System.out.println(p1.equals(p2));
    }
}
