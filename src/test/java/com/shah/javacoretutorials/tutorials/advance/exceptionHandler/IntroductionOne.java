package com.shah.javacoretutorials.tutorials.advance.exceptionHandler;
/*
When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.

When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Exception Handler.. Java will throw an exception (throw an error).

by using exception handler, if 1 part of the code gives error, that part can be 'handled' while the rest of the code/program can continue running

It also provides a meaningful message to the user about the issue rather than a system-generated message, which may not be understandable to a user.

we have three categories of Exceptions. You need to understand them to know how exception handling works in Java.

a) Checked (compile time) exceptions − A checked exception is an exception that is checked (notified) by the compiler at compilation-time. These exceptions cannot simply be ignored, the programmer should take care of (handle) these exceptions.

b) Unchecked (Runtime) exceptions − An unchecked exception is an exception that occurs at the time of execution. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.

For example, if you have declared an array of size 5 in your program, and trying to call the 6th element of the array, then an ArrayIndexOutOfBoundsException will occur.

c) Errors − These are not exceptions at all, but problems that arise beyond the control of the user or the programmer. Errors are typically ignored in your code because you can rarely do anything about an error. For example, if a stack overflow occurs, an error will arise. They are also ignored at the time of compilation.

acceptable structure:

try-catch-finally
try-catch-catch-finally
try-finally

 */

import org.junit.jupiter.api.Test;

class IntroductionOne {
    @Test
    void tryCatch() {

        try {
            int k = 3 / 0;
            System.out.println("in try " + k);
        }
        /* 1. The catch statement allows you to define a block of code to be executed. If an error occurs in the try block. If u know what type of exception u can indicate as stated. Else use 'e' and it will run any type of error. If you are using multiple catch, make sure the catch exception is in order of hierarchy - starting from subclasses to superclass
         */

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Generic exception caught");
            System.out.println(e);
        }
        finally {
            // 2. this part will execute in both situations (error or no error)
            System.out.println("in finally");
        }
        System.out.println("end of code");
    }
}