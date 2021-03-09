package com.step.sync;

public class ProdConsDemo {
    public static void main(String[] args) {
//        no sync
//        Buffer buffer = new Buffer();
//        Producer producer = new Producer(buffer);
//        Consumer consumer = new Consumer(buffer);

        // sync
        BufferSync bufferSync = new BufferSync();
        Producer producer = new Producer(bufferSync);
        Consumer consumer = new Consumer(bufferSync);

        producer.start();
        consumer.start();
    }
}
