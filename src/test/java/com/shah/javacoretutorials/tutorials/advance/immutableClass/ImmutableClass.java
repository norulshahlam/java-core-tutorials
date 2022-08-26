package com.shah.javacoretutorials.tutorials.advance.immutableClass;
/*
How to create Immutable class in Java?

Immutable class means that once an object is created, we cannot change its content. In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable. We can create our own immutable class as well. 

--The class is called immutable if it is impossible to change its state and content after the initialization (creation).

-- The benefits of such classes are:
safety: you, as a developer, can be sure that no one is able to change their state;

-- thread-safety: the same as mentioned above is also actual for the multithreaded environment;

-- cacheable: instances could be easily cached by VM cache or custom implementation, as we are 100% sure, that their values are not going to be changed;

-- hashable: such classes could be safely put inside the hash collections (like HashMap, HashSet etc) - of course, if equals() & hashCode() methods are overridden in a proper way.
 *****************************************************
Following are the requirements: 

a) The class must be declared as final (So that child classes can’t be created)

b) Data members in the class must be declared as private (So that direct access is not allowed)

c) Data members in the class must be declared as final (So that we can’t change the value of it after object creation)

d) A parametrized constructor should initialize all the fields performing a deep copy (So that data members can’t be modified with object reference)

e) Deep Copy of objects should be performed in the getter methods (To return a copy rather than returning the actual object reference)

f) No setters (To not have the option to change the value of the instance variable)

in short,
a) make class as final
b, c )make variables as private & final
d) parametrized constructor
e) Deep Copy of objects
f)no setter method

https://www.youtube.com/watch?v=85lrlPrvrAw&t=315s&ab_channel=CodingSimplified
*/

//how to insert this obj into the final class while behaving as one
class Engine {
    int speed;
    public Engine(int speed) {
        this.speed = speed;
    }
}

// a) make class as final
final class ImmutableClass {

    public static void main(String[] args) {
        Engine e = new Engine(50);
        ImmutableClass a = new ImmutableClass(1, "shah", e);

        // a.id=34;   // error - u cant change once initialize
        System.out.println(a.getName());
        System.out.println(a.engine.speed);
    }
    // b, c ) make variables as private & final
    private final int id;
    private final String name;
    private final Engine engine;

    // d) parametrized constructor
    public ImmutableClass(int id, String name, Engine e) {
        this.id = id;
        this.name = name;
        // e) deep copy
        Engine engine = new Engine(e.speed);
        this.engine = engine;
    }

    // f) no setter
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
}
