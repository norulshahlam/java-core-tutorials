package com.shah.javacoretutorials.tutorials.collections.map;

import org.junit.jupiter.api.Test;

import java.util.Map;

/*

The Java Map interface, java.util.Map, represents a mapping between a key and a value. More specifically, a Java Map can store pairs of keys and values. Each key is linked to a specific value. Once stored in a Map, you can later look up the value using just the key.

The Java Map interface IS NOT a subtype of the Collection interface. Therefore it behaves a bit different from the rest of the collection types


Hashmap
- unsorted, unordered
- hashcode is used
- allow null val key

Hashtable
- thread safe version of hashmap
- unsorted, unordered
- hashcode is used
- not allow null val key

LinkedHashMap
- maintain insertion order
- slow insert & del
- faster iteration

TreeMap
- maintain insertion order
- implements navigableMap

example - basic functions of Map

*/

class IntroOne {

    @Test
    void test() {

        Map<String, Integer> m = Map.of(
                "A", 3,
                "C", 1,
                "B", 9);

        // maintain insertion order (by key)
        // all keys & values
        System.out.println(m);
        m.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println(m.get("C"));
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.containsKey("C"));
        System.out.println(m.containsValue(9));
    }
}