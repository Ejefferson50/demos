package com.zipcodewilmington.concurrency;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantCounterTest {
    @Test
    public void demoReentrant() {
        ReentrantLock lock = new ReentrantLock();
        ReentrantCounter runnable = new ReentrantCounter(lock);
        Thread first = new Thread(runnable);
        Thread second = new Thread(runnable);
        first.start();
        second.start();

        ThreadUtils.sleep(5000); // sleep 5 seconds
        System.out.println(runnable.getCount());
    }
}
