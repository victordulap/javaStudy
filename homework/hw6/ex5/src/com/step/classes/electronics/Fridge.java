package com.step.classes.electronics;

public class Fridge {
    public String model;
    public float sizeX;
    public float sizeZ;
    public float sizeY;
    public byte fridgeTemperature;
    public byte freezerTemperature;
    public byte innerLigthing;

    public void setFridgeTemperature(byte fridgeTemperature) {
        this.fridgeTemperature = fridgeTemperature;
    }

    public void setFreezerTemperature(byte freezerTemperature) {
        this.freezerTemperature = freezerTemperature;
    }

    public void setInnerLigthing(byte innerLigthing) {
        if (innerLigthing < 0) innerLigthing = 0;
        else if (innerLigthing > 100) innerLigthing = 100;

        this.innerLigthing = innerLigthing;
    }
}
