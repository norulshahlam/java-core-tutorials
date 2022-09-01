package  com.shah.javacoretutorials.codewars;

public class Code4 {
  public static void main(String[] args) {
    // String str = "4556364607935616";
    String str = "Skid";
    System.out.println(maskify(str));
  }

  public static String maskify(String str) {

    int r = str.length() - 4;

    if (r < 1) {
      return str;
    }
    StringBuilder sb = new StringBuilder(str);
    for (int i = 0; i < r; i++) {
      sb.setCharAt(i, '#');
    }
    System.out.println(sb);
    return sb.toString();
  }
}

/*
 * Usually when you buy something, you're asked whether your credit card number,
 * phone number or answer to your most secret question is still correct.
 * However, since someone could look over your shoulder, you don't want that
 * shown on your screen. Instead, we mask it.
 * 
 * Your task is to write a function maskify, which changes all but the last four
 * characters into '#'.
 * 
 * Examples
 * 
 * Maskify.Maskify("4556364607935616"); // should return "############5616"
 * 
 * Maskify.Maskify("64607935616"); // should return "#######5616"
 * 
 * Maskify.Maskify("1"); // should return "1"
 * 
 * Maskify.Maskify(""); // should return "" //
 * "What was the name of your first pet?"
 * 
 * Maskify.Maskify("Skippy"); // should return "##ippy"
 * 
 * Maskify.Maskify("Nananananananananananananananana Batman!"); // should return
 * "####################################man!"
 * 
 * char[] strChars = str.toCharArray(); for( int i = 0; i < strChars.length - 4;
 * i++ ) { strChars[i] = '#'; }
 * 
 * return str.replaceAll(".(?=.{4})", "#");
 * 
 * 
 */