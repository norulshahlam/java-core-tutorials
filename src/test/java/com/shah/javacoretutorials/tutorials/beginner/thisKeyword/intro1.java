package com.shah.javacoretutorials.tutorials.beginner.thisKeyword;

/*
when two variable of the same name(local & constructor), compiler will use
local even if u use parameterized constructor. to counter that, 'this.name'
means to use the one where in the method is, not the local variable

‘this’ is a local variable that refers to the current object.	 */

import org.junit.jupiter.api.Test;

class thisPublic {
	public int age = 0;
	public String name = "default name";

  //default constructor
	thisPublic() {}
	thisPublic(int age, String name) {
    //this.age refers to var in class, not the param
		this.age = age; 
		this.name = name;
	}
}

class intro1 {
	@Test
	void test() {
		thisPublic new1 = new thisPublic();
		thisPublic new2 = new thisPublic(20, "shah");

		System.out.println("new1 is " + new1.name + ", " + new1.age);
		System.out.println("new2 is " + new2.name + ", " + new2.age);
	}
}