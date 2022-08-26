package com.shah.javacoretutorials.tutorials.Java8.FunctionalProgramming3.HigherOrderFunction5;

/*
1. understand that List is immutable, ArrayList is mutable
2. replaceAll
3. removeIf
*/
import java.util.ArrayList;
import java.util.List;

public class replaceRemove {
  public static void main(String[] args) {

    List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
        "Kubernetes");
    // copy list of courses
    List<String> modifyableCourses = new ArrayList<String>(courses);
    // 1. Error cos u r trying to mutate List
    // courses.replaceAll( str -> str.toUpperCase());
    //
    // 2.
    modifyableCourses.replaceAll(str -> str.toUpperCase());
    System.out.println(modifyableCourses);
    //
    // 3.
    modifyableCourses.removeIf(str -> str.length() < 6);
    System.out.println(modifyableCourses);
  }
}
