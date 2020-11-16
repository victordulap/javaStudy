package com.step;

import java.util.Objects;

public class Student {
    private String name;
    private String idnp;

    public String getIdnp() {
        return idnp;
    }

    public String getName() {
        return name;
    }

    public Student(String name, String idnp) {
        this.name = name;
        this.idnp = idnp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idnp='" + idnp + '\'' +
                '}';
    }
}
