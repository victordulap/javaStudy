package com.step.calculator;

// avem nevoie de un calculator
// operatiile pe care trebuie sa le suporte:
// add, subtract, multiply, divide
// add - 2 double arguments, return sum (double)
public class Calculator {
    public Double add(Double num1, Double num2) {
//        return 0.0;

        num1 = num1 == null ? 0.0 : num1;
        num2 = num2 == null ? 0.0 : num2;

        return num1 + num2;
    }

    public Double addNonNullValues(Double num1, Double num2) throws OperationFailedException {
        if(num1 == null || num2 == null) {
            throw new OperationFailedException("Expected non-null parameters");
        }

        return num1 + num2;
    }
}
