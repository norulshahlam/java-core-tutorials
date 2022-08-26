package com.shah.javacoretutorials.tutorials.intermediate.regex;
/*
//this function checks if two strings are same
*/
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

class MatcherTwo {
	@Test
	void test() {

		String a="test";
		String b="test";
		String c = new String("test1");
		String d = new String("test1");
		String e = new String("test");
		
		boolean isMatched = Pattern.matches(a, b);	
		System.out.println(isMatched);
		boolean isMatched2 = Pattern.matches(c,d);	
		System.out.println(isMatched2);
		
		boolean isMatched3 = Pattern.matches(a,e);	
		System.out.println(isMatched3);
		
	}
}

