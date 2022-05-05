package com.shah.javacoretutorials.intermediate.instanceLocalVariable;
/*
insrtance vs local variable
*/

import org.junit.jupiter.api.Test;

class StaticVar {
	// static variable - class level variable
	static int i = 1;
	@Test
	void test1() {
		// As i is a static variable it can be accessed directly without using any object
		System.out.println("Value before calling method1: " + i);
		test1 t1 = new test1();
		t1.method1(i);
		System.out.println("Value after calling method1: " + i);
		t1.method2(i);
		System.out.println("Value after calling method2: " + i);
	}
}
class test1 {
	void method1(int i) { i++; }
	void method2(int i) { i++; }
}