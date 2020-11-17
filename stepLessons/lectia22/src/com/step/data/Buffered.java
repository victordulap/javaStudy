package com.step.data;

import java.io.*;

// ne straduim cand avem de lucrat cu file sa folosim
// buffered orice
public class Buffered {
    public static void read() {
        File fileToRead = new File("D:\\"
                + "javaCodes\\" +
                "codes\\stepLessons" +
                "\\lectia22\\test.txt");
        try {
            FileReader fileReader = new FileReader(fileToRead);
            BufferedReader bufferedReader = new
                    BufferedReader(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
