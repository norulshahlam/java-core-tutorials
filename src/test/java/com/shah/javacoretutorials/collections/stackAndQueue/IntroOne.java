package com.shah.javacoretutorials.collections.stackAndQueue;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/*
Key Differences Between Stack and Queue

Stack 
follows LIFO mechanism to add and remove elements.
same end is used to insert and delete the elements. 
have only one open end that is the reason for using only one pointer to refer to the top of the stack. 
performs two operations known as push and pop 
easier implementation
stack does not have variants.
 

Queue 
follows FIFO mechanism to add and remove elements.
two different ends are used to insert and delete the elements - pop at front, push at back
uses two pointers to refer front and the rear end of the queue.
enqueue and dequeue.
implementation is tricky.
has variants like circular queue, priority queue, doubly ended queue
 */
class IntroOne {
    @Test
    void test() {

        Stack<Integer> st = new Stack<Integer>();
        st.add(4);
        st.add(9);
        st.add(2);
        st.add(1);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);

        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(4);
        q.add(9);
        q.add(2);
        q.add(1);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);

    }
}