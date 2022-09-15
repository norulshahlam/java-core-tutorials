package com.shah.javacoretutorials.tutorials.java8.FunctionalProgramming3.FunctionalInterfaces4;

/*

What is Behaviour Parameterization???

approach 1 has only 1 diff - the behaviour/logic. the rest contains many duplicates 

appoach 2 - we pass the logic / behaviour of the method as an argument (in the 2nd arg) so we just use diff logic for each arg, avoiding any repetitions. this is called behaviour parameterization
*/
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviourParameterization {
  public static void main(String[] args) {

    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    // approach #1 - having 2 methods but having almost same structure
    numbers.stream().filter(x -> x % 2 == 0) // even
        .forEach(System.out::println);
    numbers.stream().filter(x -> x % 2 != 0) // odd
        .forEach(System.out::println);

    List<Integer> squared = numbers.stream()// square & add to list
        .map(x -> x * x) //
        .collect((Collectors.toList()));
    List<Integer> cubed = numbers.stream()// cube & add to list
        .map(x -> x * x * x) //
        .collect((Collectors.toList()));
    //
    //
    // approach #2
    filterAndPrint(numbers, x -> x % 2 == 0); // even
    filterAndPrint(numbers, x -> x % 2 != 0); // odd
    filterAndPrint(numbers, x -> x % 3 == 0); // divisible by 3

    List<Integer> squared2 = mapCreateList(numbers, x -> x * x); // square & add to li
    List<Integer> cubed2 = mapCreateList(numbers, x -> x * x * x); // cube & add to list

    System.out.println(squared);
    System.out.println(cubed);
    System.out.println(squared2);
    System.out.println(cubed2);
  }

  private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
    numbers.stream().filter(predicate).forEach(System.out::println);
  }

  private static List<Integer> mapCreateList(List<Integer> numbers, Function<Integer, Integer> mapFunction) {
    return numbers.stream().map(mapFunction).collect((Collectors.toList()));
  }
}
