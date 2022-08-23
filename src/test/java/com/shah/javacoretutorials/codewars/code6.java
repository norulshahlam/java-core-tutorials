package  com.shah.javacoretutorials.codewars;

public class code6 {
  public static void main(String[] args) {

    int n = 5;
    print(n);

  }

  public static String print(int n) {

    // get the top part
    String s = " ";

    for (int j = 1; j <= n; j++) {
      System.out.println("*");

    }
    System.out.println(s + "s");
    return null;

  }
}

/*
 * You need to return a string that looks like a diamond shape when printed on
 * the screen, using asterisk (*) characters. Trailing spaces should be removed,
 * and every line must be terminated with a newline character (\n).
 * 
 * Return null/nil/None/... if the input is an even number or negative, as it is
 * not possible to print a diamond of even or negative size.
 * 
 * Examples A size 3 diamond:
 *
 ***
 *
 * 
 * ...which would appear as a string of " *\n***\n *\n"
 * 
 * A size 5 diamond:
 *
 ***
 *****
 ***
 *
 * 
 */