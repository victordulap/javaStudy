package com.step.egoist;

public class EgoistDemo {
    public static void main(String[] args) {
        FirEgoist f1 = new FirEgoist("Firul-1");
        FirEgoist f2 = new FirEgoist("Firul-2");

//        f1.setPriority(10);
        f1.setPriority(Thread.MAX_PRIORITY);
        f1.start();
        f2.start();
    }
}
