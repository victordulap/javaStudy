package com.step;

public class Main {

    public static void main(String[] args) {
//        NumbersPrinter n1 = new NumbersPrinter(1, 10, 1);
//        NumbersPrinter n2 = new NumbersPrinter(20, 40, 2);
//
//        numbers are printed, first n1 all, second all n2 numbers
//        n1.execute();
//        System.out.println("");
//        n2.execute();

////        with extending Thread
//        NumbersPrinter n = new NumbersPrinter(200, 300, 2);
//        NumbersPrinterWithThread nThreaded = new NumbersPrinterWithThread(0, 100, 2);
//
////        start porneste firul de executie si ruleaza run();
////        numbers are printed randomly
//        nThreaded.start();
//        n.execute();

//        with implementing Runnable
        NumbersPrinter n = new NumbersPrinter(200, 300, 2);
        NumbersPrinterWithRunnable nThreaded = new NumbersPrinterWithRunnable(0,100,  2);
        Thread numbersThread = new Thread(nThreaded);
        numbersThread.start();
        n.execute();
    }
}
