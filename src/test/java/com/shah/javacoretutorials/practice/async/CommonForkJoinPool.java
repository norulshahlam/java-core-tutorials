package com.shah.javacoretutorials.practice.async;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ForkJoinPool;

public class CommonForkJoinPool {

    ParallelStreamPerformance intStreamExample = new ParallelStreamPerformance();

    @Test
    void noOfForkJoinPool() {

        int threads = ForkJoinPool.getCommonPoolParallelism();
        System.out.println(threads);
    }

    @RepeatedTest(10)
    void changeDefaultParallelValue() {
        intStreamExample.sum_using_iterate(100000000, true);

        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "100");


        intStreamExample.sum_using_iterate(100000000, true);
    }
}
/**
 * Java 7 introduced the fork/join framework.
 * The common ForkJoin pool has a shared work queue and a double-ended-queue (deque).
 * <p>
 * The tasks that submitted by the parallel streams lands in the shared work queue.
 * <p>
 * And each deque is backed by a Java thread.
 * <p>
 * The number of threads on the deque is equal to the number of cores that you have in your machine MINUS ONE.
 * <p>
 * this is the thread where you are actually invoking the parallel stream from.
 * The 'reserved' thread is the main thread that submits the tasks to the shared work queue. In other words, the main thread is the one that initiates the parallel stream.
 * <p>
 * We can also change the default parallelism value.
 * <p>
 * ForkJoin pool is used by parallelStreams & completableFuture.
 */