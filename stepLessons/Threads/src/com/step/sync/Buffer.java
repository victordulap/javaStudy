package com.step.sync;

public class Buffer implements IBuffer {
    private int number = -1;

    public int get() {
        return number;
    }

    public void put (int number) {
        this.number = number;
    }
}
