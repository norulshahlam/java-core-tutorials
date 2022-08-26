package com.shah.javacoretutorials.tutorials.Java8.FunctionalProgramming3.HigherOrderFunction5;

import java.util.List;
import java.util.Optional;

/*
So typically, what would happen is, we'd execute this filter on all the things and get a list of filtered stuff. And after that, we would map everything toUppercase and after that, among the list which comes up, we try and find the first one. However, you can see that with functional programming, it's much much much more efficient.

So, what happened is, as soon as it finds the first element, it does not even look at the other elements. 

It knows that we need only one element. So what it does is, it starts looking at the element one at a time. It tries to filter. If it doesn't go through the filter, then it takes the next element. next element, next element.

because I do a findFirst(), It stops when it finds one element, and it does an uppercase() and it returns that specific value back. So, you can see that with
functional programming, writing highly performant code is much much more easier.
*/
public class lazyStreams {
  public static void main(String[] args) {
    List<String> courses = List.of(
      "Spring",
      "Spring Boot",
      "API",
      "Microservices",
      "AWS",
      "PCF",
      "Azure",
      "Docker",
      "Kubernetes");

    Optional<String> a = courses
      .stream()
      .peek(System.out::println)
      .filter(c -> c.length() > 11)
      .map(String::toUpperCase)
      .peek(System.out::println)
      .findFirst();

    System.out.println(a);
  }
}
