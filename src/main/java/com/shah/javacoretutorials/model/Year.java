package com.shah.javacoretutorials.model;

public class Year {
    private String name;
    private int age;
    private String place;

    public Year(String m, int y, String d) {
        name = m;
        age = y;
        place = d;
    }

    public String toString() {
        // return String.format("place is %d, name is %d, age is %d", place, name, age);
        // //return "place is " +place+ "/" +name+ "/" +age;

        return "" + "\nName is " + name + ", age is " + age + ", Staying in " + place;
    }
}
