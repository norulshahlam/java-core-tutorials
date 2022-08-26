package com.shah.javacoretutorials.tutorials.collections.list;

import org.junit.jupiter.api.Test;

import static com.shah.javacoretutorials.model.Fruits.fruits;
/*
LIST

- Cares about which position each element is in.
- Elements can be added in by specifying position; where it should be added in
- if element is added without specifying position, it is added at the end

*/

class ListOne {

    @Test
    void test() {

       // return element position if contains the string. else -1
        String apple = "Apple";
        System.out.println(apple + " is at index: " + fruits.indexOf(apple));
        System.out.println("Does "+apple + " exists? " + fruits.contains(apple));
        fruits.forEach(System.out::println);
    }

}
