package com.step.data;

public class ColoredPencil implements Pencil {

    public String str;

    public void colorStuff() {
        System.out.println("Coloring stuff");
    }

    @Override
    public void draw() {
        //Pencil.x;
        System.out.println("Drawing in color");
    }

    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
