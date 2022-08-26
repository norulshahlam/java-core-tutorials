package com.shah.javacoretutorials.tutorials.Java8.FunctionalProgramming3.LambdaInterface1;
/*
same as previous exxample, only this is with an argument
 */

interface B {
	void show(int i);
}

public class intro2 {

	public static void main(String[] args) {

		// here is implementation of interface
		B obj = i -> System.out.println("salary is: " + i);

		obj.show(7500);
	}
}
