package com.shah.javacoretutorials.beginner.staticNonStatic;

public class Employee {
    int id;
    String name;
    static String CEO;

    public Employee(int id, String name, String CEO) {
        super();
        this.id = id;
        this.name = name;
        this.CEO = CEO;
    }

    public String toString() {
        return "" + id + ", " + name + ", " + CEO;
    }
}
