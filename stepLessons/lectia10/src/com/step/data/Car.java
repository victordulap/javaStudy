package com.step.data;

public class Car extends Vehicle {

    private boolean isSport;

    @Override
    protected void startEngine() {
        super.startEngine();
    }

    @Override
    public void run(int x) {
        // chemam run din Vehicle
        // super = clasa parinte
        super.run();
        System.out.println("Car is running...");
    }

    public void accelerate() {
    }
}
