package com.step;

import com.step.data.Manager;
import com.step.data.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Manager m1 = new Manager();
        Manager m2 = new Manager();
        Manager m3 = new Manager();

        List<Manager> managers = new ArrayList<>();
        managers.add(m1);
        managers.add(m2);
        managers.add(m3);

        // in loc de a crea de fiecare date cate o clasa care implementeaza comparator
        managers.sort(new Comparator<Manager>() {
            @Override
            public int compare(Manager o1, Manager o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
