package com.zipcodewilmington.concurrency;

import org.junit.Test;

public class SynchronizedCounterTest {
    @Test
    public void demoSynchronizedMethod() {
        SynchronizedCounter runnable= new SynchronizedCounter();
        Thread first = new Thread(runnable);
        Thread second = new Thread(runnable);
        first.start();
        second.start();

        ThreadUtils.sleep(5000); // sleep 5 seconds
        System.out.println(runnable.getCount());
    }
}
