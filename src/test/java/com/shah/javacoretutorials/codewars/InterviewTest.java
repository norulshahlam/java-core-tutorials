package com.shah.javacoretutorials.codewars;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Slf4j
public class InterviewTest {


    @Test
    public void test(){
        List<String> transactions = Arrays.asList(
                "A",
                "B",
                "A",
                "C",
                "B",
                "D",
                "A"
        );

        Map<String, Long> frequency = transactions.stream().collect(
                Collectors.groupingBy(
                        transaction -> transaction,
                        Collectors.counting()
                ));
        frequency.entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .ifPresent(entry -> log.info("Most frequent transaction: {} ", entry.getKey()));
        log.info("Transaction frequencies: {}", frequency);
    }

}
