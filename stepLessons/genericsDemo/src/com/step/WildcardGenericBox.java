package com.step;

import java.util.Arrays;
import java.util.List;

public class WildcardGenericBox<T extends Number> {
    private List<T> numbers;

    public WildcardGenericBox(List<T> numbers) {
        this.numbers = numbers;
    }

    public void print() {
        this.numbers.forEach(n -> System.out.println(n));
    }

    public static void printIntList(List<? extends Integer> ints) {
        ints.forEach(n -> System.out.println(n));
    }
}

class WildcardGenericBoxDemo {
    public static void main(String[] args) {
        WildcardGenericBox<Integer> box = new WildcardGenericBox<>(Arrays.asList(1, 2, 3));

    }
}
