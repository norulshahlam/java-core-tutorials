package com.shah.javacoretutorials.intermediate.defaultmethod;

import org.junit.jupiter.api.Test;

/*
we show here that interface can be defined within the interface itself, without using another class. both way can be achieved. we understand that this is useful when user need to modify interface sometime later. eg if there are 10 classes implementing interface of 2 methods. n in future user needs to add 1 more method in interface so this gives error in which this 10 classes needs to define this new method. imagine having 100 class implementing. to overcome this, java 8 has keyword 'default' where user can implement in interface so the 10 classes dont need to define this additional method
 */
interface d {
    // method is defined here by using default keyword
    default void show() {
        System.out.println("showing in interface a");
    }

    default void show2() {
        System.out.println("showing in interface a");
    }

    // method will be implemented later upon implemented
    void eat();

    // in future if i 1 2 add a method, i can use default keyword so the classes
    // that implements this interface dont need to define.
    default void newMethod() {
        System.out.println("sorry guys i am new here so dont need to implement me cos i have 'default' keyword");
    }
}

public class DefaultMethod1 implements d {

    // implement abstract method here.
    public void eat() {
        System.out.println("eating in interface a");
    }

    @Test
    void test() {
        DefaultMethod1 d = new DefaultMethod1();

        d.show(); // default method
        d.eat(); // implemented in class
    }
}
