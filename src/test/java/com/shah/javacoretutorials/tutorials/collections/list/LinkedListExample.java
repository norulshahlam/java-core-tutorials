package com.shah.javacoretutorials.tutorials.collections.list;
/*
ArrayList 
1) ArrayList internally uses a dynamic array to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory.
3) An ArrayList class can act as a list only because it implements List only.
4) ArrayList is better for storing and accessing data.

LinkedList
1. LinkedList internally uses a doubly linked list to store the elements.
2. Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
3. LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4. LinkedList is better for manipulating data.

https://www.javatpoint.com/difference-between-arraylist-and-linkedlist

However, they have something in common:
1. non-synchronization 
2. maintains insertion order in java - first added on first index
3. Allows null
4. allows to store null in java.
5. Implements java.util.List

https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java

*/

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class LinkedListExample {

    @SuppressWarnings("unused")
    @Test
    void test() {

        LinkedList<String> val = new LinkedList<>();

        val.add("hello");
        val.add("world");
        val.add("my");
        val.add("name");
        val.add(null);
        val.add("shah");
        val.add("shah");
        System.out.println(val + "\n");
        // above element will be added by first come first insert. however, u can insert
        // in between elements:

        val.add(1, "universe");
        System.out.println("after added in between\n" + val + "\n");

        // remove using index
        val.remove(0);

        // removes the first element
        Object o = val.pop();
        // remove using value. if element has duplicate, it deletes the first one
        val.remove("shah");
        System.out.println("after deletion: \n" + val);

        // check the size of the array
        int size = val.size();
        System.out.println("\nsize is: \n" + size);

        // search for element by using index
        String element = val.get(2);
        System.out.println("object at index 2 is: " + element);

        // replace existing element using index
        val.set(4, "was");

        val.add("last added");
        val.add("last added");
        val.add("last added");
        for (int i = 0; i < val.size(); i++) {
            System.out.println(i + ": " + val.get(i));
        }
    }
}
