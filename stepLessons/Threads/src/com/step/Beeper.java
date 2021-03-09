package com.step;

public class Beeper extends Thread {

    @Override
    public void run() {
        while(true) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
