package com.shah.javacoretutorials.intermediate.instanceLocalVariable;

import org.junit.jupiter.api.Test;

/*
insrtance vs local variable
*/
public class InstanceVar {

 	// Here i is an Instance variable.
	int i;

    @Test
    void test() {
		// Here i is an Instance variable.
		test t1 = new test();
		System.out.println("Value before calling method1: " + t1.i);
        method1(i);
	}

	@SuppressWarnings("unused")
	  // j - method parameter, k - local variable.
		void method1(int j) {
		int k;
		i = j;

		/* Local Variable(k)'s life ends once execution for this method
		 * completes. As k is local variable it needs to be initialized
		 * before we can use it. But as it is not getting used here,
		 * it can stay here without initializing
		 * */
	}
}
class test {
	// static variable - class level variable
	static int i;
    void method1() { i++; }
    void method2() { i++; }
}