package com.shah.javacoretutorials.tutorials.collections.set;

import org.junit.jupiter.api.Test;

import java.util.*;

import static com.shah.javacoretutorials.model.Fruits.fruits2;

/*
HashSet uses a mechanism called "Hashing" to store the elements.
It uses a hashtable data structure to store the elements.
It contains unique elements.
It allows storing the null values.
It is a non-synchronized class.
It does not provide a mechanism to maintain the insertion order. So the elements will be inserted based on the Hashcode.
It is a useful mechanism for the search operation.
By default, it uses 16 as the initial size of the hashtable.
It extends AbstractSet class and implements the Set interface.
It also implements the Cloneable and Serializable interface.
*/

class HashSetVsLinkedHashSetVsTreeSet {

    @Test
    void testHashSet() {
        // random insertion order - elements will be inserted based on Hashcode.
        // allow null
        // no duplicates
        System.out.println("hashSet: ");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);
    }

    @Test
    void testLinkedHashSet() {
        // maintain the insertion order.
        // allow null
        // no duplicates
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Apple");
        linkedHashSet.add(null);
        System.out.println("linkedHashSet: ");
        System.out.println(linkedHashSet);
    }

    @Test
    void testTreeSet() {
        // sorted on insertion.
        // DOESN'T allow null
        // no duplicates
        Set<String> treeSet = new TreeSet<>(fruits2);
        System.out.println("treeSet: ");
        System.out.println(treeSet);
        System.out.println("\n");
    }

    @Test
    void test2() {

        List<Character> c = List.of(
                'S', 'Q', 'Z', 'S', 'Y', 'P', 'A', 'D', 'U');

        // sort by natural order - incremental
        Set<Character> treeSet = new TreeSet<>(c);
        System.out.println("treeSet: " + treeSet);

        // maintains insertion order
        Set<Character> linkedHashSet = new LinkedHashSet<>(c);
        System.out.println("linkedHashSet: " + linkedHashSet);

        // random insertion
        Set<Character> hashSet = new HashSet<>(c);
        System.out.println("hashSet: " + hashSet);
    }
}
