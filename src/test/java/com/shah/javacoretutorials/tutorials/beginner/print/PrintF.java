package com.shah.javacoretutorials.tutorials.beginner.print;

/*
The printf() method of Java PrintStream class is a convenience method to write a String which is formatted to this output Stream. It uses the specified format string and arguments.
*/
import org.junit.jupiter.api.Test;

import java.util.Calendar;
class PrintF {
	@Test
	void test() {

		int i = 1;
		int j = 2;
		int k = i + j;

		System.out.println("the addition of " + i + " and " + j + " is " + k);
		System.out.printf("the addition of %d and %d is %d\n\n", i, j, k);
		System.out.println("other format.....:");

		long n = 461012;
		System.out.format("Value of long is: %d%n", n); // --> "461012"
		System.out.format("Value of long is: %08d%n", n); // --> "00461012"
		System.out.format("Value of long is: %+8d%n", n); // --> " +461012"
		System.out.format("Value of long is: %,8d%n", n); // --> " 461,012"
		System.out.format("Value of long is: %+,8d%n%n", n); // --> "+461,012"

		double pi = Math.PI;

		System.out.format("Value of pie is: %f%n", pi); // --> "3.141593"
		System.out.format("Value of pie is: %.3f%n", pi); // --> "3.142"
		System.out.format("Value of pie is: %10.3f%n", pi); // --> " 3.142"
		System.out.format("Value of pie is: %-10.3f%n", pi); // --> "3.142"

		Calendar c = Calendar.getInstance();
		System.out.format("Today's date is: %tB %te, %tY%n", c, c, c); // --> "May 29, 2006"
		System.out.format("Today's time is: %tl:%tM %tp%n", c, c, c); // --> "2:34 am"
		System.out.format("Today's date is: %tD%n", c); // --> "05/29/06"
	}
}
