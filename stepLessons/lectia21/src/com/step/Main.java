package com.step;

import com.step.read.ReadDataCSV;
import com.step.write.FileWriterTest;
import com.sun.corba.se.pept.transport.ReaderThread;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) /* throws IOException */ {
//        FileWriterTest.writeDateToFile();
        ReadDataCSV.readWithScanner();

        System.out.println("------------------------");

        ReadDataCSV.readWithBuffer();
    }


}
