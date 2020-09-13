package com.step.classes.transport;

import com.step.classes.misc.Key;

public class Bicycle {
    enum BicycleType {
        mtb,
        bmx
    }

    public String brand;
    public String model;
    public int maxSpeed;
    public int retailPrice;
    public double currentSpeed;
    public byte nrOfWheels;
    public byte nrOfDoors;
    public BicycleType type;
    public Key key;

    public void startTransport() {
        currentSpeed = 0;
    }

    public void beep() {
    }

    public void gas() {
        if ((currentSpeed + 0.1) < maxSpeed)
            currentSpeed += 0.1;
    }

    private void jump() {
    }

    public void tryToJump() {
        if(this.type == BicycleType.bmx)
            jump();
    }
}
