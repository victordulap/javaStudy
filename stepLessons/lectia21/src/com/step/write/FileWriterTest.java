package com.step.write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void writeDateToFile() {
        try {
            FileWriter writer = new FileWriter("D:" +
                    "\\javaCodes\\codes\\stepLessons" +
                    "\\lectia21\\text.txt", true);
            Person p1 = new Person
                    ("Ion", "Mocanu");
            Person p2 = new Person
                    ("Dumitru", "Popescu");
            writer.write(p1.toString() + "\n");
            writer.write(p2.toString() + "\n");

            // tramitem pe disc
//            1
//            writer.flush();

//            2 (mai bun)
            writer.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
