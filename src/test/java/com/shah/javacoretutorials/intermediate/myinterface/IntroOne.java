package com.shah.javacoretutorials.intermediate.myinterface;

/*
Interfaces specify what a class must do and not how.
It is the blueprint of the class.

Why do we use interface ?

It is used to achieve total abstraction.
Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
It is also used to achieve loose coupling.
Interfaces are used to implement abstraction. 

So the question arises why use interfaces when we have abstract classes?

The reason is, abstract classes may contain non-final variables,
whereas variables in interface are
1. final 
2. public and static.

https://www.geeksforgeeks.org/interfaces-in-java/
*/

import org.junit.jupiter.api.Test;

class IntroOne implements MyInterface {

    @Override
    public void display() {
        System.out.println("Geek");
    }

    @Test
    void test() {
        {
            IntroOne t = new IntroOne();
            t.display();

            System.out.println(a);

            /** 2. we can access 'a' as it is public and static.
             * & since it is final, we cant make any changes
             *  a++;  <-- causes error
             * **/
        }
    }
}

