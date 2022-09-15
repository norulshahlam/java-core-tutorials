package com.shah.javacoretutorials.tutorials.java8.FunctionalProgramming3.CustomClasses6;

/*
Let's get started with the basic stream functions called 
1. allMatch() - return true if all matches
2. noneMatch() - the opp - return true if none is match
3. anyMatch() - return true if any 1 matches

we will start off with functional approcah and then breakdown the arguments seperately

*/

import java.util.List;
import java.util.function.Predicate;

public class intro1Match {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
        new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
        new Course("Microservices", "Microservices", 96, 25000), new Course("FullStack", "FullStack", 91, 14000),
        new Course("AWS", "Cloud", 92, 21000), new Course("Azure", "Cloud", 99, 21000),
        new Course("Docker", "Cloud", 92, 20000), new Course("Kubernetes", "Cloud", 91, 20000));

    // 1st layer
    System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 95)); // 1.
    System.out.println(courses.stream().noneMatch(course -> course.getReviewScore() < 90)); // 2.
    System.out.println(courses.stream().anyMatch(course -> course.getReviewScore() < 90)); // 3.
    System.out.println(courses.stream().anyMatch(course -> course.getReviewScore() > 95));

    System.out.println("\n************************\n");

    // 2nd layer
    Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
    Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
    Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;

    System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate)); // 1.
    System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate)); // 2.
    System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate)); // 3.
    System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan95Predicate));

  }

}