package com.step.read;

import java.io.*;
import java.util.Scanner;

public class ReadDataCSV {
    public static void readWithScanner() {
        try {
            File file = new File("D:\\javaCodes\\codes\\" +
                    "stepLessons\\lectia21\\text.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
                // aici facem new Employee cu string.split si in
                // Employee facem toString supra-scriere
            }
        } catch (FileNotFoundException ex) {

        }
    }

    public static void readWithBuffer() {
        try {
            File file = new File("D:\\javaCodes\\codes\\" +
                    "stepLessons\\lectia21\\text.txt");
            if (!file.exists()) {
                boolean fileCreatedSuccessfully = file.createNewFile();
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}
