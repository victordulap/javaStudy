package com.step.data.Serialize;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamTest {
    public static void run() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("D:\\javaCodes\\codes\\stepLessons\\lectia22\\test.vd"));
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readChar());
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
