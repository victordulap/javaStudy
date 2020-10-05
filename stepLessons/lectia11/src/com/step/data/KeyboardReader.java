package com.step.data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardReader {

    // 1. introdu un numar pana cand nu introduce un numar corect
    Scanner sc = new Scanner(System.in);

    public void enterNumberUntilValid() {
        boolean isValid = false;
        int val;

        do {
            try {
                val = enterNumber();

                isValid = true;
            //} catch (Exception e) {
            } catch (NumberNotValidException e) {
                System.out.println(e.getMessage());
                System.out.println("Please, try again.");
            }
        } while (!isValid);
    }

    //public int enterNumber() throws Exception {
    public int enterNumber() throws NumberNotValidException {
        int val;

        System.out.print("Please enter a number: ");
        try {
            val = sc.nextInt();
            return val;
        } catch (InputMismatchException e) {
            sc.nextLine(); // reset scanner ca sa omitem errori de infinitate (da asa citeste string)
            System.out.println("Incorrect format, try again...");
            //throw new Exception("Exception: data specified is not a number");
            throw new NumberNotValidException();
        }
    }
}
