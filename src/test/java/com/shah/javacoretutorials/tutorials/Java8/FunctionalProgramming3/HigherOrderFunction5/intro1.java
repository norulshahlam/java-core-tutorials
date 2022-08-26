package com.shah.javacoretutorials.tutorials.Java8.FunctionalProgramming3.HigherOrderFunction5;

import java.util.List;
import java.util.function.Predicate;

/*
understand a very important functional concept called Higher Order Functions.

What is a higher order function? A higher order function is a function which returns a function.
 */

public class intro1 {
        public static void main(String[] args) {
                List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                                new Course("Spring Boot", "Framework", 95, 18000),
                                new Course("API", "Microservices", 97, 22000),
                                new Course("Microservices", "Microservices", 96, 25000),
                                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                                new Course("Kubernetes", "Cloud", 91, 20000));

                // 1st layer
                //
                // allMatch() - returns true if ALL satisfy condition
                System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 95));
                // anyMatch() - returns true if atleast 1 satisfy condition
                System.out.println(courses.stream().anyMatch(course -> course.getReviewScore() > 95));
                // noneMatch() - returns true if none satisfy condition
                System.out.println(courses.stream().noneMatch(course -> course.getReviewScore() > 95));

                System.out.println("\n************************\n");

                // 2nd layer
                Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
                System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));

                // 3. higher order function
                //
                // a - define Predicate that returns a function
                Predicate<Course> reviewScoreGreaterThan95Predicate2 = createPredicateWithCutoffReviewScore(95);
                Predicate<Course> reviewScoreGreaterThan90Predicate2 = createPredicateWithCutoffReviewScore(90);

                // c - call the function
                System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate2));
                System.out.println(courses.stream().allMatch(reviewScoreGreaterThan90Predicate2));
        }

        // b - define this function
        private static Predicate<Course> createPredicateWithCutoffReviewScore(int cutoffReviewScore) {
                return course -> course.getReviewScore() > cutoffReviewScore;
        }
}