package com.shah.javacoretutorials.tutorials.collections.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/*
    IdentityHashMap vs HashMap

    IdentityHashMap uses the equality operator “==” for comparing keys and values while HashMap uses the equals method for comparing keys and values inside Map.

    Since IdentityHashMap doesn’t use equals() its comparatively faster than HashMap for an object with expensive equals().

    IdentityHashMap doesn’t require keys to be immutable as it is not relied on equals().

    Shows that duplication is based on key, not value
 */
class IdentityHashMap {

  @Test
  void test() {

    // this is considered duplicate key
    Map<Integer, String> map1 = new HashMap<>();
    map1.put(Integer.valueOf(2), "shah");
    map1.put(Integer.valueOf(1), "rabika");
    map1.put(Integer.valueOf(1), "cindi");
    map1.put(Integer.valueOf(1), "yayas");
    System.out.println(map1);

    // this is considered duplicate key 
    Map<Integer, String> map2 = new java.util.IdentityHashMap<>();
    map2.put(Integer.valueOf(2), "shah");
    map2.put(Integer.valueOf(2), "rabika");
    map2.put(Integer.valueOf(3), "cindi");
    map2.put(Integer.valueOf(4), "yayas");
    System.out.println(map2);
  }
}
