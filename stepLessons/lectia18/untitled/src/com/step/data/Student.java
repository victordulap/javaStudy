package com.step.data;

//
public class Student implements Comparable<Student> {
    public String name;
    public Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        // 0 - =
        // -n - <
        // +n - >

        return this.age.compareTo(o.age);
    }
}
