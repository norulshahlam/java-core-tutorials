package com.shah.javacoretutorials.beginner.Objects;

import org.junit.jupiter.api.Test;

class HashCode1 {

	@Test
	void test()  {
	
		Object a = new Object();		
		Object b = a;		
		Object c = new Object();
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode()); // same as 'a'
		System.out.println(c.hashCode());
		
	}
}
