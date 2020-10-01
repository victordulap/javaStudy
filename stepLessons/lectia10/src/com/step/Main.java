package com.step;

import com.step.data.Bus;
import com.step.data.Car;
import com.step.data.Truck;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();
        Truck truck = new Truck();

        car.run();
        bus.run();
        truck.run();
    }
}
