package com.shah.javacoretutorials.tutorials.intermediate;

import org.junit.jupiter.api.Test;

/*
Just like methods, variables of a class too can have another class as its member. Writing a class within another is allowed in Java. The class written within is called the nested class, and the class that holds the inner class is called the outer class.

Anonymous class can be used if you want to override method of class or interface without creating another class to create it. The override method can be implemented upon creation of object anonymous class has no class name. It is denoted by $ sign
 */
class ClassAnonymous {

	@Test
	void test() {

    //this is the part where you 1 2 override
		E e = new E(){
			public void show(){
				System.out.println("inside anonymous class");
			}
		};
		e.show();
	}
}
class E{
	public void show(){
		System.out.println("inside class E");
	}
}