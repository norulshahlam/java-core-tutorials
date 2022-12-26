package com.shah.javacoretutorials.tutorials.collections.map;

import org.junit.jupiter.api.Test;

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
- not allow null val key

example - Difference between HashMap, LinkedHashMap & TreeMap

*/

class MapExamples {

    Map<Integer, String> m = Map.of(
            7, "A",
            2, "C",
            1, "C",
            5, "B");

    @Test
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
    void testLinkedHashMap() {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(m);
        System.out.println("\noriginal value: "+m);
        System.out.println("LinkedHashMap - maintain order of insertion:" + linkedHashMap);
    }

    @Test
    void testTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>(m);
        System.out.println("\noriginal value: "+m);
        System.out.println("TreeMap - auto sort by key:" + treeMap);
    }

    @Test
    void testIdentityHashMap() {
        /*
        IdentityHashMap vs HashMap

        IdentityHashMap uses the equality operator “==” for comparing keys and values while HashMap uses the equals method for comparing keys and values inside Map.

        Since IdentityHashMap doesn’t use equals() its comparatively faster than HashMap for an object with expensive equals().

        IdentityHashMap doesn’t require keys to be immutable as it is not relied on equals().

        Shows that duplication is based on key, not value
         */
        Map<Integer, String> identityHashMap = new IdentityHashMap<>(m);
        System.out.println("\noriginal value: "+m);
        System.out.println("identityHashMap:" + identityHashMap);
    }
}