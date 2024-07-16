package com.shah.javacoretutorials.tutorials.java8.Streams2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.shah.javacoretutorials.model.Fruits.numbers;

/*
    now we have understood stream, let do an exercise use reduce()
*/
public class HowReduceWorks {

    @BeforeEach
    void setUp() {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
    }

    @Test
    void test1() {
        /*
        test1 - return 0 - only return x ie initial value
        0 & 12
        0 & 9
        0 & 13
        0 & 4
        0 & 6
        0 & 2
        0 & 4
        0 & 12
        0 & 15
        0
         */
        System.out.println("test1: " + test1(numbers));
    }

    @Test
    void test2() {
        /*
        test2 - return 15 - returns last next number
        0 & 12
        12 & 9
        9 & 13
        13 & 4
        4 & 6
        6 & 2
        2 & 4
        4 & 12
        12 & 15
        15
         */
        System.out.println("test2: " + test2(numbers));
    }

    @Test
    void test3() {
        /*
        test3 - find max value. In case there's a negative value, we must set initial val with Integer.MIN_VALUE. then, if the initial value is smaller than the next val, (which it surely is as it is min val), return that next val. else return initial value and so on
         */
        System.out.println("test3: " + test3(numbers));
    }

    @Test
    void test4() {
        /*
        test4 is opp - find min value. in case there's big value, we must set initial val with Integer.MAX_VALUE. then, if the initial value is bigger than the next val (which it surely is as it is max val), return that next val. else return initial value and so on
         */
        System.out.println("test4: " + test4(numbers));
    }

    private static int test1(List<Integer> numbers) {
        return numbers.stream().reduce(0, (x, y) -> x);
    }

    private static int test2(List<Integer> numbers) {
        return numbers.stream().reduce(0, (x, y) -> y);
    }

    private static int test3(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x < y ? y : x);
    }

    private static int test4(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MAX_VALUE, (x, y) -> x > y ? y : x);
    }
}