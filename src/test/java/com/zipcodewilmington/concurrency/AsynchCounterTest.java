package com.zipcodewilmington.concurrency;

import org.junit.Test;

public class AsynchCounterTest {
    @Test
    public void demoAsynch() {
        AsynchCounter runnable = new AsynchCounter();
        Thread first = new Thread(runnable);
        Thread second = new Thread(runnable);
        first.start();
        second.start();

        ThreadUtils.sleep(5000); // sleep 5 seconds
        System.out.println(runnable.getCount());
    }
}
