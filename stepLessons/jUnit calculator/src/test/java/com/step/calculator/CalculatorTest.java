package com.step.calculator;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase{
    @Test
    public void testAdd_positiveNumbers() {
        // 1. creem o instanta de clasa care o testam
        // (ii recomandat sa facem asta inauntru la functie)
        Calculator calc = new Calculator();

        Double sum = calc.add(2.0, 3.0);

        // testam
        assertEquals(5.0, sum);
    }

    @Test
    public void testAdd_negativeNumbers() {
        Calculator calc = new Calculator();
        assertEquals(-5.0, calc.add(-2.0, -3.0));
    }

    @Test
    public void testAdd_nullNumbers() {
        Calculator calc = new Calculator();
        assertEquals(1.0, calc.add(null, 1.0));
        assertEquals(1.0, calc.add(1.0, null));
    }

    @Test(expected = OperationFailedException.class)
    public void testAddNonNull() throws OperationFailedException {
        Calculator calc = new Calculator();
        calc.addNonNullValues(null, 1.0);
    }
}
