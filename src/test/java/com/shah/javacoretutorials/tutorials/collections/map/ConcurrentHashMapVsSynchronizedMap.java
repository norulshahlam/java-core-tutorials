package com.shah.javacoretutorials.tutorials.collections.map;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapVsSynchronizedMap {

    /*
    SynchronizedMap and ConcurrentHashMap are both thread safe class and can be used in multithreading application, the main difference between them is regarding how they achieve thread safety.

    SynchronizedMap acquires lock on the entire Map instance.
    ConcurrentHashMap acquires lock on the individual Map instance.
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
}
