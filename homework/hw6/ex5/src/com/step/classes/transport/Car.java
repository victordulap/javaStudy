package com.step.classes.transport;

import com.step.classes.misc.Key;

public class Car {
    enum CarType {}

    public String brand;
    public String model;
    public int maxSpeed;
    public int retailPrice;
    public double totalDistance;
    public float lvlOfGas;
    public double currentSpeed;
    public byte nrOfWheels;
    public byte nrOfDoors;
    public CarType type;
    public Key key;

    public byte insertKey(Key key) {
        if (this.key._pattern == key._pattern) startTransport();
        else beep();
    }

    public void startTransport() {
        currentSpeed = 0;
    }

    public void beep() {
    }

    public void gas() {
        if ((currentSpeed + 0.1) < maxSpeed)
            currentSpeed += 0.1;
        lvlOfGas -= 0.0001f;
        totalDistance += 0.0001;
    }

}
