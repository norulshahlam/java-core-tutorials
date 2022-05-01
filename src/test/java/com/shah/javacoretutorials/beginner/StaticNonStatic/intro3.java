package com.shah.javacoretutorials.beginner.StaticNonStatic;
/*
1. static var means variable is shared / accessible among all obj of the same class. if any object changes that static variable, it will affect other object too
2. non-static (instance) variables is the opposite - has its own copy of variable aka fields/member variables

Static - class level
non-static - object level

here we will cover non-static block, method, variable. how do we use static members?
only diff is:

a) u have to create an obj to acesss it
b) block will get called when obj is created, rather than being called on runtime

 */

public class intro3 {

	int num;

	void method1() {
		System.out.println("Inside method1");
	}

	// non-static block - will get called when new obj is created
	{
		System.out.println("non-Static Block 1");
	}
	// if theres 2 non-static block, the top wil get called first
	{
		System.out.println("non-Static Block 2");
	}

	public static void main(String[] args) {
		System.out.println("in main method");
		// u call any non-ststic member, we need to create an obj of the class
		intro3 obj = new intro3();
		System.out.println(obj.num);
		obj.method1();
	}

}
