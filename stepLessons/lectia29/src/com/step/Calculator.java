package com.step;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }
}

class Demo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2.0, 1);
        calculator.multiply(2, 6);
    }
}
