package com.step.abstaction;

// calc perimetru, arie
// caracterizarea figurei de nume, culoare
public abstract class Shape {
    private final String name;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    protected Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract double getPerimeter();

    public abstract double getSurface();

    protected void method() {
        System.out.println("123");
    }
}
