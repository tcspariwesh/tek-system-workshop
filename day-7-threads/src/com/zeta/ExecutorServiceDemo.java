package com.zeta;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        try {
            Thread.sleep(2000);
        } catch(Exception e) {

        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executor1 = Executors.newFixedThreadPool(3);
//        ExecutorService executor2 = Executors.newSingleThreadExecutor();

//        executor1.submit(new Worker2());
        executor1.shutdown();
        for (int i = 0; i < 20; i++) {
        	executor1.submit(new Worker2());
            
		}
//        executor1.submit(new Worker2());

//        executor2.submit(new Worker2());
//        executor2.shutdown();
    }
}
