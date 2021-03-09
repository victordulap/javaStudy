package com.step;

// extends -> T extends from Number (Integer, Double etc)
//         -> E extends from Person (NonWorker, SpecialEmployee etc)
// super   -> X super SpecialEmployee (Employee, Person etc)
public class BoundedGenericBox<T extends Number, E extends Person> {
    private T value;
    private E otherValue;

    public BoundedGenericBox(T value, E otherValue) {
        this.value = value;
        this.otherValue = otherValue;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public E getOtherValue() {
        return otherValue;
    }

    public void setOtherValue(E otherValue) {
        this.otherValue = otherValue;
    }
}

class BoundedGenericBoxDemo {
    public static void main(String[] args) {
        BoundedGenericBox<Integer, Employee> box = new BoundedGenericBox<>(123, new Employee());
        BoundedGenericBox<Double, specialEmployee> box2 = new BoundedGenericBox<>(10.2, new specialEmployee());
    }
}

class Person {
    String name;
}

class Employee extends Person {
    double salary;
}

class nonWorkers extends Person {
    double freeTime;
}

class specialEmployee extends Employee {
    String speciality;
}