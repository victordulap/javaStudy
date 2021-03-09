package com.step.sync;

public class Producer extends Thread {
    private IBuffer buffer;

    public Producer(IBuffer buffer) {
        super("Producer");
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println("Producer puts: " + i);
        }
    }
}
