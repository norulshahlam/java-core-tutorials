package Java8.Streams2;

import java.util.List;

/*
now we have understand streeam, let do an exercise use reduce()

Explanation
test1 - return 0 - only return x ie initial value
0 & 12
0 & 9
0 & 13
0 & 4
0 & 6
0 & 2
0 & 4
0 & 12
0 & 15
0

test2 - return 15 - returns last next number
0 & 12
12 & 9
9 & 13
13 & 4
4 & 6
6 & 2
2 & 4
4 & 12
12 & 15
15

test3 - find max value. in case theres negative value, we must set inital val with Integer.MIN_VALUE. then, if initial value is smaller than next val, (which it surely is as it is min val), return that next val. else return inital val. and so on

test4 is opp - find min value. in case theres big value, we must set inital val with Integer.MAX_VALUE. then, if initial value is bigger than next val (which it surely is as it is max val), return that next val. else return inital val. and so on

*/
public class Exercise1 {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
    System.out.println(test1(numbers));
    System.out.println(test2(numbers));
    System.out.println(test3(numbers));
    System.out.println(test4(numbers));
  }

  private static int test1(List<Integer> numbers) {
    return numbers.stream().reduce(0, (x, y) -> x);
  }

  private static int test2(List<Integer> numbers) {
    return numbers.stream().reduce(0, (x, y) -> y);
  }

  private static int test3(List<Integer> numbers) {
    return numbers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x < y ? y : x);
  }

  private static int test4(List<Integer> numbers) {
    return numbers.stream().reduce(Integer.MAX_VALUE, (x, y) -> x > y ? y : x);
  }
}