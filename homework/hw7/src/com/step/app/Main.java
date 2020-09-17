package com.step.app;

import com.step.calculator.Calculator;
import com.step.comparator.NumbersComparator;
import com.step.converter.TempConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ex1 (era mai bine daca faceam methods statice, dar am facut dupa conditie)
        TempConverter tempConverter = new TempConverter();
//
//        tempConverter.convertToFahr(100);
//        tempConverter.convertToCelsius(100);

        //ex 2
//        Scanner sc = new Scanner(System.in);
//
//        TempConverter tempConverter = new TempConverter();
//
////        unecesarry
////        int nrToScan = sc.nextInt();
//        tempConverter.convertToFahr(sc.nextInt());

        //ex 3
//        Scanner sc = new Scanner(System.in);
//
//        int operation = 0;
//        do {
//            System.out.println("Select operations:");
//            System.out.println("1.\t+:");
//            System.out.println("2.\t-:");
//            System.out.println("3.\t*:");
//            System.out.println("4.\t/:");
//            operation = sc.nextInt();
//        } while (operation < 1 || operation > 4);
//
//        int nr1 = 0, nr2 = 0;
//        System.out.print("Enter nr1: ");
//        nr1 = sc.nextInt();
//        System.out.print("Enter nr2: ");
//        nr2 = sc.nextInt();
//
//        switch (operation)
//        {
//            case 1: {
//                System.out.println(nr1 + " + " + nr2 + " = " + Calculator.sum(nr1, nr2));
//                break;
//            }
//            case 2: {
//                System.out.println(nr1 + " - " + nr2 + " = " + Calculator.difference(nr1, nr2));
//                break;
//            }
//            case 3: {
//                System.out.println(nr1 + " * " + nr2 + " = " + Calculator.multiply(nr1, nr2));
//                break;
//            }
//            case 4: {
//                System.out.println(nr1 + " / " + nr2 + " = " + Calculator.division(nr1, nr2));
//                break;
//            }
//        }

        //ex 4
        Scanner sc = new Scanner(System.in);

        System.out.print("enter nr1: ");
        int nr1 = sc.nextInt();

        System.out.print("enter nr2: ");
        int nr2 = sc.nextInt();

        int option = 0;
        do {
            System.out.println("Select option:");
            System.out.println("1.\tmaximum");
            System.out.println("2.\tminimum");
            option = sc.nextInt();
        } while (option < 1 || option > 2);

        switch (option) {
            case 1: {
                System.out.println("Maximum of [" + nr1 + ", " + nr2 + "]" + " is: " + NumbersComparator.maximum(nr1, nr2));
                break;
            }
            case 2: {
                System.out.println("Minumum of [" + nr1 + ", " + nr2 + "]" + " is: " + NumbersComparator.minimum(nr1, nr2));
                break;
            }
        }
    }
}
