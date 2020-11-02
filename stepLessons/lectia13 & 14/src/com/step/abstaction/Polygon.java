package com.step.abstaction;

// daca o clasa abstracta mosteneste de la o alta clasa abstracta, ea nu este obligata sa redifineasca logica metodelor abstracte
public abstract class Polygon extends Shape {
    private int numberOfSides;

    public int getNumberOfSides() {
        return numberOfSides;
    }

    protected Polygon(int numberOfSides, String name, String color) {
        super(name, color);
    }
}
