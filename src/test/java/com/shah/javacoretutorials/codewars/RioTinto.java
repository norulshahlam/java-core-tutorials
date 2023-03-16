package com.shah.javacoretutorials.codewars;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
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
    void arrayInitialization() {
        List<Long> list1 = Arrays.asList(1L, 2L, 3L, 3L);
        List<Long> list2 = List.of(1L, 2L, 3L, 3L);
        ArrayList<Long> list3 = new ArrayList<>(List.of(1L, 2L, 3L, 3L));
        ArrayList<Long> list4 = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 3L));
        Map<Long, Long> collect1 = list1.stream().collect(Collectors.toMap(i -> i, i -> i, (existing, replacement) -> existing));
        collect1.forEach((k, v) -> log.info("list1: {}", v));

        list1.forEach((v) -> log.info("list2: {}", v));
        list2.forEach((v) -> log.info("list2: {}", v));
        list3.forEach((v) -> log.info("list3: {}", v));
        list4.forEach((v) -> log.info("list4: {}", v));
    }

    @Test
    void hcl() {
        String s = "my name is davinder my company name is hcl";
        Map<String, Long> collect = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    @Test
    void ubs() {
        List<String> blacklisted_ips = List.of("*111.*", "123.*", "34.*");
        List<String> requests = List.of("123.1.23.34","121.1.23.34","121.1.23.34","34.1.23.34","121.1.23.34","12.1.23.34","121.1.23.34");

        validateRequests(blacklisted_ips, requests);
    }
    public static List<Integer> validateRequests(List<String> blacklisted_ips, List<String> requests) {
        Set<String> blacklisted = blacklisted_ips.stream()
                .map(ip -> ip.replaceAll("\\.", "\\\\.") // escape dots
                        .replaceAll("\\*", ".*"))   // replace wildcards with regex
                .collect(Collectors.toSet());

        System.out.println(blacklisted_ips);
        System.out.println(blacklisted);

        Map<String, Queue<Integer>> counts = new HashMap<>();

        return requests.stream()
                .map(ip -> {
                    // Check if the request matches any blacklisted IP
                    if (blacklisted.stream().anyMatch(ip::matches)) {
                        return 1;
                    }

                    // Check if the request has been made at least twice in the last 5 seconds
                    Queue<Integer> q = counts.computeIfAbsent(ip, k -> new LinkedList<>());
                    q.add(0);
                    while (!q.isEmpty() && q.peek() < 5) {
                        q.poll();
                    }
                    if (q.size() >= 2) {
                        return 1;
                    }

                    return 0;
                })
                .collect(Collectors.toList());
    }


}