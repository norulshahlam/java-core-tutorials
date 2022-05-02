package com.shah.javacoretutorials.advance.exceptionHandler;

/*
Exception handling best practics

- Never hide exceptions
- dont use it for flow-control - expensive resourcest
- think about your user
- think about your support team
- think about the calling method
- have global exception handling
*/

import org.junit.jupiter.api.Test;

class UserDefinedExceptionSix {

    @Test
    void test() {
        System.out.println("heelo");
        int i = 5;

        try {
            if (i < 10) {
                // firstly forcing an error, then using a constructor of a class
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