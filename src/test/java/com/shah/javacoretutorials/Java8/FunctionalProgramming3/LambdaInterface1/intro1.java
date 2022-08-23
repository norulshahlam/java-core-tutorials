package Java8.FunctionalProgramming3.LambdaInterface1;

/*
 Why use Lambda Expression?
1. To provide the implementation of Functional interface.
2. Less coding.

lambda provides a clear and concise way to represent one method interface using an expression.
Lambda is an expression to provide the implementation of a functional interface

It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code
lambda is to implement interface. no new class is created using lambda during implementation of interface
lambda only works for functional interface - single abstract method
 */

public class intro1 {

	public static void main(String[] args) {

A a = new A();
a.show();

		// 2. with lambda, u can do this way - w/o create a new class
		F f = () -> System.out.println("hello");
		f.show();

	}
}

// 1. w/o lambda we have to create a class to implement n define its method
class A implements F {
	public void show() {
		System.out.println("world");
	}
}

@FunctionalInterface // means interface having 1 abstract method
interface F { // SAM - single abstract method
	void show();
}
