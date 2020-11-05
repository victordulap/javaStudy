package com.step.lectie;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        // orice Set nu are get() de asta folosim foreach, seturile nu au positionare
//        Set<Integer> integers = new HashSet<>();
//        boolean isAdded = integers.add(123);
//        boolean testAdded = integers.add(1234);
//        boolean isUnique = integers.add(123);
//        integers.add(123);
//        integers.add(123);
//
//        System.out.println(isAdded);
//        System.out.println(testAdded);
//        System.out.println(isUnique);
//
//        for(Integer integer : integers) {
//            System.out.println(integer);
//        }
//        System.out.println(isAdded);
//        System.out.println(testAdded);
//        System.out.println(isUnique);

        // defaul hashCode is the address
        Coordinates coordinates1 = new Coordinates(1.0,2.0);

        Coordinates coordinates2 = new Coordinates(1.0,2.0);

        System.out.println(coordinates1.equals(coordinates2));
        System.out.println(coordinates2.hashCode());
        System.out.println(coordinates1.hashCode());

        Set<Coordinates> coordinates = new HashSet<>();
        coordinates.add(coordinates1);
        coordinates.add(coordinates2);

        System.out.println(coordinates.size());
    }
}
