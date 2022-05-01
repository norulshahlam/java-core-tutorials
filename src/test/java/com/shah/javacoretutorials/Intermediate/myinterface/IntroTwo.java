package com.shah.javacoretutorials.Intermediate.myinterface;

/*
Earlier we show that in order to implement abstact class we have to:
1. implements interface
2. implement method
3. create object of the class that implements it
4. call the method

here we use lambda to achieve the above using less code
*/

import org.junit.jupiter.api.Test;

class IntroTwo {

    @Test
    void test() {
        {
            MyInterface m = () -> System.out.println("Displaying something....");
            m.display();
        }
    }
}

