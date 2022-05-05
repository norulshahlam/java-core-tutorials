package com.shah.javacoretutorials.collections.set;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
we will look at the insertion order of the 3 diff implementation of set
All doesnt allow duplicate
*/
class SetInterface1 {

  @Test
  void test() {

    List<Character> c = List.of(
            'S', 'Q', 'Z', 'S', 'Y', 'P', 'A', 'D', 'U');

    // sort by natural order - incremental
    Set<Character> treeset = new TreeSet<>(c);
    System.out.println(treeset);

    // maintains insertion order
    Set<Character> linkedhashset = new LinkedHashSet<>(c);
    System.out.println(linkedhashset);

    // random insertion
    Set<Character> hashset = new HashSet<>(c);
    System.out.println(hashset);
  }
}
