package com.step.abstaction;

 class Square extends Polygon {
    private double side;

    protected Square(String color, double length) {
        super(4, "Square", color);
        this.side = length;

    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getSurface() {
        return side * side;
    }
}
