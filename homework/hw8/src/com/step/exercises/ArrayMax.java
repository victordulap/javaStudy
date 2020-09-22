package com.step.exercises;

public class ArrayMax {
    public static int maxNumberFromArray(int[] arr) {
        int max = -2147483648;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }

        return max;
    }

    public static int minNumberFromArray(int[] arr) {

        int min = 2147483647;

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
        }

        return min;
    }
}
