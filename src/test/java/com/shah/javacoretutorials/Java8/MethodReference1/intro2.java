package Java8.MethodReference1;

/*
same as earlier lesson but this time we will print only even numbers using structured apporach first, then functional approach. 

functional approach will use stream()

1. structured approach
2. functional approach - use method (isEven method in intro class) as argument.
3. lambda approach - shorter version of (2)
*/
import java.util.List;

public class intro2 {

  public static void main(String[] args) throws Exception {

    List<Integer> numbers = List.of(2, 5, 8, 4, 2, 6, 1, 9, 3);

    printEvenNum1(numbers);
    System.out.println("**************");
    printEvenNum2(numbers);
    System.out.println("**************");
    printEvenNum3(numbers);
  }

  // 1. structured approach
  private static void printEvenNum1(List<Integer> numbers) {
    for (int number : numbers) {
      if (number % 2 == 0) {
        System.out.println(number);
      }
    }
  }

  // 2. functional approach with method reference
  private static void printEvenNum2(List<Integer> numbers) {
    numbers.stream().filter(intro2::isEven).forEach(System.out::println);
  }

  // 3. functional approach - lambda & STATIC method reference
  private static void printEvenNum3(List<Integer> numbers) {
    numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
  }

  private static boolean isEven(int number) {
    return number % 2 == 0;
  }
}
