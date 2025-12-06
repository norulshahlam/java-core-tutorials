package com.shah.javacoretutorials.codewars;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class LuxoftTest {
    /**
     * Description:
     * 5/12/2025 DXC interview coding round
     * An array contains numbers -  List.of(1, 2, 3, 4, 4, 5)
     * Exactly one number is duplicated in the array. Write java function to find this duplicate
     */
    static List<Integer> integerList;

    @BeforeAll
    static void beforeAll() {
        integerList = generate();
    }

    @RepeatedTest(10)
    void findDuplicateUsingSet() {
        log.info("{}", findDuplicateUsingSet(integerList));
    }

    @RepeatedTest(10)
    void findDuplicateUsingMap() {
        log.info("{}", findDuplicateUsingMap(integerList));

    }

    @RepeatedTest(10)
    void findDuplicateUsingGroup() {
        log.info("{}", findDuplicateUsingGroup(integerList));
    }

    private static List<Integer> generate() {
        // generate 100,000 unique numbers and add 1 duplicate

        List<Integer> largeList = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            largeList.add(i);
        }
        largeList.add(50000); // add a duplicate
        Collections.shuffle(largeList);
        return largeList;
    }

    Integer findDuplicateUsingSet(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        for (Integer n : numbers) {
            if (!seen.add(n)) {
                return n;
            }
        }
        return null;
    }

    Integer findDuplicateUsingMap(List<Integer> numbers) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (Integer n : numbers) {
            Integer count = freq.get(n);
            if (count == null) {
                freq.put(n, 1);
            } else {
                return n;
            }
        }
        return null;
    }

    // least efficient
    Integer findDuplicateUsingGroup(List<Integer> numbers) {
        Map<Integer, Long> grouped =
                numbers.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        for (Map.Entry<Integer, Long> e : grouped.entrySet()) {
            if (e.getValue() > 1) {
                return e.getKey();
            }
        }
        return null;
    }

}

