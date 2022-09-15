package com.shah.javacoretutorials.tutorials.intermediate;

import com.shah.javacoretutorials.model.Author;
import org.junit.jupiter.api.Test;

/*
Explicit means something is done by the programmer
Implicit means that it's done by the compiler.

Explicit – that is passed by specifying the parameter in the parenthesis of a method call
Implicit – that is passed by specifying an object variable (object reference) before the name of a method.

for example:
if you don't explicitly create a constructor for your class the compiler will implicitly provide a default one for you.

Explicit is opposite to this i.e. programmer has to write .
*/
class ExplicitImplicit {

    @Test
    void test() {

        /* when obj is created, jvm implicitly call the constructor at runtime */
        Author d = new Author(33);
        /* when we call the obj ourselves, we are explicitly calling it */
        System.out.println(d.getAge());
    }
}