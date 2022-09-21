package com.shah.javacoretutorials.tutorials.advance.multithreading;

import org.junit.jupiter.api.Test;

class ThreadWaitNotify {
    @Test
    void test() {
        SharedObject obj = new SharedObject();

        Thread thread1 = new Thread(() -> obj.printMessage());
        Thread thread2 = new Thread(() -> obj.setMessage("A message from thread1"));

        thread1.start();
        thread2.start();
    }

    static class SharedObject {
        private String message;

        public synchronized void setMessage(String message) {
            this.message = message;
            notify();
        }

        public synchronized void printMessage() {
            while (message == null) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(message);

        }
    }
}

