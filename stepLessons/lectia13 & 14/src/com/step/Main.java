package com.step;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String... args) {
        //lectia 13

//        Integer val1 = new Integer(10);
//        Integer val2 = Integer.valueOf(10);
//        //autoboxing
//        Integer val3 = 10;
//
//        System.out.println(val1.intValue() > val2.intValue());
//        // ==
//        // unboxing
//        System.out.println(val1 > val2);
//
//        // doar prin equals pentru ca == compara obiectele prin memorie
//        System.out.println(val1.equals(val2));
//
//
//        // var args
//        System.out.println(addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 100, 1, 3));
//        System.out.println(addAll(1, 2));
//        System.out.println(addAll(new int[]{1, 2, 3, 4, 5, 5}));

//        System.out.println("days: ");
////        for (DaysOfWeek day: DaysOfWeek.values()){
////            System.out.println(day);
////        }
//        DaysOfWeek[] days = DaysOfWeek.values();
//        for (int i = 0; i < days.length; i++) {
//            System.out.println("\t" + (i + 1) + ". " + days[i]);
//        }
//
//        System.out.print("enter day: ");
//        String day = sc.nextLine();
//
//        checkDay(day);

//        System.out.print("enter gender: ");
//        String gen = sc.nextLine();
//        Gender gender = Gender.valueOf(gen);

        //lectia 14

    }

    public static void checkDay(String day) {
        DaysOfWeek daysOfWeek = null;

        try {
            daysOfWeek = DaysOfWeek.valueOf(day.toUpperCase());
        } catch (Exception e) {
            System.out.println("Day invalid");
        }
        switch (daysOfWeek) {
            case MONDAY:
            case TUESDAY:
            case THURSDAY:
            case WEDNESDAY:
            case FRIDAY:
                System.out.println(daysOfWeek.toString().toLowerCase() + " is a working day");
                break;
            default:
                System.out.println(daysOfWeek.toString().toLowerCase() + " is a weekend");
                break;
        }
    }

    // no var args
    public static int addAll(int a, int b) {
        return a + b;
    }

    // var args (se interpreteaza ca array)
    public static int addAll(/*String str, */int... numbers) {
        int sum = 0;

        System.out.println(numbers.length);

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
