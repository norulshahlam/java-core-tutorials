package com.shah.javacoretutorials.tutorials.advance.multithreading;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/*

https://www.youtube.com/watch?v=3vptroRUvn8
https://www.linkedin.com/pulse/understanding-race-conditions-causes-prevention-pavan-pothuganti-9z61c/

A race condition occurs when two or more threads can access shared data, and they try to change it at the same time. Because the thread scheduling algorithm can swap between threads at any time, you don't know the order in which the threads will attempt to access the shared data. Therefore, the result of the change in data is dependent on the thread scheduling algorithm, i.e., both threads are "racing" to access/change the data.

 */
class RaceCondition {

    private int count = 0;

    @RepeatedTest(10)
    @DisplayName("Negative example")
    void negativeSampleUsingRunnable() throws InterruptedException {

        /*
        The expected value should be 2000, but it gave different results for every run.
         */
        Runnable runnable = () -> IntStream
                .range(0, 1000).forEach(i -> count++);

        Thread increaseCount1 = new Thread(runnable);
        Thread increaseCount2 = new Thread(runnable);

        increaseCount1.start();
        increaseCount2.start();

        increaseCount1.join();
        increaseCount2.join();

        System.out.println(count);
    }

    @RepeatedTest(10)
    @DisplayName("Positive example")
    void positiveSampleUsingRunnable() throws InterruptedException {
        AtomicInteger countAtomic = new AtomicInteger(0);

        /*
        The expected value should be 2000, and will always give 2000 for every run.
         */
        Runnable runnable = () -> IntStream
                .range(0, 1000).forEach(i -> countAtomic.incrementAndGet());

        Thread increaseCount1 = new Thread(runnable);
        Thread increaseCount2 = new Thread(runnable);

        increaseCount1.start();
        increaseCount2.start();

        increaseCount1.join();
        increaseCount2.join();

        System.out.println(countAtomic);
    }
}

