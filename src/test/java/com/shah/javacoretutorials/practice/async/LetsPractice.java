package com.shah.javacoretutorials.practice.async;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

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
    void setDoesNotGuaranteeOrderOfInsertion() {
        Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list = set.stream()
                .parallel()
                .map(i -> i * 2)
                .toList();
        System.out.println(set);
        System.out.println(list);
    }

    @Test
    void listDoesGuaranteeOrderOfInsertion() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = list.stream()
                .parallel()
                .map(i -> i * 2)
                .toList();
        System.out.println(list);
        System.out.println(list2);
    }

    @Test
    void filterEvenNumberAndDisplayOnlyOddNumber() {
        List<Integer> allNumber = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> onlyOddNumber = allNumber.stream()
                .parallel()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(allNumber);
        System.out.println(onlyOddNumber);
    }


}
/**
 * Threads - Java 1
 * ExecutorService - Java 5
 * CompletableFuture - Java 8
 */