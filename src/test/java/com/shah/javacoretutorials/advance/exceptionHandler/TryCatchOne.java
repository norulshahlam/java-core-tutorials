package com.shah.javacoretutorials.advance.exceptionHandler;
/*
When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.

When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Exception Handler.. Java will throw an exception (throw an error).

by using exception handler, if 1 part of the code gives error, that part can be 'handled' while the rest of the code/program can continue running

It also provides a meaningful message to the user about the issue rather than a system generated message, which may not be understandable to a user.

we have three categories of Exceptions. You need to understand them to know how exception handling works in Java.

a) Checked (compile time) exceptions − A checked exception is an exception that is checked (notified) by the compiler at compilation-time. These exceptions cannot simply be ignored, the programmer should take care of (handle) these exceptions.

b) Unchecked (Runtime) exceptions − An unchecked exception is an exception that occurs at the time of execution. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.

For example, if you have declared an array of size 5 in your program, and trying to call the 6th element of the array then an ArrayIndexOutOfBoundsExceptionexception occurs.

c) Errors − These are not exceptions at all, but problems that arise beyond the control of the user or the programmer. Errors are typically ignored in your code because you can rarely do anything about an error. For example, if a stack overflow occurs, an error will arise. They are also ignored at the time of compilation.

acceptable structure:

try-catch-finally
try-catch-catch-finally
try-finally

'try' without any 'catch' or 'finally' can result in error
 */

import org.junit.jupiter.api.Test;

class TryCatchOne {
	@Test
	void test() {
		// 1. The try statement allows you to define a block of code to be tested for
		// errors while it is being executed.
		try {

			// 1b. this triggers exception n wil skip all code below n go to 'catch'
			int k = 3 / 0;
			System.out.println(k);
			System.out.println("in try");

		}
		// 2. The catch statement allows you to define a block of code to be executed,
		// if an error occurs in the try block. if u know what type of exception, u can
		// indicate as stated. else use 'e' and it will run any type of error
		catch (Exception e) {
			// 'e' will print the type of error. or u can print your own statement
			System.out.println(e);

			// or specifically if u want to highlight that error message. take note this
			// will executed first once there is error system.
		}
		// 3. this part will execute in both situations (error or no error)
		finally {
			System.out.println("in finally");
		}

		System.out.println("end of code");

	}
}