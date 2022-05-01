package com.shah.javacoretutorials.beginner.WrapperClass;
/*
A Wrapper class is a class whose object wraps or contains a primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store a primitive data types. In other words, we can wrap a primitive value into a wrapper class object.
Data structures in the Collection framework, such as ArrayList, LinkedList and Vector store only objects (reference types) and not primitive types.

The wrapper classes are immutable—you cannot change a wrapped value after the wrapper has been constructed. They are also final, so you cannot subclass them.
 */
public class BoxingUnboxing {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		int a = 1;
		int b = 2;

		Integer A = Integer.valueOf(a);	//manual boxing
		Integer B = b;	//auto boxing
		
		int c = B.intValue();	//manual unboxing
		int d = B;	//auto unboxing
		
		String str = "123";
		//to convert string to int; wrapper class is needed
		//parse int is a static method so to access it, wrapper class is needed (Integer)
		int n = Integer.parseInt(str);
    //once conv to int, u can make math ops
		System.out.println(n+1);  //123 + 1 = 124
		 //double check its datatype
		 System.out.println(((Object) str).getClass().getName());
		 System.out.println(((Object) n).getClass().getName());
	}
}
