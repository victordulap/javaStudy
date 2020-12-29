package com.step;

public class CalcLambda {
    public static void main(String[] args) {
        double a = 10;
        double b = 25;
        MathOperation sum = (x, y) -> x + y;
        MathOperation subtract = (x, y) -> x - y;
        MathOperation multiply = (x, y) -> x * y;
        MathOperation divide = (x, y) -> x / y;

        System.out.println("sum: " + sum.execute(a, b));
        System.out.println("subtract: " + subtract.execute(a, b));
        System.out.println("multiply: " + multiply.execute(a, b));
        System.out.println("divide: " + divide.execute(a, b));
    }
}

@FunctionalInterface
interface MathOperation {
    public double execute(double a, double b);
}
