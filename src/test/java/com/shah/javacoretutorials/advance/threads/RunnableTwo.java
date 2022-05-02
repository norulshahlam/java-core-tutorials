package com.shah.javacoretutorials.advance.threads;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

/*
How to implement thread using:
1. structured approach
2. functional approach
3. Stream approach

You can see that we can get rid of all the boilerplates to create a runnable
interface, defining a method, and all that stuff. All that we need to do is,
to create runnable is equal to, just define a simple lambda expression.
What would happen is, this would create a implementation of the runnable interface. Why is it creating the implementation of the runnable interface?

Because runnable is also a functional interface, there is just one abstract method
which is present in here: run()
*/
class RunnableTwo {


    @SuppressWarnings("unused")
    @Test
    void test() {

        int count = 5000;
        /* 1. Structured approach */
        Runnable r = new Runnable() {

            @Override
            public void run() {

                for (int i = 0; i < count; i++) {
                    System.out.print("Structured approach - " + Thread.currentThread().getId() + " : " + i + "\n");
                }
            }
        };
        Thread t1 = new Thread(r);

        /* 2. functional approach */
        Runnable r2 = () -> {

            for (int i = 0; i < count; i++) {
                System.out.print("Functional approach - " + Thread.currentThread().getId() + " : " + i + "\n");
            }
        };
        Thread t4 = new Thread(r2);

        /* 3. Stream approach */
        Runnable r3 = () -> IntStream
            .range(0, count)
            .forEach(i -> System.out.println("Stream approach - " + Thread.currentThread().getId() + ":" + i));


        Thread t7 = new Thread(r3);
        t7.start();
        t4.start();
        t1.start();

    }
}
