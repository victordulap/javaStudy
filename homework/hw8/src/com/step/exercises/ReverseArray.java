package com.step.exercises;

public class ReverseArray {
    public static int[] reverseArray(int[] arrToReverse) {
        int[] arr = new int[arrToReverse.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrToReverse[arrToReverse.length - i - 1];
        }

        return arr;
    }
}
