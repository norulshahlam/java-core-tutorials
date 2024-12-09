package com.shah.javacoretutorials.ubstest;

public class Application2 {

    static String str;

    public void Constructor() {
        System.out.println("In constructor");
        str = "Hello World";
    }

    public static void main(String[] args) {
        Application2 c = new Application2();
        System.out.println(str);
    }
}
