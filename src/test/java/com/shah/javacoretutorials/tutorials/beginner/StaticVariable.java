package com.shah.javacoretutorials.tutorials.beginner;

import com.shah.javacoretutorials.model.Worker;
import org.junit.jupiter.api.Test;

/*
In Java, static variables are also called class variables. That is, they belong to a class and not a particular instance. As a result, class initialization will initialize static variables.

In contrast, a class's instance will initialize the instance variables (non-static variables). All the instances of a class share the class's static variables.

static var means variable is shared / accessible among all objects of the same class. if any object changes that static variable, it will affect another object too.
instance variables are the opposite - has its own copy of variable aka fields/member variables

Static - class level
non-static - object level
 */

class StaticVariable {
    @Test
    void test() {

        Worker a = new Worker(1, "shah", "mike");
        Worker b = new Worker(2, "ahmad", "mike");

        // we have the latest supervisor name
        System.out.println(a);
        System.out.println(b);

        System.out.println("after changing a static variable to CEO");
        Worker c = new Worker(2, "abu", "CEO");

        // now all have new supervisor
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}