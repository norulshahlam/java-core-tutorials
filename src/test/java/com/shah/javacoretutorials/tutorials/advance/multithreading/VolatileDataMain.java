package com.shah.javacoretutorials.tutorials.advance.multithreading;

import org.junit.jupiter.api.Test;

/*
volatile has semantics for memory visibility. Basically, the value of a volatile field becomes visible to all readers (other threads in particular) after a write operation completes on it. Without volatile, readers could see some non-updated value. To tackle the issues with Cache Coherence, we ensure that updates to variables propagate predictably to other threads.
 */
class VolatileDataMain {

    private static boolean negativeReading;
    private static volatile boolean positiveReading;

    @Test
    void negativeSample() throws InterruptedException {
        Thread myCount = new Thread(() -> {
            int i = 0;
            while (!negativeReading) {
                i++;
            }
            System.out.println("Reading is TRUE");
        });
        myCount.start();
        Thread.sleep(1000);
        negativeReading = true;
        System.out.println("Completed");
    }
    @Test
    void positiveSample() throws InterruptedException {
        Thread myCount = new Thread(() -> {
            int i = 0;
            while (!positiveReading) {
                i++;
            }
            System.out.println("Reading is TRUE");
        });
        myCount.start();
        Thread.sleep(1000);
        positiveReading = true;
        System.out.println("Completed");
    }
}


