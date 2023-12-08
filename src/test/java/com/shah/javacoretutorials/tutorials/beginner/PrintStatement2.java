package com.shah.javacoretutorials.tutorials.beginner;

/*
Another important method in Object is the .toString() method that returns a string representing the value of this object.
If you want to represent any object as a string, toString() method comes into existence.
If you print any object, java compiler internally invokes the toString() method on the object. 
So overriding the toString() method, returns the desired output;
it can be the state of an object etc. depends on your implementation.
 */

import com.shah.javacoretutorials.model.Year;
import org.junit.jupiter.api.Test;


class PrintStatement2 {
	@Test
	void test() {
		Year new1 = new Year("shah", 35, "Singapore");
		System.out.println(new1);
	}
}
