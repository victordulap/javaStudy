package com.step.sync;

public class BufferSync implements IBuffer {
    private int number = -1;
    private boolean available = false;

//    synchronized, nu permite accesarea
//    metodei din acest obiect din mai mult
//    de un fir la un timp
    public synchronized int get() {
        while (!available) {
            // asteptam
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        this.available = false;
        notifyAll();
        return number;
    }

    public synchronized void put (int number) {
        while (available) {
            // asteptam
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        this.number = number;
        this.available = true;
        notifyAll();
    }
}
