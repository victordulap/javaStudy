package com.step;

import java.io.IOException;
import java.util.Scanner;

public class PlayBeeper {
    public static void main(String[] args) throws IOException {
        Beeper beeper = new Beeper();
//        to make beeper stop automaticly when main ends
        beeper.setDaemon(true);
        beeper.start();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }
}
