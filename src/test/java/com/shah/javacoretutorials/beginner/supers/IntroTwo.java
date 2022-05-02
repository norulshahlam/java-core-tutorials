package com.shah.javacoretutorials.beginner.supers;

import org.junit.jupiter.api.Test;

/*
The super keyword in Java is a reference variable which is used to refer immediate parent class object. 

Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable
*/
class RunMeToo {

    @Test
    void test() {

        D obj = new D();
        obj.printstatement();
    }
}

class C {
    public void printstatement() {
        System.out.println("this is from parent class A");
    }
}
class D extends C {
    public void printstatement() {

        System.out.println("this is from child class B");
        super.printstatement(); // this calls the parent class method
    }
}
