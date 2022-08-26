package com.shah.javacoretutorials.tutorials.Java8.FunctionalProgramming3.FunctionalInterfaces4;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/*
we will learn about Supplier & UnaryOperator, BiPredicate, BiFunction, BiConsumer

1. First lets look at behavior parameterization summary. 

So, until now, we were talking about taking an input and giving an output back or taking an input and giving no output back.

Taking an input and giving an output is a function. 
Taking an input but no output (returning void) is a consumer.

2. Supplier is the opposite. Supplier is the situation where you don't have any input. So, you won't have any parameters as input and what do you want to do is, we'd want to return something back. 
 
Recap - 

predicate - has a method that takes in 1 input & returns bolean
Consumer - has a method that takes in 1 input and process it without any return (void)
function - has a method that takes in 1 input, process and return the result.
binary  - has a method that takes in 2 input, process and return the result.

3. UnaryOperator - similar to Unary, take 2 parameter input (instead of 1) & returns the result of the same type as the input.
4. BiPredicate - similar to predicate, takes in 2 input (instead of 1) & returns bolean
5. BiFunction -  similar to Function - takes in 2 input (instead of 1) process and return the result.
6. BiConsumer - similar to Consumer - takes in 2 input (instead of 1) and process it without any return (void)
*/
public class SupplierUnaryOperator {
  @SuppressWarnings("unused")
  public static void main(String[] args) {

    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    Predicate<Integer> isEvenPredicate = (Integer x) -> x % 2 == 0;
    Function<Integer, Integer> squareFunction = x -> x * x;
    Function<Integer, String> stringOutpuFunction = x -> x + " ";
    Consumer<Integer> sysoutConsumer = x -> System.out.println(x);
    BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;

    // 2. Supplier - No input -> Return Something
    Supplier<Integer> randomIntegerSupplier = () -> {
      Random random = new Random();
      return random.nextInt(1000);
    };
    System.out.println(randomIntegerSupplier.get());

    // 3. UnaryOperator - 1 input
    UnaryOperator<Integer> unaryOperator = x -> 3 * x;
    System.out.println(unaryOperator.apply(10));

    // 4. BiPredicate - 2 input
    BiPredicate<Integer, String> biPredicate = (number, str) -> {
      return number < 10 && str.length() > 5;
    };
    System.out.println(biPredicate.test(10, "in28minutes"));

    // 5. BiFunction - 2 function input
    BiFunction<Integer, String, String> biFunction = (number, str) -> {
      return number + " " + str;
    };
    System.out.println(biFunction.apply(15, "in28minutes"));

    // 6. BiConsumer - 2 input, no return
    BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
      System.out.println(s1);
      System.out.println(s2);
    };
    biConsumer.accept(25, "in28Minutes");

  }

}
