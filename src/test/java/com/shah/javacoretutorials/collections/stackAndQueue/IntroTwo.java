package com.shah.javacoretutorials.collections.stackAndQueue;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static com.shah.javacoretutorials.model.Fruits.fruits;

class IntroTwo {

  @Test
  void test() {

    Queue<String> q = new PriorityQueue<>();

    /* return while removes the head of this queue, or returns null if this queue
     is empty. */
    System.out.println(q.poll());

    q.addAll(fruits);
    System.out.println(q.poll());
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q);

  }
}
