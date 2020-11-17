package com.step.data.Serialize;

import java.io.Serializable;

public class Person implements Serializable {

    // un fel de versiune a clasei, cand modificam clasa,
    // modificam si UID
    public static final long serialVersionUID = 1L;

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
