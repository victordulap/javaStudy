package com.step.egoist;

public class FirEgoist extends Thread {

    public FirEgoist(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while(i < 100000) {
            if (i % 100 == 0) {
                System.out.println(getName() + " a ajuns la: " + i);
            }
            i++;
        }
    }
}
