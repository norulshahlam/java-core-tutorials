package com.shah.javacoretutorials.tutorials.advance.multithreading;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/*

https://www.youtube.com/watch?v=3vptroRUvn8
https://www.linkedin.com/pulse/understanding-race-conditions-causes-prevention-pavan-pothuganti-9z61c/

Thread safe means that multiple threads can use a method or class instance at the same time without any problems occurring.

A race condition occurs when two or more threads can access shared data, and they try to change it at the same time. Because the thread scheduling algorithm can swap between threads at any time, you don't know the order in which the threads will attempt to access the shared data. Therefore, the result of the change in data is dependent on the thread scheduling algorithm, i.e., both threads are "racing" to access/change the data.

Below is an example of a race condition and how to fix it (ensure thread-safe):

1. AtomicInteger - Atomic operations are performed in a single unit of a task without interference from other operations. Necessity in multithreading environment to avoid data inconsistency.
2. Synchronized - Allows only a single thread at a time to access the shared resource and forces all other threads to wait for that accessing thread to release its access to the shared resource



We also demonstrate 3 ways to use multiple threads:
1. Runnable + Thread
2. Thread + Anonymous class
3. Executor service


We also create thread using anonymous class instead of creating a new class n extends thread

 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RaceCondition {

    private int count = 0;

    private synchronized void synchronizedIncrement() {
        this.count++;
    }

    @RepeatedTest(10)
    @Order(1)
    @DisplayName("negative Sample Using Runnable and Thread")
    void negativeSampleUsingRunnableAndThread() throws InterruptedException {

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
    @DisplayName("positive Sample Using thread Anonymous Class Atomic")
    void positiveSampleUsingThreadAnonymousClassAtomic() throws InterruptedException {
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
    @DisplayName("positive Sample Using thread anonymous and Synchronized")
    void positiveSampleUsingThreadAnonymousSynchronized() throws InterruptedException {
        /*
        The expected value should be 2000, and will always give 2000 for every run.
         */
        Thread increaseCount1 = new Thread(() -> IntStream
                .range(0, 10000).forEach(i -> synchronizedIncrement()));
        Thread increaseCount2 = new Thread(() -> IntStream
                .range(0, 10000).forEach(i -> synchronizedIncrement()));

        increaseCount1.start();
        increaseCount2.start();

        increaseCount1.join();
        increaseCount2.join();

        System.out.println(count);
    }

    @RepeatedTest(10)
    @Order(4)
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
    @Order(5)
    @DisplayName("positive Sample Using Executor Atomic")
    void positiveSampleUsingExecutorAtomic() {
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

