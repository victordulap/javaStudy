package com.step.sync;

public class Consumer extends Thread{
    private IBuffer buffer;

    public Consumer(IBuffer buffer) {
        super("Consumer");
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Consumer received: " + buffer.get());
        }
    }
}
