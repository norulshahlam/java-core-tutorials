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

class AtomicCounter {

    // 1.
    AtomicInteger count = new AtomicInteger();
    public void increment() {
        count.incrementAndGet();
    }
}

// 2.
// class AtomicCounter {
//   int count = 0;

//   public synchronized void increment() {
//     count++;
//   }
// }

class ThreadSafeFour {
    @Test
    void test() throws InterruptedException {

        AtomicCounter c = new AtomicCounter();
        // thread1
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000000; i++)
                c.increment();
        });
        // thread2
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000000; i++)
                c.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
