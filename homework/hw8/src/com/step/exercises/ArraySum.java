package com.step.exercises;

public class ArraySum {
    private static int lastSum;

    public static int getLastSum() {
        return lastSum;
    }

    public static int calcArraySum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
