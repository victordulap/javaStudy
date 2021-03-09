package com.step;

public class NumbersPrinterWithThread extends Thread {
    private int a, b, step;

    public NumbersPrinterWithThread(int a, int b, int step) {
        this.a = a;
        this.b = b;
        this.step = step;
    }

    public void execute() {
        for (int i = a; i <= b; i += step) {
            System.out.print(i + " ");
        }
    }

//    codul care se executa in alt fir de executie
    @Override
    public void run() {
        execute();
    }
}
