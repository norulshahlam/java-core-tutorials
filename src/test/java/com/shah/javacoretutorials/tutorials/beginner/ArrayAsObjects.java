package com.shah.javacoretutorials.tutorials.beginner;

// Array can also store objects. 

import com.shah.javacoretutorials.model.Student;
import org.junit.jupiter.api.Test;

class ArrayAsObjects {

	/**
	 * An array of Student type holding student objects
	 */

	@Test
	void test()  {

		Student[] arr = new Student[2];
		arr[0] = new Student(01, "shah", 99);
		arr[1] = new Student(02, "farid", 30);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}