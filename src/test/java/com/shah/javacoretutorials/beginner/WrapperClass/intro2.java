package com.shah.javacoretutorials.beginner.wrapperClass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/*  this class demonstrates the use of primitive datatype in wrapper class in collections */
class intro2 {
	@SuppressWarnings("rawtypes")
	@Test
	void test() {
		
		/*  we are now creating an ArrayList without datatype defined. This is considered not type-safe.
		this is also called raw type  */
		ArrayList salary = new ArrayList();

		salary.add(2);
		salary.add(3);
		salary.add("hi");

		
		/* if u wanna create arrayist of certain datatype ie int, you cannot assign int cos it only accept Integer class.
		thats where wrapper class comes. Collections only accept wrapper class, not primitive */
		ArrayList<Integer> bonus = new ArrayList<>();
		bonus.add(4);
		bonus.add(3);
		System.out.println(bonus.get(1));
		//bonus.add("ddd"); now you cant add anything other than integer
	
	}
}