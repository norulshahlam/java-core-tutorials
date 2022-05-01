package com.shah.javacoretutorials.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Year {
    private String name;
    private int age;
    private String place;



    public String toString() {
        // return String.format("place is %d, name is %d, age is %d", place, name, age);
        // //return "place is " +place+ "/" +name+ "/" +age;

        return "" + "\nName is " + name + ", age is " + age + ", Staying in " + place;
    }
}
