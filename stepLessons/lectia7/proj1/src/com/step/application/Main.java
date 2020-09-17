package com.step.application;

import com.step.auto.Car;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();

        car1.doors = 4;
        car1.model = "Vasea";

        Car car2 = new Car();

        car2.doors = 4;
        car2.model = "Vasea";

        System.out.println(car1.equals(car2));
    }
}
