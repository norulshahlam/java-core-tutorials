package com.shah.javacoretutorials.collections.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Random;

/*
Hashmap
- unsorted, unordered
- hashcode is used
- allow null val key

Hashtable
- thread safe version of hashmap
- unsorted, unordered
- hashcode is used
- not allow null val key

linkedhashmap
- maintain insertion order
- slow insert & del
- faster iteration

treemap
- maintain insertion order
- implements navigableMap

example - basic functions of HashMap

*/

class HashMapOne {

  @Test
  void test() {

    HashMap<Character, Integer> hm = new HashMap<>();

    generate(hm);
    System.out.println(hm.size());
    System.out.println(hm);
  }

  private static void generate(HashMap<Character, Integer> hm) {
    Random r = new Random();

    for (int i = 0; i < 100; i++) {
      char c = (char) (r.nextInt(26) + 'A');
      int d = r.nextInt(100);

      hm.put(c, d);
    }
  }
}