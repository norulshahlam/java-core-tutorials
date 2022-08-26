package com.shah.javacoretutorials.tutorials.collections.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/*
Generics means parameterized types. The idea is to allow type (Integer, String, … etc, and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types.

An entity such as class, interface, or method that operates on a parameterized type is called generic entity.

Why Generics?
Object is the superclass of all other classes and Object reference can refer to any type object. These features lack type safety. Generics adds that type safety feature

Java Generics were introduced in JDK 5.0 with the aim of reducing bugs and adding an extra layer of abstraction over types.
 */
class IntroOne {
    @SuppressWarnings("rawtypes")
    @Test
    void test() {

        ArrayList items = new ArrayList();

        items.add("hi");
        items.add(3);
        items.add("hola");
        // for output all items is fine but,
        System.out.println(items);

        /*
        BUT this gives error cos u need to define a datatype for further use
          for (String s : items)
            System.out.println(s);
         */
    }
}
