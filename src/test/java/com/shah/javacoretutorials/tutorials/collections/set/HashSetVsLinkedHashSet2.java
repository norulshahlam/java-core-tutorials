package com.shah.javacoretutorials.tutorials.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
HashSet uses a mechanism called "Hashing" to store the elements.
It uses a hashtable data structure to store the elements.
It contains unique elements.
It allows storing the null values.
It is a non-synchronized class.
It does not provide a mechanism to maintain the insertion order. So the elements will be inserted based on the Hashcode.
It is a useful mechanism for the search operation.
Bu default, it uses 16 as the initial size of the hashtable.
It extends AbstractSet class and implements the Set interface.
It also implements the Cloneable and Serializable interface.
*/
public class HashSetVsLinkedHashSet2 {
  public static void main(String args[]) {
    // doesnt maintain the insertion order. So the elements will be inserted based
    // on the Hashcode.
    HashSet<String> a = new HashSet<String>();
    a.add("Apple");
    a.add("Cat");
    a.add("Banana");
    a.add("Dog");
    a.add("Elephant");
    a.forEach(i -> System.out.println("HashSet:  " + i));

    // maintain the insertion order.
    LinkedHashSet<String> b = new LinkedHashSet<String>();
    b.add("Apple");
    b.add("Cat");
    b.add("Dog");
    b.add("Banana");
    b.add("Elephant");
    b.forEach(i -> System.out.println("LinkedHashSet:  " + i));
  }
}
