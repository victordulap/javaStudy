package com.step.classes.creature;

import java.util.Date;

public class Human {
    public String name;
    public String familyName;
    public String race;
    public float height;
    public short weight;
    public short age;
    public Date birthDate;
    public boolean happy;

    public void Eat(int kcal) {
        weight += 0.01f * kcal;
    }

    public void Exercise(int kcal) {
        weight -= 0.01f * kcal;
    }

    public boolean respondToAnimalFoodRequest(){
        if(this.happy) return true;
        else return false;
    }
}
