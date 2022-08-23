package  com.shah.javacoretutorials.codewars;

import java.util.ArrayList;

public class code7 {
  public static void main(String[] args) {
    String data = "iiisdosodddddiso";

    parse(data);
  }

  public static int[] parse(String data) {
    ArrayList<Integer> b = new ArrayList<>();
    int a = 0;

    // Printing array
    for (char c : data.toCharArray()) {
      if (c == 'i')
        a++;
      if (c == 'd')
        a--;
      if (c == 's')
        a *= a;
      if (c == 'o') {
        b.add(a);
      }
    }
    System.out.println(9 / 2);
    return b.stream().mapToInt(i -> i).toArray();
  }
}
/*
 * Write a simple parser that will parse and run Deadfish. Deadfish has 4
 * commands, each 1 character long i increments the value (initially 0) d
 * decrements the value s squares the value o outputs the value into the return
 * array Invalid characters should be ignored. Deadfish.parse("iiisdoso") =- new
 * int[] {8, 64};
 */