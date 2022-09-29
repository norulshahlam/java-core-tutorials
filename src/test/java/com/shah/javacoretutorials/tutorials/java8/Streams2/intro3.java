package com.shah.javacoretutorials.tutorials.java8.Streams2;

import java.util.List;
import java.util.stream.Collectors;
/*
toList - accumulates the input elements into a new List

***** SUMMARY ******** 

Map: returns an array of pieces of information from the original array. In the callback function, return the data you wish to be part of the new array. 

Filter: returns a subset of the original array based on custom criteria. In your callback function, return a boolean value to determine whether or not each item will be included in the new array.

Reduce: can be used to return almost anything. It is often used to return a single number, like an sum, but it can also be used to combine the logic of Map and Filter to return an array of values matching certain criteria. This can remove unnecessary iterations.

The callback for Reduce has two parameters: the accumulator and the current value. Make sure you always return the accumulator after modifying it! In addition to the callback, Reduce receives a second parameter that will define the initial value of the accumulator.

Both map and reduce have as input the array and a function you define. They are in some way complementary: map cannot return one single element for an array of multiple elements, while reduce will always return the accumulator you eventually changed.

Intermediate and Stream Operations

Intermediate Operation- These operations are used to pipeline other methods and to transform the output into the other streams. They don’t produce results because this operation does not invoke until the terminal operation gets executed.

distinct(), sorted(), filter(), map() are  Stream operation - they return streams

Terminal operations - These operations are used to produce results. They can’t be used for chaining the other methods

forEach(), reduce(), collect(),  are terminal operations
*/

public class intro3 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes");

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        // return the result as list
        List<Integer> squaredNumbers = doubleList(numbers);
        List<Integer> evenNumbers = evenList(numbers);

        System.out.println(numbers);
        System.out.println(squaredNumbers);
        System.out.println(evenNumbers);
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream().map(number -> number * number).collect(Collectors.toList());
    }

    private static List<Integer> evenList(List<Integer> numbers) {
        return numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }
}
