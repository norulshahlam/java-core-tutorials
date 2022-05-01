package com.shah.javacoretutorials.beginner.ThisKeyword;

/*this example shows the diff between using 'this' keyword
when a local var has the same name as instance var, the local var hides / repalces the instance var

'this' lets you refer directly to the instance var 
‘this’ is a reference variable that refers to the local object.
*/
class A {
	String i = "global";

	public void display1() {
		String i = "local";
		System.out.println(i);
	}
}
@SuppressWarnings("unused")
class B {
	String i = "global";

	public void display() {
		String i = "local";
		System.out.println(this.i);
	}
}
public class VariableHiding {
	public static void main(String[] args) {

		A A = new A();
		// this method doesnt use 'this' so it uses the local variable, inside the method
		A.display1();

		B B = new B();
		// this method uses 'this' so it uses the global variable declared in the class itself
		B.display();
	}
}