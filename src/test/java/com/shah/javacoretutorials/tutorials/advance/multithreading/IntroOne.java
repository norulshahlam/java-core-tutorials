package com.shah.javacoretutorials.tutorials.advance.multithreading;

import org.junit.jupiter.api.RepeatedTest;

import static com.shah.javacoretutorials.tutorials.advance.multithreading.IntroOne.count;

/**
 * diff way to use thread.
 * <p>
 * 1. extend threads
 * 2. implements runnable
 * <p>
 * t / t1 - thread using extends threads
 * i / t2 - threads using implement
 * methods n - not thread
 * <p>
 * run this to see who / show they start off
 */
class IntroOne {

    static int count = 500000;

    @SuppressWarnings({"unused"})
    @RepeatedTest(5)
    void test() throws InterruptedException {
        /* Method 1 */
        MyThreadExtend t1 = new MyThreadExtend();

        /* Method 2 */
        MyThreadImplements t = new MyThreadImplements();
        Thread t2 = new Thread(t);

        t1.start();
        t2.start();

        System.out.print("normal n start\n");
        long start = System.currentTimeMillis();
        for (int i = 1; i < count; i++) {
//            System.out.print("n" + i + " ");
        }
        long timeTaken = System.currentTimeMillis() - start;
        System.out.print("\nnormal n end. Time taken: "
                + timeTaken + " ms\n");
    }
}

class MyThreadExtend extends Thread {
    @Override
    public void run() {
        System.out.print("thread extends t start\n");
        long start = System.currentTimeMillis();

        for (int i = 1; i < count; i++) {
//            System.out.print("t" + i + " ");
        }
        long timeTaken = System.currentTimeMillis() - start;
        System.out.print("\nThread extends t end. Time taken: "
                + timeTaken + " ms\n");
    }
}

class MyThreadImplements implements Runnable {
    @Override
    public void run() {
        System.out.print("thread implement i start\n");
        long start = System.currentTimeMillis();
        for (int i = 1; i < count; i++) {
//            System.out.print("i" + i + " ");
        }
        long timeTaken = System.currentTimeMillis() - start;
        System.out.print("\nthread implement i end Time taken: "
                + timeTaken + " ms\n");
    }
}