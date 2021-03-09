package com.step;

import java.io.IOException;
import java.util.Scanner;

public class TimeExecCounter extends Thread {
    private boolean active = true;
    private int seconds = 0;

    @Override
    public void run() {
        while (active) {
            try {
                Thread.sleep(1000);
                seconds++;
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSeconds() {
        return seconds;
    }
}

class Demo {
    public static void main(String[] args) throws IOException {
        TimeExecCounter counter = new TimeExecCounter();
        counter.start();

//        new Scanner(System.in).nextLine();
        System.out.println("Press a button");
        System.in.read();

        counter.setActive(false);
        System.out.println("Spent seconds: " + counter.getSeconds());
    }
}