package com.shah.javacoretutorials.beginner.StringCompare;

/*
 * manipulate string values
 */
public class manipulateString {

	public static void main(String[] args) {
		
		
		String x = "Donald trump";
		
		System.out.println("Hello " + x);
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(2, 7));
		System.out.println(x.charAt(3));
		
		//changing from string to int
		String age = "40";
		int a = Integer.parseInt(age) + 10;
		System.out.println(a);
		

	}

}
