package com.step.data.menu;

import java.util.Scanner;

public class Utilities {
    private static Scanner sc = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //not working ^

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void enterAnyValueToContinue() {
        System.out.println("Enter any value to continue...");
        sc.nextLine();
    }

    public static void enterAnyValueToContinue(String messageInsteadOfContinue) {
        System.out.println("Enter any value to " + messageInsteadOfContinue + "...");
        sc.nextLine();
    }

    public static String firstLetterUpperCase(String str) {
        str = str.toLowerCase();
        str = str.substring(0, 1).toUpperCase() + str.substring(1);

        return str;
    }

    //used for tabulation
    public static String generateMultipleChars(int n, char c) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++) {
            str.append(c);
        }

        return str.toString();
    }

    // inserts word with n spaces needed
    public static String insertWordWithNSpaces(int maxLength, String word) {
        StringBuilder str = new StringBuilder();
        str.append(word);

        int n = maxLength - word.length();
        for (int i = 0; i < n; i++) {
            str.append(' ');
        }

        return String.valueOf(str);
    }
}
