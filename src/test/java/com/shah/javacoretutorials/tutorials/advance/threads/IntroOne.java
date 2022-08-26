package com.shah.javacoretutorials.tutorials.advance.threads;

import org.junit.jupiter.api.Test;

import static com.shah.javacoretutorials.tutorials.advance.threads.IntroOne.count;

/**
 * diff way to use thread.

 * 1. extend threads
 * 2. implements runnable

 * t / t1 - thread using extends threads
 * i / t2 - threads using implement
 * methods n - not thread

 * run this to see who / show they start off
 */
class IntroOne {

    static int count = 50;

    @SuppressWarnings({"unused"})
    @Test
    void test() {
        /* Method 1 */
        ThreadExtends t1 = new ThreadExtends();

        /* Method 2 */
        ThreadImplements t = new ThreadImplements();
        Thread t2 = new Thread(t);

        t1.start();
        t2.start();

        System.out.print("normal n start\n");
        long start = System.currentTimeMillis();
        for (int i = 1; i < count; i++) {
            System.out.print("n" + i + " ");
        }
        long timeTaken = System.currentTimeMillis() - start;
        System.out.print("\nnormal n end. Time taken: "
                + timeTaken + " ms\n");
    }
}

class ThreadExtends extends Thread {

    public void run() {
        System.out.print("thread extends t start\n");
        long start = System.currentTimeMillis();

        for (int i = 1; i < count; i++) {
            System.out.print("t" + i + " ");
        }
        long timeTaken = System.currentTimeMillis() - start;
        System.out.print("\nThread extends t end. Time taken: "
                + timeTaken + " ms\n");
    }
}

class ThreadImplements implements Runnable {

    public void run() {
        System.out.print("thread implement i start\n");
        long start = System.currentTimeMillis();
        for (int i = 1; i < count; i++) {
            System.out.print("i" + i + " ");
        }
        long timeTaken = System.currentTimeMillis() - start;
        System.out.print("\nthread implement i end Time taken: "
                + timeTaken + " ms\n");
    }
}