package com.shah.javacoretutorials.collections.list;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Vector;

/*
Show default size and capacity of LinkedList & Vector
 */
class ArrayListVector {

    @Test
    void test() {

        // create
        Vector<String> vec = new Vector<>();
        LinkedList<String> linked = new LinkedList<>();

        // 1st check
        System.out.println("default vec size: " + vec.size() + " , default capacity: " + vec.capacity());
        System.out.println("default linked size: " + linked.size() + ", default capacity: no capacity");

        // add
        for (int i = 0; i < 100; i++) {
            vec.add(createRandomWord(200));
            linked.add(createRandomWord(200));
        }

        // 2nd check
        System.out.println("vec size: " + vec.size() + ", capacity: " + vec.capacity());
        System.out.println("linked size: " + linked.size() + ", capacity: no capacity");

        // access time for vector
        long time1 = System.nanoTime();
        vec.forEach(i -> System.out.println());
        long vecTime = System.nanoTime() - time1;

        // access time for linked
        long time3 = System.nanoTime();
        linked.forEach(i -> System.out.println());
        long linkedTime = System.nanoTime() - time3;

        // time taken results
        System.out.println(vecTime + " <-- vector ");
        System.out.println(linkedTime + " <-- linked list ");

        System.out.println(11);
    }

    public static String createRandomWord(int len) {
        String name = "";
        for (int i = 0; i < len; i++) {
            int v = 1 + (int) (Math.random() * 26);
            char c = (char) (v + (i == 0 ? 'A' : 'a') - 1);
            name += c;
        }
        return name;
    }
}
