package Java8.Streams2;

import java.util.List;

/*

1. Streams have a strong affinity with functions.
Java 8 introduces lambdas and functional interfaces, which opens a whole toybox of powerful techniques. Streams provide the most convenient and natural way to apply functions to sequences of objects.

2. Streams encourage less mutability. 
This is sort of related to the functional programming aspect-- the kind of programs you write using streams tend to be the kind of programs where you don't modify objects.

3. Streams encourage looser coupling. 
Your stream-handling code doesn't need to know the source of the stream, or its eventual terminating method.

********************************

reduce operation applies a binary operator to each element in the stream where the first argument to the operator is the return value of the previous application and second argument is the current stream element.

sum(), min(), max(), count() etc. are some examples of reduce operations. reduce() explicitly asks you to specify how to reduce the data that made it through the stream.

we will show the structured method first before going to functional. all the below methods does the same thing - calculate total sum

1. Structured approach
2. functional approach
3. lambda approach
4. method reference - similar to method ref used for System.out.println()) - class=System.out, method=println. so for this case, Integer is a class having a sum method

EXplanation for reduce method below :

0 refer to initial values, 
x = aggregated value,
y = next number. 
y will keep added to x. 
so the flow will be as follows:

0 + 12 =
12 + 9 =
21 + 13 =
34 + 4 =
38 + 6 =
44 + 2 =
46 + 4 =
50 + 12 =
62 + 15 =
77
*/
public class intro1 {
  public static void main(String[] args) {

    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    System.out.println(getTotal1(numbers));
    System.out.println(getTotal2(numbers));
    System.out.println(getTotal3(numbers));
    System.out.println(getTotal4(numbers));
  }

  // 1. Structured approach
  private static int getTotal1(List<Integer> numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

  // 2. functional approach - method reference
  private static int getTotal2(List<Integer> numbers) {
    return numbers.stream().reduce(0, intro1::sum);
  }

  private static int sum(int aggregate, int nextNumber) {
    System.out.println(aggregate + " + " + nextNumber + " = ");
    return aggregate + nextNumber;
  }

  // 3. lambda approach
  private static int getTotal3(List<Integer> numbers) {
    return numbers.stream().reduce(0, (x, y) -> x + y);
  }

  // 4. static method reference
  private static int getTotal4(List<Integer> numbers) {
    return numbers.stream().reduce(0, Integer::sum);
  }

}
