package com.step.data.Serialize;

import java.io.*;

public class ObjectInputStreamTest {
    public static void run() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("D:\\javaCodes\\codes\\stepLessons\\lectia22\\test.vd"));
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(dataInputStream);

            Person[] people = new Person[2];
            for (Person person: people) {
                Object o = objectInputStream.readObject();
                person = (Person) o;
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
