package com.shah.javacoretutorials.tutorials.java8.MethodReference1;

import java.util.List;

import static java.util.List.of;

/*
map
transform the object values. The map operation allows us to apply a function, that takes in a parameter of one type, and returns something else.

Filter
filtering the data, always returns boolean value. If it returns true, the item is added to list else it is filtered out (ignored)

now we underrstand how method reference and lambda works, we do some exercises
*/
public class exercises {
    public static void main(String[] args) {

        List<Integer> numbers = of(2, 5, 8, 4, 2, 6, 1, 9, 3);
        List<String> courses = of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes");

        oddNumbers(numbers);
        getSpring(courses);
        squareNumber(numbers);
        getStringLength(courses);
    }

    // 1. print odd
    private static void oddNumbers(List<Integer> numbers) {
        numbers.stream().filter(i -> i % 2 == 1).forEach(System.out::println);
    }

    // 2. filter string
    private static void getSpring(List<String> courses) {
        courses.stream().filter(i -> i.contains("Spring")).forEach(System.out::println);
    }

    // 3. square number
    private static void squareNumber(List<Integer> numbers) {
        numbers.stream().map(i -> i * i).forEach(System.out::println);
    }

    // 4. get string length
    private static void getStringLength(List<String> courses) {
        courses.stream().map(i -> i + " : " + i.length()).forEach(System.out::println);
    }

}
