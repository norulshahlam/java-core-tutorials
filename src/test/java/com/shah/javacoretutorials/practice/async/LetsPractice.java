package com.shah.javacoretutorials.practice.async;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.shah.javacoretutorials.util.CommonUtil.*;

class LetsPractice {


    @Test
    void findProcessors() {
        int processors = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(processors);
        System.out.println(processors);
    }

    @RepeatedTest(5)
    void LinkedListIsSLowInParallelProcessing() {
        LinkedList<Integer> integerLinkedList = generateIntegerLinkedList(10000000);
        startTimer();
        List<Integer> integers = integerLinkedList.stream()
                .parallel()
                .map(i -> i * 2)
                .toList();
        timeTaken();
    }

    @RepeatedTest(5)
    void ArrayListIsFastInParallelProcessing() {
        ArrayList<Integer> integerArrayList = generateArrayList(10000000);
        startTimer();
        List<Integer> integers = integerArrayList.stream()
                .parallel()
                .map(i -> i * 2)
                .toList();
        timeTaken();
    }

    @Test
    void setDoesNotGuaranteeOrderOfResults() {
        Set<Integer> integers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> integers1 = integers.stream()
                .parallel()
                .map(i -> i * 2)
                .toList();
        System.out.println(integers);
        System.out.println(integers1);
    }

    @Test
    void listDoesGuaranteeOrderOfResults() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> integers1 = integers.stream()
                .parallel()
                .map(i -> i * 2)
                .toList();
        System.out.println(integers);
        System.out.println(integers1);
    }


}
/**
 * Threads - Java 1
 * ExecutorService - Java 5
 * CompletableFuture - Java 8
 */