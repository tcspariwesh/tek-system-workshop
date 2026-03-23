package com.zeta;

public class Worker extends Thread {
    private final static Object lock = new Object();

    public Worker(String string) {
        super(string);
    }

    public void run() {
        if(getName().equals("staff1")) {
            synchronized(lock) {
                try {
                    System.out.println("staff1 going into wait...");
                    lock.wait(); // staff1 stops here forever
                    System.out.println("staff1 resumed"); // never reached
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // staff2 notifies
        if (getName().equals("staff2")) {
            synchronized (lock) {
                System.out.println("staff2 notifying...");
                lock.notify();   // wakes staff1
            }
        }

        // both continue after wait/notify
        for (int i = 0; i < 3; i++) {
            System.out.println(getName() + " running: " + i);
        }

    }
}

class Counter {
    int count = 0;

    void increment() {
        System.out.println("inside = " + count);
        synchronized (this) {
            for(;;)
                count++;
        }
    }

    synchronized int getValue() {
        return count;
    }
}

class Worker1 extends Thread {
    private Counter counter;

    public Worker1(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        System.out.println("Worker running, daemon = " + Thread.currentThread().isDaemon());
        counter.increment();
    }
}