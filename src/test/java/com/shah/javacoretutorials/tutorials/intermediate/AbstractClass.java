package com.shah.javacoretutorials.tutorials.intermediate;

import org.junit.jupiter.api.Test;

/* Abstraction is one of the key concepts of object-oriented programming (OOP) languages. Its main goal is to handle complexity by hiding unnecessary details from the user. An abstract class is a class declared abstract— it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed. An abstract method is a method declared without an implementation (without braces, and followed by a semicolon).

Like this:

	Abstract void moveTo(double deltaX, double deltaY);

If a class includes abstract methods, then the class itself must be declared abstract. Even if one method is abstract, then the class must be declared abstract

A class extends abstract class, but implements interface
 */
abstract class Animal {

    /* Mixture of abstract and concrete method */
    abstract void eat(String name);

    /* if a method is concrete(not abstract) then a body is needed. else error. */
    void gender() {
        System.out.println("male, female");
    }
}

/* A class no need to be declared abstract class if there is not a single abstract method */
class fish extends Animal {

    @Override
    void eat(String name) {
        System.out.println("name of fish food: " + name);
    }
}

class feline extends Animal {

    @Override
    void eat(String name) {
        System.out.println("name of feline food: " + name);
    }
}

class AbstractClass {

    @Test
    void test() {

        // this is upcasting. reference of parent class with an object of child class
        Animal Shark = new fish();
        Animal Cat = new feline();
        Shark.eat("meat");
        Cat.eat("mouse");
    }
}