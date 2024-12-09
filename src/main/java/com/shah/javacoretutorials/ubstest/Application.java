package com.shah.javacoretutorials.ubstest;

public class Application {

    public static void main(String[] args) {

        try {
            badMethod();
            System.out.print("A");
        } catch (Exception ex) {
            System.out.print("8");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }
    public static void badMethod() {    }
}
