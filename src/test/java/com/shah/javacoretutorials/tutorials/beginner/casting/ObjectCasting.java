package com.shah.javacoretutorials.tutorials.beginner.casting;

import org.junit.jupiter.api.Test;

/*
And casting a reference variable doesn’t touch the object it refers to, but only labels this object in another way, expanding or narrowing opportunities to work with it. Upcasting narrows the list of methods and properties available to this object, and downcasting can extend it.

A reference is like a remote control to an object. The remote control has more or fewer buttons depending on its type, and the object itself is stored in a heap. When we do casting, we change the type of the remote control but don’t change the object itself.

https://www.baeldung.com/java-type-casting
*/
class ObjectCasting {
  @Test
  void test() {

    Parent p1 = new Parent(); // allowed
    Child c1 = new Child(); // allowed
    //
    // Child c2 = new Parent(); //not allowed
    Parent p2 = new Child(); // upcasting
    Parent p3 = c1; // upcasting
    p2.method1();

    // Child c3 = p2(); //not allowed for downcasting
    // Child c4 = p1(); //not allowed for downcasting

    Child d4 = (Child) p2; // allowed as reference is base, and object is derived
    // Child d5 = (Child) p1; //java.lang.ClassCastException

    p1.method1();
    // p1.method2(); //not allowed as method2 is from child

    c1.method1(); // ok
    c1.method2();// ok

    p3.method1();// ok
    // p3.method2(); //not allowed as method2 is from child

    d4.method1();// ok
    d4.method2();// ok
  }
}

class Parent {
  public Parent() {
    System.out.println("constructor in base class");
  }

  public void method1() {
    System.out.println("method1 in base class");
  }
}

class Child extends Parent {
  public Child() {
    System.out.println("constructor in derived class");
  }

  public void method2() {
    System.out.println("method2 in derived class");
  }

}