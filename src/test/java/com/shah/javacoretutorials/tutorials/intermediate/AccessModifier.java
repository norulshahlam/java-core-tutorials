package com.shah.javacoretutorials.tutorials.intermediate;

/*
Access Modifiers in Java

There are two types of modifiers in Java: access modifiers and non-access modifiers.

The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

There are four types of Java access modifiers:

1. Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
2. Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
3. Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
4. Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

There are many non-access modifiers, such as static, abstract, synchronized, native, volatile, transient, etc. Here, we are going to learn the access modifiers only.

											ACCESSIBILITY MATRIX
											---------------------

				(1)					(2)					(3)				(4)
			within package		within package		outside package		outside package
modifier	within class		outside class		by subclass			other classes
--------------------------------------------------------------------------------------
private			yes					no		  			no			  		no
default			yes					yes		  			no	 				no
protected 		yes					yes		  			yes				  	no
public	  		yes					yes					yes		 		 	yes

 */

import org.junit.jupiter.api.Test;

class RunMe {

	@Test
	void test() {
		protected1 new1 = new protected1();

		System.out.println(new1.y);	// (1)
		System.out.println(new1.z);

		private1 new2 = new private1();
		System.out.println(new2.y);

		// below code shows error cos var 'a' is private
		// System.out.println(new2.a);
		System.out.println(new2.y);

		System.out.println();

		public1 new3 = new public1();
		// below code gives error because variable 'a' is private
		// System.out.println(new3.a);
		System.out.println(new3.z);

	}
}
class protected1 {

	protected int y = 5;
	int z = 6;
}
@SuppressWarnings("unused")
class private1 extends protected1 {

	private final int a = 1;
	int b = 2;
}
class public1 extends private1 {

	int c = 4;
}
