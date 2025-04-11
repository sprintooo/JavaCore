package com.sprinto.concurrency.threadSignaling;

public class MyWaitNotify {

    public void doWait(){
        synchronized (this) {
            try {
                System.out.println("Waiting...");
                Thread.sleep(3000);
                wait();
                System.out.println("Done waiting...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void doNotify(){
        synchronized (this) {
            System.out.println("Notifying...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            notifyAll();
            System.out.println("Done notifying...");
        }
    }
}
