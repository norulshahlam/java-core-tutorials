package com.shah.javacoretutorials.tutorials.Java8.FunctionalProgramming3.CustomClasses6;

/*
Playing with 
sum, 
average and 
count
max
min
*/
import java.util.List;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class intro5SumAvgCount {

  // @SuppressWarnings("unused")
  public static void main(String[] args) {
    List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
        new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
        new Course("Microservices", "Microservices", 96, 25000), new Course("FullStack", "FullStack", 91, 14000),
        new Course("AWS", "Cloud", 92, 21000), new Course("Azure", "Cloud", 99, 21000),
        new Course("Docker", "Cloud", 92, 20000), new Course("Kubernetes", "Cloud", 91, 20000));

    /****** filtered reesults *******/
    Stream<Course> a0 = courses.stream().filter(course -> course.getReviewScore() > 90);
    /****** get sum of the filtered reesults *******/
    int a1 = courses.stream().filter(course -> course.getReviewScore() > 90).mapToInt(Course::getNoOfStudents).sum();
    /****** get avg of the filtered reesults *******/
    OptionalDouble a2 = courses.stream().filter(course -> course.getReviewScore() > 90)
        .mapToInt(Course::getNoOfStudents).average();
    /****** count the filtered reesults *******/
    long a3 = courses.stream().filter(course -> course.getReviewScore() > 90).mapToInt(Course::getNoOfStudents).count();
    /****** get max of filtered reesults *******/
    OptionalInt a4 = courses.stream().filter(course -> course.getReviewScore() > 90).mapToInt(Course::getNoOfStudents)
        .max();
    /****** count the filtered reesults *******/
    OptionalInt a5 = courses.stream().filter(course -> course.getReviewScore() > 90).mapToInt(Course::getNoOfStudents)
        .min();

    a0.forEach(System.out::println);
    System.out.println("get sum: " + a1);
    System.out.println("get avg: " + a2);
    System.out.println("get count: " + a3);
    System.out.println("get max: " + a4);
    System.out.println("get min: " + a5);
  }
}
