package com.shah.javacoretutorials.tutorials.collections.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/*
Generics means parameterized types. The idea is to allow type (Integer, String, … etc, and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types.

An entity such as class, interface, or method that operates on a parameterized type is called generic entity.

Why Generics?
Object is the superclass of all other classes and Object reference can refer to any type object. These features lack type safety. Generics add that type safety feature

Java Generics were introduced in JDK 5.0 with the aim of reducing bugs and adding an extra layer of abstraction over types.

here we have:
 a method with a generic parameter.
 a class with a generic parameter.
this way, you can insert any value type, not restricted to 1 datatype
*/
class GenericParameter {
    @Test
    void test() {
        // generics with methods
        System.out.println(showMe(4));
        System.out.println(showMe("dhhrshr"));
        System.out.println(showMe('W'));
        System.out.println(showMe(false));

        // generics with collection
        CustomListType<String> s = new CustomListType<>();
        s.add("hello");
        s.add("world");
        System.out.println(s);

        CustomListType<Integer> i = new CustomListType<>();
        i.add(44);
        i.add(794);
        System.out.println(i);

    }

    // generics with methods
    static <T> T showMe(T value) {
        return value;
    }
}

// generics with collection
class CustomListType<T> {
    ArrayList<T> list = new ArrayList<T>();

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    @Override
    public String toString() {
        return list.toString();
    }

}