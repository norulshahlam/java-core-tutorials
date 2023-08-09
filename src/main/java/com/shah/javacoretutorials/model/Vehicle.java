package com.shah.javacoretutorials.model;
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
2. don't return anything (void)
3. constructor will be called once you create the object
 */

import lombok.Data;

@Data
public class Vehicle {
    //if we create an object without assigning a value then it will use default value (here)
    private String name = "defaultName";
    private String color = "defaultColor";
    private String model = "defaultModel";
    private String company = "defaultCompany";

    //empty constructor. constructor name should be same as class name. else this will be a function. if this constructor is called, it will run by itself.
    public Vehicle() {
        System.out.println("from empty constructor");
    }

    //parameterized constructor (constructor overloading)
    public Vehicle(String name, String color, String model, String company) {
        //"this.color" is from the class vehicle. while the latter "color" refers to the one in the parameter. 'this' is used to avoid confusion when using same variable names.
        this.getName(); //same as below
        this.color = color;
        this.model = model;
        this.company = company;

        System.out.println("from constructor with 4 param");
    }


    //parameterized constructor (constructor overloading)
    public Vehicle(String name, String color, String model) {
        super();
        this.name = name;
        this.color = color;
        this.model = model;

        System.out.println("from constructor with 3 param");
    }

    //parameterized constructor (constructor overloading)
    public Vehicle(String name, String color) {
        super();
        this.name = name;
        this.color = color;

        System.out.println("from constructor with 2 param");
    }

}

