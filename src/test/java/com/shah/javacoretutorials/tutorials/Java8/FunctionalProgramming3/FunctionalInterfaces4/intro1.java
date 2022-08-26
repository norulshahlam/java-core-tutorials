package com.shah.javacoretutorials.tutorials.Java8.FunctionalProgramming3.FunctionalInterfaces4;

/*
Until now, we have written a number of lambda expressions,
we have written a number of method references.
How do these work in the background?
How are you able to pass a method code to another method?
Let's discuss about that in this specific section. 

We'll talk about what is a functional interface and
we'll look at multiple functional interfaces like consumer, predicate, and function.

Binary  - has a method that takes in 2 input, process and return the result.
Predicate - has a method that takes in 1 input & returns bolean
Consumer - has a method that takes in 1 input and process it without any return (void)
Function - has a method that takes in 1 input, process and return the result.

we wil go 1 level down each repetitions
*/
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class intro1 {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    /*
     * we see that - filter takes a Predicate as argument map take a Function as
     * argument forEach takes a Consumer as argument
     */

    // 1. simplified layer
    numbers.stream().filter(x -> x % 2 == 0).map(x -> x * x).forEach(System.out::println);

    // 2. middle layer - replace the arg and define it in scope
    Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
    Function<Integer, Integer> squareFunction = x -> x * x;
    Consumer<Integer> sysoutConsumer = System.out::println;

    numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(sysoutConsumer);

    // 3. deep layer - the implementation
    Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
      @Override
      public boolean test(Integer x) {
        return x % 2 == 0;
      }
    };
    Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer x) {
        return x * x;
      }
    };
    Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
      @Override
      public void accept(Integer x) {
        System.out.println(x);
      }
    };

  }
}