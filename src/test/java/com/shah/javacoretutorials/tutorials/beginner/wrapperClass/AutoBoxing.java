package com.shah.javacoretutorials.tutorials.beginner.wrapperClass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/*Autoboxing: 
Converting a primitive value into an object of the corresponding wrapper class is called autoboxing. For example, converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:

a) Passed as a parameter to a method that expects an object of the corresponding wrapper class.
b) Assigned to a variable of the corresponding wrapper class.

java compiler performs automatic conversion between primitive type and corresponding Wrapper objects
 */
class AutoBoxing {

	@SuppressWarnings("unused")
	@Test
	void test() {
		// CASE 1: passed int (primitive type), it would be converted to Integer object at Runtime
		myMethod(2);

		/* CASE 2 */
		Integer inum = 3; // Assigning int to Integer: Autoboxing
		Long lnum = 32L; // Assigning long to Long: Autoboxing

		/* CASE 3 */
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(11); //Autoboxing - int primitive to Integer
		arrayList.add(22); //Autoboxing
	}

	void myMethod(Integer num) {
		System.out.println(num);
	}
}
/*
Autoboxing:
What we see:

Integer number = 100;
What compiler does (or what we used to do before java 1.5):

Integer number = Integer.valueOf(100);
 */