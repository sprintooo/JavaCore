package com.sprinto.concurrency;

import java.time.Duration;

public class Thread1 extends Thread {

    public Thread1(String name) {
        super(name);
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(Duration.ofNanos(1));
            } catch (InterruptedException e) {
                System.out.println("Thread 1 Interrupted");
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread() + " " + i);
        }
    }
}
