package com.shah.javacoretutorials.Intermediate.annotations;
/* 
Introduced in java 1.5


What is @Annotations?

Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.

Annotations in Java are used to provide additional information, so it is an alternative option for XML and Java marker interfaces.  Java defines seven built-in annotations.

There are 3 categories of Annotations:-

1. Marker Annotations:
The only purpose is to mark a declaration. These annotations contain no members and do not consist any data.
Thus, its presence as an annotation is sufficient. Since, marker interface contains no members,
simply determining whether it is present or absent is sufficient. @Override is an example of Marker Annotation.
Example: - @TestAnnotation()

2. Single value Annotations:
These annotations contain only one member and allow a shorthand form of specifying the value of the member.
We only need to specify the value for that member when the annotation is applied and don’t need to
specify the name of the member. However in order to use this shorthand, the name of the member must be value.
Example: - @TestAnnotation(“testing”);

3. Full Annotations:
These annotations consist of multiple data members/ name, value, pairs.
Example:- @TestAnnotation(owner=”Rahul”, value=”Class Geeks”)


Four are imported from java.lang.annotation: @Retention, @Documented, @Target, and @Inherited.
Three are included in java.lang: @Deprecated, @Override and @SuppressWarnings

@Override annotation assures that the subclass method is overriding the parent class method. If it is not so, compile time error occurs. Sometimes, we does the silly mistake such as spelling mistakes etc. 
So, it is better to mark @Override annotation that provides assurity that method is overridden.
 */

import org.junit.jupiter.api.Test;

class animal {
    void checkClass() {
        System.out.println("from animal");
    }
}

class dog extends animal {

/*
  we intend to override parent method but bcos of typo, (CheckClass, not checkClass)
  this has become a new method. By @override, compiler will show that this method is not found in parent class
*/

    void CheckClass() {
        System.out.println("from dog");
    }
}

class RunMe {

    @Test
    void test() {

        dog d = new dog();
        //this method is supposed to print from child class, not parent.
        d.checkClass();
    }

}
