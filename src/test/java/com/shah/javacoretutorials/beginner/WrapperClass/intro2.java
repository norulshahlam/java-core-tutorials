package com.shah.javacoretutorials.beginner.WrapperClass;

import java.util.ArrayList;

/*  this class demonstrates the use of primitive datatype in wrapper class in collections */
public class intro2 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		/*  we are now creeating an ArrayList without datatype defined. This is considered not type-safe. this is also called raw type  */
		ArrayList salary = new ArrayList();

		salary.add(2);
		salary.add(3);
		salary.add("hi");

		
		/* if u wanna create arrayist of certain datatype ie int, you cannot assign int cos it only accept Integer class. thats where wrapper class comes. Collections only accept wrapper class, not primitive */
		ArrayList<Integer> bonus = new ArrayList<Integer>();
		bonus.add(4);
		bonus.add(3);
		System.out.println(bonus.get(1));
		//bonus.add("ddd"); now you cant add anything other than integer
	
	}
}