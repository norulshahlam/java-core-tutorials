package com.shah.javacoretutorials.codewars;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
class RioTinto {
    /**
     * Q1
     * List <String>  ADGH, GHSD, XYZ, XYZ
     * Get the duplicate element and its count how many times its duplicating in list
     * <p>
     * Q2
     * List <Long>  1,1,2,3,5,5,5
     * Put this list in to a Map<Long,Long> where key and value are same as List Element
     * compare MAP and LIST and find out duplicate element which is not present in Map but present in List
     */

    @Test
    void ArrayInitialization() {
        List<Long> list1 = Arrays.asList(1L, 2L, 3L, 3L);
        Map<Long, Long> collect1 = list1.stream().collect(Collectors.toMap(i -> i, i -> i, (existing, replacement) -> existing));
        List<Long> list2 = List.of(1L, 2L, 3L, 3L);
        ArrayList<Long> list3 = new ArrayList<>(List.of(1L, 2L, 3L, 3L));
        ArrayList<Long> list4 = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 3L));
        collect1.forEach((k, v) -> log.info("list1: {}", v));
        list2.forEach((v) -> log.info("list2: {}", v));
        list3.forEach((v) -> log.info("list3: {}", v));
        list4.forEach((v) -> log.info("list4: {}", v));
    }

}