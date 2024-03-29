package com.shah.javacoretutorials.tutorials.advance.multithreading;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

/*
How to implement thread using:
1. Structured approach
2. Functional approach
3. Stream approach

You can see that we can get rid of all the boilerplate's to create a runnable
interface, defining a method, and all that stuff. All that we need to do is,
to create runnable is equal to, define a simple lambda expression.
What would happen is, this would create an implementation of the runnable interface. Why is it creating the implementation of the runnable interface?

Because runnable is also a functional interface, there is just one abstract method that is present in here: run()
*/
class HowToImplementRunnable {

    @SuppressWarnings("unused")
    @Test
    void test() {

        int count = 5000;
        /* 1. Structured approach */
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < count; i++) {
                    System.out.print("Structured approach - Thread ID: " + Thread.currentThread().getId() + " : " + i + "\n");
                }
            }
        };
        Thread t1 = new Thread(r1);

        /* 2. functional approach */
        Runnable r2 = () -> {
            for (int i = 0; i < count; i++) {
                System.out.print("Functional approach - Thread ID: " + Thread.currentThread().getId() + " : " + i + "\n");
            }
        };
        Thread t2 = new Thread(r2);

        /* 3. Stream approach */
        Runnable r3 = () -> IntStream
                .range(0, count)
                .forEach(i -> System.out.println("Stream approach - Thread ID: " + Thread.currentThread().getId() + ":" + i));

        Thread t3 = new Thread(r3);
        t3.start();
        t2.start();
        t1.start();
    }
}
