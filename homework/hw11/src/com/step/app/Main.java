package com.step.app;


import com.step.model.Employee;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static void ex2 () {
        /*
            Exercițiu practic #2
            ·        com.step.App.java
            ·        com.step.model.Employee
            De citit de la tastatură o propoziție. De permis utilizatorului să aleagă poziția caracterului care trebuie afișat.
            Exemplu: „Hello world”
            Caracterul: 1 - H, 2 - e, ….
            În cazul in care utilizatorul introduce o poziție care nu există, de afișat: „Out of bounds”.
         */

        System.out.println("--- ex 2 ---");

        System.out.print("enter string: ");
        String str = sc.nextLine();

        int pos;

        for (int i = 0; i < 5; i++) {
            System.out.print(i + ". enter position: ");
            pos = sc.nextInt();

            try {
                System.out.println("char on position " + pos + " is " + str.charAt(pos));
            } catch (StringIndexOutOfBoundsException exception) {
                System.out.println("Out of bounds");
            }
        }
    }

    private static void ex3 () {
        /*
            Exercițiu practic #3
            ·        com.step.App.java
            ·        com.step.model.Employee
            De inițializat un array cu X obiecte de tip Employee.
            De permis utilizatorului să aleagă poziția angajatului, pe care vrea să-l vizualizeze la ecran.
            În cazul în care utilizatorul introduce un element non existent,
            de afișat „Element does not exist. Please enter a value between 0 and Y”
         */

        System.out.println("--- ex 3 ---");

        int n;
        System.out.print("enter n: ");
        n = sc.nextInt();

        Employee[] employee = new Employee[n];

        for (int i = 0; i < n; i++) {
            employee[i] = new Employee("bot_" + i, "robot_" + i, (i + 1) * i);
        }

        int pos;

        for (int i = 0; i < n; i++) {
            System.out.print(i + ". enter position: ");
            pos = sc.nextInt();

            try {
                System.out.println(employee[pos].getName() + " " + employee[pos].getSurname() + " | " + employee[pos].getSalary());
            }
            catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Element does not exist. Please enter a value between 0 and " + (n - 1));
            }
        }
    }

    public static void main(String[] args) {
        ex2();

        ex3();
    }
}
