package com.shah.javacoretutorials.tutorials.collections.map;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.*;

/*
Hashmap
- auto sort by key
- hashcode is used
- allow null val key

linkedhashmap
- maintain insertion order
- slow insert & del
- faster iteration

treemap
- auto sort by key
- implements navigableMap

*******************************

Hashtable
- thread safe version of hashmap
- unsorted, unordered
- hashcode is used
- doesn't allow null val & key

example - Difference between HashMap, LinkedHashMap & TreeMap

*/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MapExamples {

    Map<Integer, String> m = Map.of(
            7, "A",
            2, "C",
            1, "C",
            5, "B");

    @Test
    @Order(1)
    void testHashMap() {
        Map<Integer, String> hashMap = new HashMap<>(m);
        System.out.println("\noriginal value: "+m);
        System.out.println("HashMap - auto sort by key:" + hashMap);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsValue("C"));
    }

    @Test
    @Order(2)
    void testLinkedHashMap() {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(m);
        System.out.println("\noriginal value: "+m);
        System.out.println("LinkedHashMap - maintain order of insertion:" + linkedHashMap);
    }

    @Test
    @Order(3)
    void testTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>(m);
        System.out.println("\noriginal value: "+m);
        System.out.println("TreeMap - auto sort by key:" + treeMap);
    }

    @Test
    @Order(4)
    void testIdentityHashMap() {
        /*
        IdentityHashMap vs HashMap

        IdentityHashMap uses the equality operator “==” for comparing keys and values while HashMap uses the equals() method for comparing keys and values inside the Map.

        Since IdentityHashMap doesn’t use equals(), its comparatively faster than HashMap for an object with expensive equals().

        IdentityHashMap doesn’t require keys to be immutable as it doesn't rely on equals().

        Shows that duplication is based on key, not value
         */
        Map<Integer, String> identityHashMap = new IdentityHashMap<>(m);
        System.out.println("\noriginal value: "+m);
        System.out.println("identityHashMap:" + identityHashMap);
    }
}