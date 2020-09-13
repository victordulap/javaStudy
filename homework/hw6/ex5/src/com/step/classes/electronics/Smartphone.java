package com.step.classes.electronics;

public class Smartphone {
    public String brand;
    public String model;
    public float screenDiagonal;
    public int screenWidth;
    public int screenHeight;
    public int battery;
    public float cpuClock;
    public byte cpuThreads;
    public boolean wifi;
    public boolean bluetooth;
    public boolean rotateScreen;

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void setRotateScreen(boolean rotateScreen) {
        this.rotateScreen = rotateScreen;
    }
}
