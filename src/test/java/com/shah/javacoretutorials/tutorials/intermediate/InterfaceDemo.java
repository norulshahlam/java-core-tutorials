package com.shah.javacoretutorials.tutorials.intermediate;

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

Default Method
if there are 10 classes implementing interface of abstract methods. n in future user needs to add 1 more abstract method in interface so this gives error in which this 10 classes needs to define this new method. imagine having 100 class implementing. to overcome this, java 8 has keyword 'default' where user can implement in interface so the 10 classes dont need to define this additional method

Static Method
The static keyword is used to create methods that will exist independently of
any instances created for the class. Static methods do not use any instance
variables of any object of the class they are defined in.

https://www.geeksforgeeks.org/interfaces-in-java/

Here we demonstrate on:
1. implement abstract class
2. calling (static) variable from interface
3. default method
4. static method
*************************************

To implement abstract class we have to:
1. implements interface
2. implement method
3. create object of the class that implements it
4. call the method

or, use lambda to achieve the above using less code
*/

import org.junit.jupiter.api.Test;

class InterfaceDemo implements MyInterface {

    @Override
    public void display() {
        System.out.println("implement abstract class using method 1");
    }

    @Test
    void method1() {
        // Method 1
        InterfaceDemo t = new InterfaceDemo();
        t.display();
    }

    @Test
    void method2() {
        // Method 2
        MyInterface m = () -> System.out.println("implement abstract class using method 2");
        m.display();
    }

    @Test
    void publicStaticFinal() {

        System.out.println(a);
        /** 2. we can access 'a' as it is public and static. And since it is final, we cant make any changes
         *  a++;  <-- causes error
         * **/
    }

    @Test
    void defaultMethod() {
        InterfaceDemo t = new InterfaceDemo();
        t.newlyAddedMethod();
    }

    @Test
    void staticMethod() {
        /* here u can straight away call a method in interface i if it is declared as
         static.
         */
        MyInterface.show();
    }
}

interface MyInterface {

    // public, static and final
    int a = 10;

    // public and abstract
    void display();

    // default and static method is introduced in java 8. In future if we want to add a new method, we can use default keyword so the classes that implements this interface dont need to define.
    default void newlyAddedMethod() {
        System.out.println("sorry guys i am new here so dont need to implement me cos i have 'default' keyword");
    }

    static void show() { // here is the static method, implemented.
        System.out.println("hi i am a static method");
    }
}