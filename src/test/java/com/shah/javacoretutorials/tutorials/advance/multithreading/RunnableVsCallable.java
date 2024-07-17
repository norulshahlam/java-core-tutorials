package com.shah.javacoretutorials.tutorials.advance.multithreading;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/*
Differences between Runnable and Callable

*** Return Type: ***

- Runnable does not return a result. Its run() method has a void return type.
- Callable returns a result. Its call() method returns a value of type V, specified by the generic parameter.

*** Exception Handling: ***

- Runnable's run() method cannot throw checked exceptions.
- Callable's call() method can throw checked exceptions.
 */
class RunnableVsCallable {

    ExecutorService executorService = Executors.newFixedThreadPool(2);
    private final AtomicInteger count = new AtomicInteger(0);

    @RepeatedTest(10)
    @Order(1)
    @DisplayName("Corrected Sample Using Callable and ExecutorService with AtomicInteger")
    void correctedSampleUsingCallableAndExecutorService() throws InterruptedException, ExecutionException {

    /*
    - returns a result. Its call() method returns a value of type V, specified by the generic parameter.
    - can throw checked exceptions.
     */
        Callable<Integer> callable = () -> {
            IntStream.range(0, 1000).forEach(i -> count.incrementAndGet());
            return count.get();
        };

        List<Callable<Integer>> tasks = List.of(callable, callable);
        List<Future<Integer>> futures = executorService.invokeAll(tasks);

        for (Future<Integer> future : futures) {
            future.get(); // Wait for completion and retrieve the result (optional in this case)
        }

        executorService.shutdown();

        System.out.println(count.get());
    }

    @RepeatedTest(10)
    @Order(1)
    @DisplayName("Corrected Sample Using Runnable and ExecutorService with AtomicInteger")
    void correctedSampleUsingRunnableAndExecutorService() {

    /*
    - does not return a result. Its run() method has a void return type.
    - run() method cannot throw checked exceptions.
     */

        Runnable runnable = () -> IntStream
                .range(0, 1000)
                .forEach(i -> count.incrementAndGet());

        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.shutdown();

        while (!executorService.isTerminated()) {
            // Wait until all tasks are finished
        }

        System.out.println(count.get());
    }
}

