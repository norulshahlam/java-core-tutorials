package com.shah.javacoretutorials.intermediate.abstraction;

/* An abstract class is a class that is declared abstract— it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed. An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon), 

like this: 

	abstract void moveTo(double deltaX, double deltaY); 
	
If a class includes abstract methods, then the class itself must be declared abstract,
a class extends abstract class, but implements interface    

Abstraction is one of the key concepts of object-oriented programming (OOP) languages. Its main goal is to handle complexity by hiding unnecessary details from the user
 */

import org.junit.jupiter.api.Test;

// even if one method is abstract, then the class must be declared abstract
abstract class animal {
    abstract void eat(String name);

    // if a method is concrete(not abstract) then a body is needed. else error.
    void gender() {
        System.out.println("male, female");
    }
}

//a class no need to be declared abstract class if there is not a single abstract method
class fish extends animal {

    @Override
    void eat(String name) {
        System.out.println("name of fish food: " + name);
    }
}

class feline extends animal {

    @Override
    void eat(String name) {
        System.out.println("name of feline food: " + name);
    }
}

class RunMe {

    @Test
    void test() {

        // this is upcasting. reference of parent class with object of child class
        animal shark = new fish();
        animal cat = new feline();
        shark.eat("meat");
        cat.eat("mouse");
    }
}