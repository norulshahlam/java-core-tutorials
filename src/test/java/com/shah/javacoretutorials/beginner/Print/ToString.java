package com.shah.javacoretutorials.beginner.Print;

/*
Another important method in Object is the .toString() method that returns a string representing the value of this object.
If you want to represent any object as a string, toString() method comes into existence.
If you print any object, java compiler internally invokes the toString() method on the object. 
So overriding the toString() method, returns the desired output, 
it can be the state of an object etc. depends on your implementation.
 */

class year {
	private String name;
	private int age;
	private String place;

	public year(String m,int y, String d) {
		name = m;
		age = y;
		place = d;
	}

	public String toString() {
		// return String.format("place is %d, name is %d, age is %d", place, name, age);
		// //return "place is " +place+ "/" +name+ "/" +age;

		return "" + "\nName is " + name + ", age is " + age + ", Staying in " + place;
	}
}

public class ToString {
	public static void main(String[] args) {
		year new1 = new year("shah", 35, "Singapore");

		System.out.println(new1);
	}
}
