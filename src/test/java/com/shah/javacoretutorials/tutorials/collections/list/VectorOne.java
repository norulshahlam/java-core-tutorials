package com.shah.javacoretutorials.tutorials.collections.list;

/*
Vector is very useful if we don't know the size of an array in advance 
or we need one that can change the size over the lifetime of a program.

Vector implements a dynamic array that means it can grow or shrink as required. 
It is similar to the ArrayList, but with two differences-

Vector is synchronized ie it is slow
The vector contains many legacy methods that are not the part of a collections framework 

Difference between Vector and ArrayList in java?
1. All the methods of Vector is synchronized. ArrayList is not synchronized.
2. this means: vector is thread-safe but ArrayList is not
3. but this also means: Vector is slow and ArrayList is fast
4. Vector doubles the size of its array when its size > capacity. ArrayList only inc by half

similarities
1.Vector and ArrayList both uses Array internally as data structure

When to use?
executing a ‘synchronized’ method results in costlier performance 
than a non synchronized method. Keeping the difference in mind,
using Vector will incur a performance hit than the ArrayList. 
But, when there is a certain need for thread-safe operation Vector needs to be used.

we will set a size upon creation of vectors: 3
once size exceed capacity, size will double up.
from 3 to 6 to 12 and so on
 */

import org.junit.jupiter.api.Test;

import java.util.Vector;

class VectorOne {
    @Test
    void test() {

        // create empty vector of capacity 3
        Vector<String> vec = new Vector<>(3);
        System.out.println("size: " + vec.size() + ", capacity: " + vec.capacity());
        vec.add("apple"); // maintain insertion order
        vec.add("egg fruit");
        vec.add("banana");
        vec.add("durian");
        vec.add("carrot");
        System.out.println(vec);
        System.out.println("size: " + vec.size() + ", capacity: " + vec.capacity());
        /*
         * capacity is the available space given to the current array. it will 2X if
         * exceed current capacity. once size exceed initial capacity, it will inc to
         * 100% of the initial capacity ie times 2 from the initial size given by user
         * during creation
         */

        System.out.println("elements: " + vec);

        vec.addElement("fig");
        vec.addElement("grape");
        vec.add(0, "zebra"); // add element to a specific index
        System.out.println("new elements: " + vec);

        System.out.println("new size is: " + vec.size() + ", capacity is: " + vec.capacity());

    }
}