package com.step.classes.creature;

import java.util.Date;

public class Cat {
    public String name;
    public String race;
    public byte age;
    public Date birthDate;
    public byte weight;
    public Human owner;

    public void begForFood() {
        do {
            makeSound();
        } while (!owner.respondToAnimalFoodRequest());
    }

    public void makeSound() {
        System.out.println("Meow");
    }
}
