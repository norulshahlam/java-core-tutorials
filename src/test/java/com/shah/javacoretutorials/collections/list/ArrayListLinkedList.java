package com.shah.javacoretutorials.collections.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import static com.shah.javacoretutorials.model.Fruits.fruits;

class ArrayListLinkedList {
  @SuppressWarnings("unused")

  @Test
  void test() {

    List<String> arrayList1 = new ArrayList<>(fruits);
    List<String> linkedList1 = new LinkedList<>(fruits);
    List<String> vector1 = new Vector<>(fruits);

  }
}
