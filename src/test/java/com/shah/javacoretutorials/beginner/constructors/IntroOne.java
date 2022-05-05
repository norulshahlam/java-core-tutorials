package com.shah.javacoretutorials.beginner.constructors;
/*
What is constructor???

A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. 

It can be used to set initial values for object attributes:
1. we show how constructor works
2. what is default constructor and 
3. what is parameterized constructor (constructor overloading)
4. diff types of param cons by number of arguments, args datatypes, order of args

https://www.w3schools.com/java/java_constructors.asp#:~:text=A%20constructor%20in%20Java%20is,of%20a%20class%20is%20created.

When do we need Constructor Overloading?

Sometimes there is a need of initializing an object in different ways. This can be done using constructor overloading. For example, Thread class has 8 types of constructors. If we do not want to specify anything about a thread then we can simply use default constructor of Thread class

https://www.geeksforgeeks.org/constructor-overloading-java/

******************************************

a) this demonstrates that if you create object with constructor, it will call the method by default whether it is default or parameterized.

b) All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. 

c) Constructors are used to initialize the object’s state. constructors are used to assign values to the class variables at the time of object creation, either explicitly done by the programmer or by Java itself (default constructor).

d) However, then you are not able to set initial values for object attributes.

1. constructor has same name as class name
2. dont return anything (void)
3. constructor will be called once you create the object
 */

import com.shah.javacoretutorials.model.Vehicle;
import org.junit.jupiter.api.Test;

class IntroOne {

    @Test
    void test() {
        //this will call default constructor as no value is assigned upon creation
        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1);

        // from (a), note that even this is not called, java will call for you. so if u define something in the constructor like print statement, it will print by itself
        // System.out.println(vehicle1);

        //create an object and assign values to all 4 parameters
        Vehicle vehicle2 = new Vehicle("Integra", "Red", "2018", "Honda");
        System.out.println(vehicle2);

        //create an object with only 2 parameter. note that the 3rd & 4th argument is not defined so it will b assigned using default value defined in Vehicle()
        Vehicle vehicle3 = new Vehicle("nissan", "yellow");
        System.out.println(vehicle3);
    }
}


	


