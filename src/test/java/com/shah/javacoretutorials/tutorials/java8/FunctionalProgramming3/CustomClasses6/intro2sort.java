package com.shah.javacoretutorials.tutorials.java8.FunctionalProgramming3.CustomClasses6;

import com.shah.javacoretutorials.model.Course;

import java.util.Comparator;
import java.util.List;

public class intro2sort {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));

        // a. 1st layer
        //
        // sort by no of students. by default is increasing
        List<Course> a1 = courses.stream().sorted(Comparator.comparingInt(Course::getNoOfStudents)).toList();

        // b. sort reverse
        List<Course> b1 = courses.stream().sorted(Comparator.comparingInt(Course::getNoOfStudents).reversed()).toList();

        // c. sort by students then reviews
        List<Course> c1 = courses.stream().sorted(
                Comparator.comparingInt(Course::getNoOfStudents).thenComparing(Course::getReviewScore)).toList();

        // d. sort by students then reviews - reversed
        List<Course> d1 = courses.stream()
                .sorted(Comparator.comparingInt(Course::getNoOfStudents)
                        .thenComparing(Course::getReviewScore).reversed()).toList();

        // 2nd layer
        //
        // a. sort by students
        Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparingInt(Course::getNoOfStudents);

        List<Course> a2 = courses.stream().sorted(comparingByNoOfStudentsIncreasing).toList();

        // b. sort by students - reverse
        Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator.comparingInt(Course::getNoOfStudents)
                .reversed();

        List<Course> b2 = courses.stream().sorted(comparingByNoOfStudentsDecreasing).toList();

        // c. sort by students then reviews
        Comparator<Course> comparingByNoOfStudentsAndReviews = Comparator.comparingInt(Course::getNoOfStudents)
                .thenComparing(Course::getReviewScore);

        List<Course> c2 = courses.stream().sorted(comparingByNoOfStudentsAndReviews).toList();

        // d. sort by students then reviews - reversed
        Comparator<Course> comparingByNoOfStudentsAndReviewsReversed = Comparator
                .comparingInt(Course::getNoOfStudents).thenComparing(Course::getReviewScore).reversed();

        List<Course> d2 = courses.stream().sorted(comparingByNoOfStudentsAndReviewsReversed).toList();
        //
        //
        //
        //
        System.out.println("\n****before sort*****\n");
        courses.forEach(System.out::println);
        System.out.println("\n*********\n");
        a1.forEach(System.out::println);
        // System.out.println("\n*********\n");
        // b1.forEach(System.out::println);
        // System.out.println("\n*********\n");
        // a2.forEach(System.out::println);
        // System.out.println("\n*********\n");
        // b2.forEach(System.out::println);
        // System.out.println("\n*********\n");
        // c2.forEach(System.out::println);
        // System.out.println("\n*********\n");
        // c1.forEach(System.out::println);
        // System.out.println("\n*********\n");
        // d2.forEach(System.out::println);
        // System.out.println("\n*********\n");
        // d1.forEach(System.out::println);

    }
}