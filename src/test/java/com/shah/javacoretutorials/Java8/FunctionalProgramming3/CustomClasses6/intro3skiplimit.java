package Java8.FunctionalProgramming3.CustomClasses6;

import java.util.List;
import java.util.stream.Collectors;

/*
Playing with 
limit 3 - show only first 3
skip 5 - skip first 5 
takeWhile - show as long condiiton is met - until it doenst, it stops
dropWhile - opp - keep skipping as long condiiton is met - until it doenst, it shows the rest
*/
public class intro3skiplimit {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
        new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
        new Course("Microservices", "Microservices", 96, 25000), new Course("FullStack", "FullStack", 91, 14000),
        new Course("AWS", "Cloud", 92, 21000), new Course("Azure", "Cloud", 99, 21000),
        new Course("Docker", "Cloud", 92, 20000), new Course("Kubernetes", "Cloud", 91, 20000));

    // skip first n
    List<Course> a1 = courses.stream().limit(5).collect(Collectors.toList());
    // limit
    List<Course> a2 = courses.stream().skip(3).collect(Collectors.toList());
    // takeWhile
    List<Course> a3 = courses.stream().takeWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList());
    // dropWhile
    List<Course> a4 = courses.stream().dropWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList());

    System.out.println("\n****initial values*****\n");
    courses.forEach(System.out::println);
    // System.out.println("\n***limit to first 5******\n");
    // a1.forEach(System.out::println);
    // System.out.println("\n***skip first 3******\n");
    // a2.forEach(System.out::println);
    // System.out.println("\n***takeWhile******\n");
    // a3.forEach(System.out::println);
    System.out.println("\n*****dropWhile******\n");
    a4.forEach(System.out::println);
  }
}
