package com.step.data.Serialize;

import java.io.*;

public class DataOutputStreamTest {
    public static void run() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:" +
                    "\\javaCodes\\codes\\stepLessons\\lectia22\\test.vd");
            DataOutputStream dataOutputStream =
                    new DataOutputStream(fileOutputStream);

            dataOutputStream.writeInt(123);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeChar('c');
            dataOutputStream.writeUTF("string");
            dataOutputStream.writeUTF("Вася"); // UTF-8
            dataOutputStream.writeUTF(String.valueOf(new Person("vd"))); // UTF-8
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

