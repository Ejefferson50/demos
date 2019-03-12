package com.zipcodewilmington.concurrency;

import org.junit.Test;

public class SynchronousCounterTest {
    @Test
    public void demoSynchronousBlock() {
        SynchronousCounter runnable = new SynchronousCounter();
        Thread first = new Thread(runnable);
        Thread second = new Thread(runnable);
        first.start();
        second.start();

        ThreadUtils.sleep(5000); // sleep 5 seconds
        System.out.println(runnable.getCount());
    }

}
