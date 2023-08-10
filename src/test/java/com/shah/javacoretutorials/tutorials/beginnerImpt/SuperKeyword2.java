package com.shah.javacoretutorials.tutorials.beginnerImpt;

import org.junit.jupiter.api.Test;

/*
The super keyword in java is a reference variable that is used to refer parent class objects.
The keyword “super” came into the picture with the concept of Inheritance.

If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.

for this case, if u create an object of child class, the parent class constructor will be called first.
 */
class SuperKeyword2 {
    @SuppressWarnings("unused")
    @Test
    void test() {
    // run this test to see which constructor gets called first
        daughter d = new daughter();
    }

    @Test
    void test2() {
    // run this test to see which constructor gets called first
        daughter d = new daughter(2);
    }
}

class mother {
    public mother() {
        // by default there is super() here
        System.out.println("from mother");
    }

    public mother(int c) {
        // by default there is super() here
        System.out.println("from para mother: " + c);
    }
}

class daughter extends mother {
    public daughter() {
        // by default there is super() here will call to the no-argument constructor of the superclass.
        System.out.println("from daughter");
    }

    public daughter(int d) {
        // by default there is super() here will call to the no-argument constructor of the superclass.
        System.out.println("from para daughter: " + d);
    }
}