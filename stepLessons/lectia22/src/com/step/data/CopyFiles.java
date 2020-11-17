package com.step.data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFiles {
    public static void copyFile() {
        try {
            FileReader reader = new FileReader
                    ("D:\\" + "javaCodes\\" +
                            "codes\\stepLessons" +
                            "\\lectia22\\test.txt");

            // daca file-ul nu exista,
            // el automat il creeaza
            FileWriter writer = new FileWriter
                    ("D:\\" + "javaCodes\\" +
                    "codes\\stepLessons" +
                    "\\lectia22\\test_copy.txt");

            int character; // return -1 cand nu mai are
                           // ce citi
            while((character = reader.read()) != -1) {
                writer.write(character);
            }

            //copy 10 files
//            for (int i = 0; i < 10; i++) {
//                FileWriter writer2 = new FileWriter
//                        ("D:\\javaCodes\\" +
//                                "codes\\stepLessons" +
//                                "\\lectia22\\" +
//                                "test_copy" +
//                                i +".txt");
//                FileReader reader2 = new FileReader
//                        ("D:\\" + "javaCodes\\" +
//                                "codes\\stepLessons" +
//                                "\\lectia22\\test.txt");
//
//                while((character = reader2.read()) != -1) {
//                    writer2.write(character);
//                }
//
//                writer2.close();
//            }

            reader.close();
            writer.close();
        }// putem pune IOException in loc
        // de FileNotFoundException, pentru
        // ca FileNotFoundException mosteneste
        // de la IOException
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
