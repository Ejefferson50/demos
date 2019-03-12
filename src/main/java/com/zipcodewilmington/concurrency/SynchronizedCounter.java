package com.zipcodewilmington.concurrency;

public class SynchronizedCounter implements Runnable {
    private int count = 0;

    public void run() {
        for(int i = 0; i < 1_000_000; i++) {
            incrementCount();
        }
        String currentThread = Thread.currentThread().toString();
        System.out.println("THREAD FINISHED: " + currentThread);
    }

    public synchronized void incrementCount() {
        count+=1;
    }

    public int getCount() {
        return count;
    }
}
