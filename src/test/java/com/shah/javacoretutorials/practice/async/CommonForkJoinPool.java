package com.shah.javacoretutorials.practice.async;

import com.shah.javacoretutorials.model.GroceriesDiscount;
import com.shah.javacoretutorials.model.GroceriesResponse;
import com.shah.javacoretutorials.parallelStreams.GroceriesService;
import com.shah.javacoretutorials.parallelStreams.ParallelStreamPerformance;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

import static com.shah.javacoretutorials.util.CommonUtil.startTimer;
import static com.shah.javacoretutorials.util.CommonUtil.timeTaken;

public class CommonForkJoinPool {

    ParallelStreamPerformance intStreamExample = new ParallelStreamPerformance();

    @Test
    void findProcessors() {
        int processors = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(processors);
        System.out.println(processors);
    }

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

    private GroceriesService service = new GroceriesService();

    @Test
    void getGrocery() {
        // if there is 1s delay in each list, using parallel, it will give around 1s result.
        startTimer();
        CompletableFuture<GroceriesResponse> groceries = service.getOneGrocery(3);
        System.out.println(groceries.join());
        timeTaken();
    }

    @Test
    void getGroceryDiscountList() {
        startTimer();
        List<GroceriesDiscount> groceryDiscountList = service.getGroceryDiscountList(30);
        System.out.println(groceryDiscountList);
        timeTaken();
    }

}
/**
 * Java 7 introduced the fork/join framework.
 * ForkJoin pool is used by parallelStreams & completableFuture.
 * The common ForkJoin pool has a shared work queue and a double-ended-queue (deque).
 * The tasks that submitted by the parallel streams lands in the shared work queue.
 * And each deque is backed by a Java thread.
 * The number of threads on the deque is equal to the number of cores that you have in your machine MINUS ONE (reserved thread).
 * This is the thread where you are actually invoking the parallel stream from.
 * The 'reserved' thread is the main thread that submits the tasks to the shared work queue. In other words, it is the one that initiates the parallel stream.
 * We can also change the default parallelism value.
 */