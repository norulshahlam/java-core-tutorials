package com.shah.javacoretutorials.tutorials.beginner;

/*

Previously we know that two objects having the same value gives hashcode because it is created as diff obj. How do we make it such that they give the same hashcode? since both objects have the same value.

By overriding the equals() method!

Further reading:
https://stackoverflow.com/questions/59652963/why-hashcode-of-two-objects-having-same-value-are-different-in-java
*/

import com.shah.javacoretutorials.model.House;
import org.junit.jupiter.api.Test;

class HashCode4 {
    // Both have the same value, but obj reference is diff, so naturally it will give different hashcode.
    // But by overriding the equals() method, we can make sure that both objects have the same hashcode.
    House h1 = new House("condo");
    House h2 = new House("condo");

    @Test
    void hashCodeValue() {
        System.out.println(h1.equals(h2));
        System.out.println("h1.hashCode(): " + h1.hashCode());
        System.out.println("h1.hashCode(): " + h2.hashCode());
    }
}
