package com.step.abstaction;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("red", 5.5);
        System.out.println(square.getPerimeter());
        System.out.println(square.getSurface());
        System.out.println(square.getName());

        Shape[] shapes = new Shape[2];
        Shape[0] = new Square("blue", 2);
    }
}
