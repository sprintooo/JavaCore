package com.sprinto.concurrency;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread() + " " + i);
        }
    }
}
