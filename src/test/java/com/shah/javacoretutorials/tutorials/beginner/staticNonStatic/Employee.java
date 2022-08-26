package com.shah.javacoretutorials.tutorials.beginner.staticNonStatic;

public class Employee {
    int id;
    String name;
    static String CEO;

    public Employee(int id, String name, String CEO) {
        super();
        this.id = id;
        this.name = name;
        Employee.CEO = CEO;
    }

    public String toString() {
        return "" + id + ", " + name + ", " + CEO;
    }
}
