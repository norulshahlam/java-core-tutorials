package com.shah.javacoretutorials.tutorials.advance.exceptionHandler;

/*
Exception handling best practices

- Never hide exceptions
- don't use it for flow-control: expensive resources
- think about your user
- think about your support team
- think about the calling method
- have global exception handling

This also includes forced exception handling.
*/

import org.junit.jupiter.api.Test;

class UserDefinedExceptionFive {

    @Test
    void test() {
        int i = 5;
        try {
            if (i < 10) {
                // firstly, forcing an error, then using a constructor of a class
                throw new MyException("number must be >= 10");
            } else System.out.println("hi");
        }
        // handle 'error' using your defined exception
        catch (MyException e) {
            System.out.println(e);
        }
    }
}

// how to define your own exception
class MyException extends Exception {
    public MyException(String msg) {
        // if u 1 2 print the error msg throwed
        super(msg);
    }
}