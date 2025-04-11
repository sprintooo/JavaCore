package com.sprinto.concurrency.threadSignaling;

/**
 * The methods notify() and notifyAll() do not save the method calls to them
 * in case no threads are waiting when they are called.
 * The notify signal is then just lost.
 * Therefore, if a thread calls notify() before the thread to signal has called wait(),
 * the signal will be missed by the waiting thread.
 * This may or may not be a problem,
 * but in some cases this may result in the waiting thread waiting forever,
 * never waking up, because the signal to wake up was missed.
 */

public class AvoidMissedSignal {

    boolean wasSignalled = false;

    public void doWait(){
        synchronized (this) {
            if(!wasSignalled) {
                try {
                    System.out.println("Waiting...");
                    Thread.sleep(3000);
                    wait();
                    System.out.println("Done waiting...");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            wasSignalled = false;
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
            notify();
            wasSignalled = true;
            System.out.println("Done notifying...");
        }
    }

}