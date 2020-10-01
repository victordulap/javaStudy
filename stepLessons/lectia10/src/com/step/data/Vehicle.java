package com.step.data;

public class Vehicle {
    protected String model;
    protected String number;

    public void run() {
        this.startEngine();
        System.out.println("Engine started...");
    }

    protected void startEngine() {

    }

    public void stop() {

    }

    public void beep() {

    }
}
