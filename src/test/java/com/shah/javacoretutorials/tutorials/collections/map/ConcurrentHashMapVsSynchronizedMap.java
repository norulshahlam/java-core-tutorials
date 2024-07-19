package com.shah.javacoretutorials.tutorials.collections.map;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapVsSynchronizedMap {

    /*
    SynchronizedMap and ConcurrentHashMap are both thread safe class and can be used in multithreading application, the main difference between them is regarding how they achieve thread safety.

    SynchronizedMap acquires lock on the entire Map instance.
    SynchronizedMap - if backed by HashMap or LinkedHashMap, only one null as a key and any number of null values. if backed by TreeMap, we can have null values but not null keys.

    ConcurrentHashMap acquires lock on the individual Map instance.
    ConcurrentHashMap doesn’t allow null in keys or values

    When to Use???
    We should favor Collections.synchronizedMap() when data consistency is of utmost importance, and we should choose ConcurrentHashMap for performance-critical applications where there are far more write operations than there are read operations.

    This is because the Collections.synchronizedMap() requires each thread to acquire a lock on the entire object for both read/write operations. By comparison, the ConcurrentHashMap allows threads to acquire locks on separate segments of the collection, and make modifications at the same time.
     */

    @Test
    void synchronizedMap() {
        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap<>());

        // Adding elements
        synchronizedMap.put("key1", "value1");
        synchronizedMap.put("key2", "value2");

        // Accessing elements
        synchronized (synchronizedMap) { // Manual synchronization when iterating
            for (Map.Entry<String, String> entry : synchronizedMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    @Test
    void concurrentHashMap() {
        Map<String, String> concurrentMap = new ConcurrentHashMap<>();

        // Adding elements
        concurrentMap.put("key1", "value1");
        concurrentMap.put("key2", "value2");

        // Accessing elements
        for (Map.Entry<String, String> entry : concurrentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Test
    void compareTimeTaken() throws InterruptedException {
        int numberOfTasks = 20000000;
        int numberOfThreads = 10;

        // Test SynchronizedMap
        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
        long synchronizedMapTime = measureTimeForMap(synchronizedMap, numberOfTasks, numberOfThreads);
        System.out.println("Time taken for SynchronizedMap: " + synchronizedMapTime + " ms");

        // Test ConcurrentHashMap
        Map<String, String> concurrentMap = new ConcurrentHashMap<>();
        long concurrentMapTime = measureTimeForMap(concurrentMap, numberOfTasks, numberOfThreads);
        System.out.println("Time taken for ConcurrentHashMap: " + concurrentMapTime + " ms");
    }

    private static long measureTimeForMap(Map<String, String> map, int numberOfTasks, int numberOfThreads) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        long startTime = System.nanoTime();

        for (int i = 0; i < numberOfTasks; i++) {
            final int index = i;
            executor.submit(() -> {
                map.put("key" + index, "value" + index);
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000; // Convert to milliseconds
    }
}
