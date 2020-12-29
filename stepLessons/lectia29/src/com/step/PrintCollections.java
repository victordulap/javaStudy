package com.step;

import java.util.ArrayList;
import java.util.List;

public class PrintCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("test1");
        list.add("test2");
        list.add("test3");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(String str: list) {
            System.out.println(str);
        }

        // stream api
        list.stream().forEach(s -> {
            System.out.println(s);
        });

//        forEach a fost atat de des folosita, incat
//        la colectii deja sa adaugat forEach() fara stream()
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
