package com.step.classes.electronics;

public class Headset {
    public String model;
    public boolean microfone;
    public int volume;

    public void setVolumeUp() {
        this.volume++;
    }
    public void setVolumeDown() {
        this.volume--;
    }
}
