package com.shah.javacoretutorials.tutorials.advance.multithreading;

import org.junit.jupiter.api.Test;

/*
https://www.udemy.com/course/java-programming-tutorial-for-beginners/learn/lecture/9565840#content

THREAD PRIORITY

we can set the priority level of the thread: max - 10, min -1, normal -5
we set t1 to max priority and see the result

it is just a request, it might be honored or might not be, but most time it will be honored.

THREAD JOIN

The join() method allows one thread to wait for the completion of another.
here t1 t2 t3 must finish first then will print out

 */
class ThreadStates2 {

    @Test
    void test() throws InterruptedException {
        System.out.println("***********************");

        MyThreadExtend t1 = new MyThreadExtend();
        MyThreadExtend t2 = new MyThreadExtend();
        MyThreadImplements t = new MyThreadImplements();

        t1.setPriority(10);
        t2.setPriority(1);

        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads completed");
    }
}
