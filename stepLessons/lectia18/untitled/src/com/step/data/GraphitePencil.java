package com.step.data;

public class GraphitePencil implements Pencil {

    public void sketch() {
        System.out.println("sketching");
    }

    @Override
    public void draw() {
        //Pencil.x;
        System.out.println("Drawing monochrome");
    }

    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
