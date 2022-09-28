package com.shah.javacoretutorials.tutorials.advance.multithreading;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

/*
https://www.digitalocean.com/community/tutorials/atomicinteger-java

Atomic operations are performed in a single unit of task without interference from other operations. Atomic operations are necessity in multi-threaded environment to avoid data inconsistency.
 */
class JavaAtomicInteger {
    @Test
    void test() throws InterruptedException {

        ProcessingThread pt = new ProcessingThread();
        ProcessingThread pt2 = new ProcessingThread();
        ProcessingThread pt3 = new ProcessingThread();

        pt.start();
        pt3.start();
        pt2.start();

        pt3.join();
        pt.join();
        pt2.join();

        System.out.println("Processing count=" + pt.getCount());
    }
}

class ProcessingThread extends Thread {
    private final AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            count.incrementAndGet();
        }
    }

    public int getCount() {
        return this.count.get();
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i * 100);
            System.out.println(Thread.currentThread() + " delayed, called " + i + " times");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}