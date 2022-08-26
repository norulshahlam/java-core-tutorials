package com.shah.javacoretutorials.tutorials.Java8.FunctionalProgramming3.CustomClasses6;

import java.util.Comparator;

/*
1. get min 
2. max value
3. get first element of returned result
4. get any element of returned result
5. understanding optional

  Optional is released on Java 8. Typically in Java programming, we are used to handling lot of nulls. Using nulls as a way to indicate the absence of a value is what is typically done in our databases.
  However, on the Java side, what it resulted in is a lot of null pointer exceptions. Optional is a way to get around that.
  So, instead of returning a null back, what you can do is, you can return a Optional.empty back. 
*/
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class intro4minmax {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
        new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
        new Course("Microservices", "Microservices", 96, 25000), new Course("FullStack", "FullStack", 91, 14000),
        new Course("AWS", "Cloud", 92, 21000), new Course("Azure", "Cloud", 99, 21000),
        new Course("Docker", "Cloud", 92, 20000), new Course("Kubernetes", "Cloud", 91, 20000));

    // 1. get max no of students
    Optional<Course> a1 = courses.stream().max(Comparator.comparingInt(Course::getNoOfStudents));
    // 2. get min no of students
    Optional<Course> a2 = courses.stream().min(Comparator.comparingInt(Course::getNoOfStudents));

    /****** filter *******/
    Stream<Course> a3 = courses.stream().filter(course -> course.getReviewScore() > 95);

    /******* 3. get 1st element of filtered result *********/
    Optional<Course> a4 = courses.stream().filter(course -> course.getReviewScore() > 95).findFirst();

    /******* 4. get any element of filtered result *********/
    Optional<Course> a5 = courses.stream().filter(course -> course.getReviewScore() > 95).findAny();

    /************* 5. optional *********/
    Optional<Course> a6 = courses.stream().filter(course -> course.getReviewScore() < 90).findFirst();
    //
    //
    //
    //
    System.out.println("\n****initial*****\n");
    courses.forEach(System.out::println);
    // System.out.println("\n*****max****\n");
    // a1.stream().forEach(System.out::println);
    // System.out.println("\n*****min****\n");
    // a2.stream().forEach(System.out::println);
    System.out.println("\n***initial element****\n");
    a3.forEach(System.out::println);
    System.out.println("\n*****1st element****\n");
    a4.stream().forEach(System.out::println);

    System.out.println("\n*****last element****\n");
    a5.stream().forEach(System.out::println);

    System.out.println("\n*****optional****\n");
    System.out.println(a6);
  }
}