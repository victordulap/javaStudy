package com.step.app;

import com.step.Demo;

public class Main {

    public static void f(int[] arr) {
        arr[0] = 1337;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {

        System.out.println(arr[i]);
        }

        f(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
