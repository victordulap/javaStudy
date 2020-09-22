package com.step;

import com.step.exercises.*;
import com.step.model.Employee;

import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    static void ex1() {
        System.out.println("ex1");

        int n;

        System.out.print("enter n: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(ArraySum.calcArraySum(arr));
    }

    static void ex2() {
        System.out.println("ex2");

        int n;

        System.out.print("enter n: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        arr = ReverseArray.reverseArray(arr);

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    static void ex3() {
        System.out.println("ex3");

        int n;

        System.out.print("enter n: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("max: " + ArrayMax.maxNumberFromArray(arr));
        System.out.println("min: " + ArrayMax.minNumberFromArray(arr));
    }

    static void ex4() {
        System.out.println("ex4");

        int n = 10;

        char[] arr = new char[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter arr[" + i + "]: ");
            arr[i] = sc.next().charAt(0);
        }

        for (char ch : arr) {
            if (FindInt.isVocal(ch)) {
                System.out.println(ch + " is vocal");
            }
            else if (FindInt.isConsone(ch)) {
                System.out.println(ch + " is consone");
            }
        }
    }

    static void ex5() {
        System.out.println("ex5");

        int operation = 0;
        do {
            System.out.println("Select operations:");
            System.out.println("1.\t+:");
            System.out.println("2.\t-:");
            System.out.println("3.\t*:");
            System.out.println("4.\t/:");
            operation = sc.nextInt();
        } while (operation < 1 || operation > 4);

        double nr1 = 0, nr2 = 0;
        System.out.print("Enter nr1: ");
        nr1 = sc.nextDouble();
        System.out.print("Enter nr2: ");
        nr2 = sc.nextDouble();

        switch (operation)
        {
            case 1: {
                System.out.println(nr1 + " + " + nr2 + " = " + Calculator.sum(nr1, nr2));
                break;
            }
            case 2: {
                System.out.println(nr1 + " - " + nr2 + " = " + Calculator.difference(nr1, nr2));
                break;
            }
            case 3: {
                System.out.println(nr1 + " * " + nr2 + " = " + Calculator.multiply(nr1, nr2));
                break;
            }
            case 4: {
                System.out.println(nr1 + " / " + nr2 + " = " + Calculator.division(nr1, nr2));
                break;
            }
        }
    }

    static void ex6() {
        Employee employee = new Employee("Johnny", "Step", "01-01-2020");

        System.out.println("name: " + employee.getName());
        System.out.println("surname: " + employee.getSurname());
        System.out.println("birthDate: " + employee.getBirthDate());
    }

    public static void main(String[] args) {
        ex1();

        ex2();

        ex3();

        ex4();

        ex5();

        ex6();
    }
}
