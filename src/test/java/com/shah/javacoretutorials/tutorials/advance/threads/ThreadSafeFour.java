package com.shah.javacoretutorials.tutorials.advance.threads;
/* 
thread safe means that a method or class instance can be used by multiple
threads at the same time without any problems occuring.

Here we demonstrate to ensure thread-safe by using:

1. AtomicInteger - use this class as ref and use incrementAndGet() to count
2. synchronized - just use this keyword in your method. it only call by 1 thread at a time. if t1 is executing, t2 have to wait.

We also we can create thread using anonymous class instead of creating a new class n extends thread
 */

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

class counter {

    // 1.
    AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
    }
}

// 2.
// class counter {
//   int count = 0;

//   public synchronized void increment() {
//     count++;
//   }
// }

class ThreadSafeFour {
    @Test
    void test() throws InterruptedException {

        counter c = new counter();
        Thread t1 = new Thread(new Runnable() { // thread1
            public void run() {
                for (int i = 1; i <= 1000000; i++)
                    c.increment();
            }
        });
        Thread t2 = new Thread(new Runnable() { // thread2
            public void run() {
                for (int i = 1; i <= 1000000; i++)
                    c.increment();
            }
        });
        t1.run();
        t2.run();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
