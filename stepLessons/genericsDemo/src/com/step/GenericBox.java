package com.step;

public class GenericBox <T, E> {

    private T value;
    private E otherValue;

    public GenericBox(T value, E otherValue) {
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
