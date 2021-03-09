package com.step;

public class NumbersPrinter {
    private int a, b, step;

    public NumbersPrinter(int a, int b, int step) {
        this.a = a;
        this.b = b;
        this.step = step;
    }

    public void execute() {
        for (int i = a; i <= b; i += step) {
            System.out.print(i + " ");
        }
    }
}
