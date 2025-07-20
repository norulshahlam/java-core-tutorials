package com.shah.javacoretutorials.codewars;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

@Slf4j
public class Code1 {
    @Test
    void contextLoads() {
        String sentence = "This is another test";
        String s = Arrays.asList(sentence.split(" ")).stream().map(i -> i.length() > 4 ? new StringBuilder(i).reverse() : i)
                .collect(Collectors.joining(" "));
        System.out.println(s);
    }


    @Test
    void yayas() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = a + b;
        log.info("c is: " + c);
    }

    @Test
    void printMyName() {
        String name = "Shah";
        int age = 21;
        String country = "Japan";
        log.info("My name is {} and I am {} years old and I live in {}.", name, age, country);
    }


}

/*
 * Write a function that takes in a string of one or more words, and returns the
 * same string, but with all five or more letter words reversed (like the name
 * of this kata).
 *
 * Strings passed in will consist of only letters and spaces. Spaces will be
 * included only when more than one word is present.
 */