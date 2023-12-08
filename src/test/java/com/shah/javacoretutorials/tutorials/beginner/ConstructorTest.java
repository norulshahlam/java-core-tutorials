package com.shah.javacoretutorials.tutorials.beginner;
/*
What is constructor???

A constructor in Java is a special method used to initialize objects.
The constructor is called when an object of a class is created.

It can be used to set initial values for object attributes:
1. We show how constructor works
2. What is default constructor and
3. What is parameterized constructor (constructor overloading)
4. Diff types of param cons by number of arguments, args datatype, order of args

https://www.w3schools.com/java/java_constructors.asp#:~:text=A%20constructor%20in%20Java%20is,of%20a%20class%20is%20created.

When do we need ConstructorTest Overloading?

Sometimes there is a need of initializing an object in different ways.
This can be done using constructor overloading.
For example, Thread class has 8 types of constructors.
If we do not want to specify anything about a thread, then we can simply use the default constructor of Thread class

Https://www.geeksforgeeks.org/constructor-overloading-java/

******************************************

A.
This demonstrates that if you create an object with constructor,
it will call the method by default whether it is defaulted or parameterized.

B.
All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you.

C.
Constructors are used to initialize the object’s state.
Constructors are used to assign values to the class variables at the time of object creation,
either explicitly done by the programmer or by Java itself
(default constructor).

D.
However, then you are not able to set initial values for object attributes.

1. constructor has the same name as class name
2. Doesn't return anything (void)
3. ConstructorTest will be called once you create the object
 */

import com.shah.javacoretutorials.model.Vehicle;
import org.junit.jupiter.api.Test;

class ConstructorTest {

    @Test
    void test() {
        /*
         This will call default constructor as no value is assigned upon creation.
         Note that even this is not called; java will call for you.
         So if you define something in the constructor like a print statement, it will print by itself.
         */
        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1);

        // create an object with only parameter 2. note that the 3rd & 4th argument is not defined,
        // so it will b assigned using the default value defined in Vehicle()
        Vehicle vehicle2 = new Vehicle("nissan", "yellow");
        System.out.println(vehicle2);

        // create an object and assign values to 3 parameters
        Vehicle vehicle3 = new Vehicle("nissan", "yellow", "2200");
        System.out.println(vehicle3);

        // create an object and assign values to all 4 parameters
        Vehicle vehicle4 = new Vehicle("Integra", "Red", "2018", "Honda");
        System.out.println(vehicle4);
    }
}


	


