package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.Test;


public class code8 {

	@Test
	void contextLoads() {

		String a = "abc";
		String 	b = "pqr" + "abc";
		String c = a + "123";
		String d = "abc123";
		String e = new String("xyz");

		System.out.println(c ==	d);
		System.out.println("xyz"== e);


	}
	@Test
	void contextLoads2() {
		System.out.println(0.1*3);
		System.out.println(0.1*2);
		System.out.println(0.1*3 == 0.3);
		System.out.println(0.1*2 == 0.2);
	}
}
