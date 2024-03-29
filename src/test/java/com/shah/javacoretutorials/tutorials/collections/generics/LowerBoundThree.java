package com.shah.javacoretutorials.tutorials.collections.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/*
Lower Bounded Wildcards

The Upper Bounded Wildcards section shows that an upper-bounded wildcard restricts the unknown type to be a specific type or a subtype of that type and is represented using the "extends" keyword.

In a similar way, a lower-bounded wildcard restricts the unknown type to be a specific type or a super type of that type.

https://docs.oracle.com/javase/tutorial/java/generics/lowerBounded.html

*/
class LowerBoundThree {
    
    @SuppressWarnings("unused")
    @Test
    void test() {

        // create list according to classes
        List<Animal> animalList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        List<RedCat> redCatList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        // can add a list of superclass Animal of Cat class
        addCat(animalList);

        // can add a list of Cat class
        addCat(catList);

        // compile time error - cannot add a list of subclass RedCat of Cat class
        // addCat(redCatList);

        // compile time error - cannot add a list of subclass Dog of Superclass Animal of Cat class
        // addCat.addMethod(dogList);
    }

    // this means any classes and its super class can be used
    public static void addCat(List<? super Cat> catList) {
        catList.add(new RedCat());
        System.out.println("Cat Added");
    }
}

class Animal {
}

class Cat extends Animal {
}

class RedCat extends Cat {
}

class Dog extends Animal {
}