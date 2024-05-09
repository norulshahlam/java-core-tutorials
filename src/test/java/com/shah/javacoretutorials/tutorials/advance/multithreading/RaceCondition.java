package com.shah.javacoretutorials.tutorials.advance.multithreading;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/*

https://www.youtube.com/watch?v=3vptroRUvn8
https://www.linkedin.com/pulse/understanding-race-conditions-causes-prevention-pavan-pothuganti-9z61c/

A race condition occurs when two or more threads can access shared data, and they try to change it at the same time. Because the thread scheduling algorithm can swap between threads at any time, you don't know the order in which the threads will attempt to access the shared data. Therefore, the result of the change in data is dependent on the thread scheduling algorithm, i.e., both threads are "racing" to access/change the data.

Below is an example of a race condition and how to fix it (ensure thread-safe):

1. AtomicInteger - use this class as ref and use incrementAndGet() to count
2. synchronized - use this keyword in your method. It only calls by 1 thread at a time. If t1 is executed, t2 have to wait.

We also we can create thread using anonymous class instead of creating a new class n extends thread

 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RaceCondition {

    private int count = 0;

    @RepeatedTest(10)
    @Order(1)
    @DisplayName("negative Sample Using Runnable")
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
    @Order(2)
    @DisplayName("positive Sample Using Runnable")
    void positiveSampleUsingRunnable() throws InterruptedException {
        AtomicInteger countAtomic = new AtomicInteger(0);

        /*
        The expected value should be 2000, and will always give 2000 for every run. Here we also create a thread using anonymous class instead of creating a new class n extends thread
         */
        Thread increaseCount1 = new Thread(() -> IntStream
                .range(0, 1000).forEach(i -> countAtomic.incrementAndGet()));
        // thread2
        Thread increaseCount2 = new Thread(() -> IntStream
                .range(0, 1000).forEach(i -> countAtomic.incrementAndGet()));

        increaseCount1.start();
        increaseCount2.start();

        increaseCount1.join();
        increaseCount2.join();

        System.out.println(countAtomic);
    }

    @RepeatedTest(10)
    @Order(3)
    @DisplayName("negative Sample Using Executor")
    void negativeSampleUsingExecutor() {
         /*
        The expected value should be 2000, but it gave different results for every run.
         */
        ArrayList<CompletableFuture<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> count++);
            list.add(future);
        }
        list.forEach(CompletableFuture::join);
        System.out.println(count);
    }

    @RepeatedTest(10)
    @Order(4)
    @DisplayName("positive Sample Using Executor")
    void positiveSampleUsingExecutor() {
          /*
        The expected value should be 2000, and will always give 2000 for every run.
         */
        AtomicInteger countAtomic = new AtomicInteger(0);
        ArrayList<CompletableFuture<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            CompletableFuture<Integer> future = CompletableFuture.supplyAsync(countAtomic::incrementAndGet);
            list.add(future);
        }
        list.forEach(CompletableFuture::join);
        System.out.println(countAtomic);
    }
}

