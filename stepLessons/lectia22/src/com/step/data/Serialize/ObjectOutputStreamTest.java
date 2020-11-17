package com.step.data.Serialize;

import java.io.*;

public class ObjectOutputStreamTest {
    public static void run() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:" +
                    "\\javaCodes\\codes\\stepLessons\\lectia22\\test.vd");
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(fileOutputStream);

            Person[] people = {new Person("Vasea"),
                    new Person("jora")};
            for (Person person : people) {
                objectOutputStream.writeObject(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
