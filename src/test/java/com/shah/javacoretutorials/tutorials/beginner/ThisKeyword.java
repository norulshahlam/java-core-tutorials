package com.shah.javacoretutorials.tutorials.beginner;

import org.junit.jupiter.api.Test;

/*
this example shows the usage of 'this' keyword. When a local var has the same name as instance var, the local var hides / replaces the instance var

'this' lets you refer directly to the instance var 
‘this’ is a reference variable that refers to the local object.
*/

class VariableHiding {

    @Test
    void test() {
        AA A = new AA();
        // this method doesnt use 'this' so it uses the local variable, inside the method
        A.display();
    }
    @Test
    void test2() {
        BB B = new BB();
        // this method uses 'this' so it uses the global variable declared in the class itself
        B.display();
    }
}

class AA {
    String i = "global";

    public void display() {
        String i = "local";
        System.out.println(i);
    }
}

@SuppressWarnings("unused")
class BB {
    String i = "global";

    public void display() {
        String i = "local";
        System.out.println(this.i);
    }
}
