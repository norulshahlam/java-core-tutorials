package com.shah.javacoretutorials.tutorials.collections.stackAndQueue;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import static com.shah.javacoretutorials.model.Fruits.numbers;
import static org.assertj.core.api.Assertions.assertThat;

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
        Stack<Integer> st = new Stack<>();
        st.addAll(numbers);
        System.out.println(st); // no duplicates
        assertThat(st.peek()).isEqualTo(1);
        assertThat(st.pop()).isEqualTo(1); // remove from top
        st.push(4); // add from top
        assertThat(st.peek()).isEqualTo(4);
        System.out.println(st);
    }

    @Test
    void test2() {
        Queue<Integer> q = new ArrayDeque<>(numbers);
        System.out.println(q.remove());
        System.out.println(q);
    }
}