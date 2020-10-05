package com.step.data;

public class NumberNotValidException extends Exception {

    public NumberNotValidException() {
        super("Exception: data specified is not a number");
    }

    public NumberNotValidException(String message) {
        super(message);
    }
}
