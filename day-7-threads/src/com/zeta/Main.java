package com.zeta;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Worker worker1 = new Worker("staff1");
        worker1.start();
//        worker1.sleep(1000);
//        Thread.yield();
        Worker worker2 = new Worker("staff2");
        worker2.start();
    }
}
