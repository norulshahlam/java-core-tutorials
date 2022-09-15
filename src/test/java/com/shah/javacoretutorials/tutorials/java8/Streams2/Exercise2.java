package com.shah.javacoretutorials.tutorials.java8.Streams2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
some fun exercises
1. create a list inside a stream
2. max, min, sum, avg
3. create stream using range of numbers
4. create stream using specified number pattern
*/
public class Exercise2 {
  @SuppressWarnings("unused")
  public static void main(String[] args) {

    int[] numberArrays = { 12, 9, 13, 4, 6, 2, 4, 12, 15 };
    // 1. create a list inside a stream
    // System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).count());
    // System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12,
    // 15).reduce(0,Integer::sum));

    // 2. to use these opeartions, make sure it is in Array. else use reduce() like
    // the above
    // System.out.println(Arrays.stream(numberArrays).sum());
    // System.out.println(Arrays.stream(numberArrays).min());
    // System.out.println(Arrays.stream(numberArrays).max());
    // System.out.println(Arrays.stream(numberArrays).average());

    //
    // 3. create a stream of range 1-9
    System.out.println(IntStream.range(1, 10).sum());
    // 3. create a stream of range 1-10
    System.out.println(IntStream.rangeClosed(1, 10).sum());
    // 4. create a stream starting from 0, and inc by 5, 10 times, and get total sum
    System.out.println(IntStream.iterate(0, e -> e + 5).limit(10).sum());
    // same as (4), only we can peek what is the value range
    System.out.println(IntStream.iterate(0, e -> e + 5).limit(10).peek(System.out::println).sum());
    // same as (4), only we ssstore into list
    System.out.println(IntStream.iterate(0, e -> e + 5).limit(10).boxed().collect(Collectors.toList()));
    // same as (4), only we use LongStream instead of IntStream to use large numbers
    System.out.println(LongStream.iterate(1, e -> e * 500).limit(10).peek(System.out::println).sum());
  }
}
