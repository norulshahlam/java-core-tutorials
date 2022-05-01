package com.shah.javacoretutorials.Intermediate.innerClass;

import org.junit.jupiter.api.Test;

/*
A static inner class is a nested class which is a static member of the outer class. It can be accessed without instantiating the outer class, using other static members. Just like static members, a static nested class does not have access to the instance variables and methods of the outer class.
*/
class IntroThree {
    @SuppressWarnings("unused")
    @Test
    void test() {

        C c = new C();
        C.D d = new C.D(); // create an object of nested class. bcos D is a static member, you dont need to use obj of C
        d.show();
    }
}

class C {
    int rollno;
    String sname;

    static class D {
        public void show() {
            System.out.println("helo");
        }
    }
}
