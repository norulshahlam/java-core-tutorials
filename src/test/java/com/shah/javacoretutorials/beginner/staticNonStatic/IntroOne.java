package com.shah.javacoretutorials.beginner.staticNonStatic;

import org.junit.jupiter.api.Test;

/*
static var means variable is shared / accessible among all obj of the same class. if any object changes that static variable, it will affect other object too
instance variables is th opposite - has its own copy of variable aka fields/member variables

Static - class level
non-static - object level
 */


class IntroOne {

	@Test
	void test() {

		Employee a = new Employee(01, "shah", "mike");
		Employee b = new Employee(02, "ahmad", "mike");

    // here both a b has same ceo
		System.out.println(a);
		System.out.println(b); 

    System.out.println("after changing a static variable CEO");

    // we try to change the ceo from a. which also change ceo from b indirectly bcos of static var
		Employee.CEO = "bob";
    //name for 'a' will change only for 'a' not 'b' cos it is not shared (static) var
		a.name="shah1";
    
		// here both a b has same new ceo
		System.out.println(a);
		System.out.println(b); 
	}
}