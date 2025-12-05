package com.shah.javacoretutorials.codewars;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class LuxoftTest {
    @Test
    void contextLoads() {
        /** Description:
         * 5/12/2025 DXC interview coding round
         * An array contains numbers. Exactly one number is duplicated in the array. Write java function to find this duplicate
         */

        List<Integer> numbers = List.of(1, 2, 3, 4, 4, 5);
        log.info("{}", findDuplicateUsingSet(numbers));
        log.info("{}", findDuplicateUsingMap(numbers));
        log.info("{}", findDuplicateUsingGroup(numbers));

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

