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

class CompareThreeMap {

    @Test
    void test() {

        // create collections
        HashMap<String, Integer> hm = new HashMap<>();
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        TreeMap<String, Integer> tm = new TreeMap<>();

        // add some data
        generate(hm, lhm, tm);

        // check the data inserted
        System.out.println("\nHashMap - auto sort by key \n" + hm);
        System.out.println("\nLinkedHashMap - maintain order of insertion \n" + lhm);
        System.out.println("\nTreeMap - auto sort by key \n" + tm);

    }

    @SuppressWarnings("unused")
    private synchronized static void generate(Map<String, Integer> hm, Map<String, Integer> lhm, Map<String, Integer> tm) {
        Random r = new Random();

        int loops = 30;
        System.out.print("\nActual order: \n");

        for (int i = 0; i < loops; i++) {
            char c = (char) (r.nextInt(26) + 'A');
            char b = (char) (r.nextInt(26) + 'A');
            String e = Character.toString(b);
            int d = r.nextInt(loops);

            hm.put(e, d);
            lhm.put(e, d);
            tm.put(e, d);
            System.out.print(e + "=" + d + ", ");
        }
    }

}