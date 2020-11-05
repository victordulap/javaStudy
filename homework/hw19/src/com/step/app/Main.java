package com.step.app;

import com.step.data.Person;

import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static void ex1() {
        System.out.println("ex 1: ");

        /*
            Scrieți un program Java pentru a crea lista,
            adăugați câteva culori (șir) și imprimați colecția
         */

//        Set<String> colors = new HashSet<>();
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("pink");
        colors.add("violet");
        colors.add("brown");
        colors.add("black");
        colors.add("white");
        colors.add("gray");
        colors.add("cyan");
//        colors.add("cyan");

        for (String color : colors) {
            System.out.println(color);
        }
    }

    private static void ex2() {
        System.out.println("ex 2: ");

        /*
            Scrieți un program Java care inseareaza 10 elemente intr-un ArrayList,
            dar fiecare element nou este inserat in prima pozitie a listei.
         */

        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ints.add(0, i);
        }

        for (int number : ints) {
            System.out.println(number);
        }
    }

    private static void ex3() {
        System.out.println("ex 3: ");

        /*
            Scrieți un program Java pentru a extrage un element (la un index specificat) dintr-un ArrayList.
         */

        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ints.add(i);
        }

        int index = -1;
        do {
            try {
                System.out.print("enter index: ");
                index = sc.nextInt();

                System.out.println("ints[" + index + "] = " + ints.get(index));
            } catch (IndexOutOfBoundsException e) {
                if (index >= 0)
                    System.out.println("Max index is " + (ints.size() - 1) + ", try again");
                else
                    System.out.println("Exiting...");
            } catch (InputMismatchException e) {
                System.out.println("Invalid integer format, try again (example: 0)");
            } finally {
                sc.nextLine();
            }
        } while (index >= 0);
    }

    private static void ex4() {
        System.out.println("ex 4: ");

        /*
            Scrieti un program java capabil sa combine 2 ArrayList-uri cu valori de tip String.
        */

        List<String> stringList1 = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringList1.add(Integer.toString(i));
            stringList2.add(Integer.toString(i));
        }

        List<String> concatenatedStringList = new ArrayList<>(stringList1);
        concatenatedStringList.addAll(stringList2);

        for (String str : concatenatedStringList) {
            System.out.println(str);
        }
    }

    private static void ex5() {
        System.out.println("ex 5: ");

        /*
            Scrieți un program Java pentru a căuta un element de tip String dintr-un ArrayList.
        */

        List<String> stringList = new ArrayList<>();
        for (int i = -10; i < 10; i++) {
            stringList.add(Integer.toString(i));
        }

        while (true) {
            String toSearch = sc.nextLine();
            if (stringList.contains(toSearch))
                System.out.println(toSearch + ", found");
            else {
                System.out.println("No such string in this list");
                break;
            }
        }
    }

    private static void ex6() {
        System.out.println("ex 6: ");

        /*
            Scrieti un program capabil sa caute elemente de tip Person intr-un ArrayList,
            unde Person este o clasa cu un singur atribut String name;
        */

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            people.add(new Person("pers" + i));
        }

        int indexOfPersonFound = people.indexOf(new Person("pers3"));
        if (indexOfPersonFound >= 0) {
            System.out.println("person found");
        } else {
            System.out.println("person not found");
        }
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
