package com.shah.javacoretutorials.collections;

import org.junit.jupiter.api.Test;

import java.util.*;

/*
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

https://www.javatpoint.com/collections-in-java#:~:text=The%20Collection%20in%20Java%20is,a%20single%20unit%20of%20objects.

List interface - Allows duplicate
-------------------
ArrayList class 
  - dynamic array to store
  - maintain insertion order
  - non synchronised
LinkedList class
  - doubly linked list internally to store
  - maintain insertion order
  - non synchronised
Vector class
  - dynamic array to store
  - maintain insertion order
  - SYNCHRONISED
Stack class
  - sub-class of vector
  - last-in-first-out data structure

Queue Interface
--------------------------
PriorityQueue
  - first-in-first-out order
  - doesn't allow null values
ArrayDeque
  - first-in-first-out order
  - ordered list


Dequeue Interface
  - Deque stands for a double-ended queue 
  - remove and add the elements from both the side. 
  --------------------------
ArrayDeque 
  - faster than ArrayList and Stack

Set Interface
  - unordered set of elements
  - only unique values
  - store at most one null value 
  - non-synchronised

-----------------------
HashSet         unordered, less memory, more performance
LinkedHashSet   ordered, more memory, less performance
Hashtable       thread safe, doesn’t allow any null key or value
HashMap         not-thread safe, allows one null key and multiple null values

Hashtable - stores data using hashing algorithm

https://www.udemy.com/course/java-programming-tutorial-for-beginners/learn/lecture/9565748#content

Tree - stores data using Tree algorithm

https://www.udemy.com/course/java-programming-tutorial-for-beginners/learn/lecture/9565750#content



SortedSet Interface
----------------------------
  - total ordering on its elements
  - arranged in the increasing (ascending) order

TreeSet
  -  fast access and retrieval time


*/
class IntroToCollections {
    @SuppressWarnings("unused")
    @Test
    void test() {

        /*
         * List Interface
         * 1. store the ordered collection of objects.
         * 2. It can have duplicate values.
         */
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        List<Integer> list3 = new Vector<Integer>();
        List<Integer> list4 = new Stack<Integer>();

        /*
         Queue Interface
         1. maintains the first-in-first-out order.
         2. ordered list
         */

        Queue<String> q1 = new PriorityQueue<String>();
        Queue<String> q2 = new ArrayDeque<String>();

        /*
         Deque Interface
         1. Remove and add the elements from both the side.
         2. "double-ended queue" - enables to perform the operations at both the ends.
         */

        Deque<String> d = new ArrayDeque<String>();

        /*
         Set Interface
         1. unordered set of elements
         2. no duplicate items.
         3. store at most one null value
         */

        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new LinkedHashSet<Integer>();
        Set<Integer> s3 = new TreeSet<Integer>();

        /*
            SortedSet Interface
         1. alternate of Set interface
         2. provides a total ordering on its elements.
         3. arranged in the increasing (ascending) order.
         4. has additional methods that inhibit the natural ordering of the elements.
         */
        SortedSet<Integer> set = new TreeSet<Integer>();

    }
}
