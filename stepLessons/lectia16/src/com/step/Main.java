package com.step;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("1");
        strings.add(null);

        // foloseste metoda equals din clasa folosita de noi
        strings.contains("2");

        System.out.println(strings.size());

        // LinkedList memorie peste tot, fiecare element pastreaza valoarea adresei precedente si next
        // dar ArrayList se pastreaza consecutiv ca un array
        LinkedList<Integer> integers = new LinkedList<>();
    }
}
