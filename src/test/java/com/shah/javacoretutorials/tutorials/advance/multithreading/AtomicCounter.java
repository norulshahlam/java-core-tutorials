package com.shah.javacoretutorials.tutorials.advance.multithreading;
/* 
Thread safe means that multiple threads can use a method or class instance at the same time without any problems occurring.

Here we demonstrate to ensure thread-safe by using:

1. AtomicInteger - use this class as ref and use incrementAndGet() to count
2. synchronized - use this keyword in your method. It only calls by 1 thread at a time. If t1 is executed, t2 have to wait.

We also we can create thread using anonymous class instead of creating a new class n extends thread
 */

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

class AtomicCounter {

    // 1.
    AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
    }
}

class ThreadSafeFour {
    @Test
    void testUsingAtomic() throws InterruptedException {

        AtomicCounter c = new AtomicCounter();
        // thread1
        Thread t1 = new Thread(() -> IntStream
                .range(0, 1000000).forEach(i -> c.increment()));
        // thread2
        Thread t2 = new Thread(() -> IntStream
                .range(0, 1000000).forEach(i -> c.increment()));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }

}

class AtomicCounter2 {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

class ThreadSafeFourr {
    @Test
    void testUsingAtomic() throws InterruptedException {

        AtomicCounter2 c = new AtomicCounter2();
        // thread1
        Thread t1 = new Thread(() -> IntStream
                .range(0, 1000000).forEach(i -> c.increment()));
        // thread2
        Thread t2 = new Thread(() -> IntStream
                .range(0, 1000000).forEach(i -> c.increment()));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
