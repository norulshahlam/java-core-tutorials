package com.shah.javacoretutorials.tutorials.java8.MethodReference1;

/*
1. after understanding about method reference, we know that we can use all static methods as arg inside anything ie System.out::println.
we know that Integer is a class having static sum method so we can use Integer::sum. now we do the same for class String having static class toUpperCase() and much more

2. also we introduce method reference to create new Supplier object
*/
import java.util.List;
import java.util.function.Supplier;

public class intro3 {

  private static void print(String str) {
    System.out.println(str);
  }

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
        "Kubernetes");

    courses.stream()
        // .map(str -> str.toUpperCase())
        .map(String::toUpperCase).forEach(intro3::print);

    // old way
    Supplier<String> supplier = () -> new String();
    // method refernce
    Supplier<String> supplier2 = String::new;

  }
}
