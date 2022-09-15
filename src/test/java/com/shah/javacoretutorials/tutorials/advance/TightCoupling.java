package com.shah.javacoretutorials.tutorials.advance;

import org.junit.jupiter.api.Test;

import java.util.*;

import static java.lang.Math.round;

/*
Tightly coupled object is an object that needs to know quite a bit about other objects and are usually highly dependent on each other's interfaces. Changing one object in a tightly coupled application often requires changes to a number of other objects. In a small application we can easily identify the changes and there is less chance to miss anything. But in large applications these interdependencies are not always known by every programmer and there is chance of overlooking changes.
 */
class TightCoupling {

    @Test
    void test() {

        Journey j = new Journey();
        // 3. and change here too
        j.startJourney();
    }

    @Test
    void test2() {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(3);
        set.add((int) 3.0);
        set.add(2);
        set.add(2);
        set.add(new Integer(2));
        set.add(Integer.parseInt("2"));
        System.out.println(set);
    }
    @Test
    void test3() {
        Set set = new TreeSet();
        set.add(1);
        set.add("2");
        set.add(3);
        System.out.println(set);
    }
    @Test
    void test4() {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<String>();
        stack.push("Apple");

        stack.push("Banana");

        stack.push("Cherry");

        ((LinkedList<String>) queue).add(stack.pop());
        stack.push("Dingleberry");
        stack.push("Eggplant");

        ((LinkedList<String>) queue).add("Fig");
        stack.push(queue.remove());
        ((LinkedList<String>) queue).add(stack.pop());
        ((LinkedList<String>) queue).add(stack.pop());

        System.out.println(stack);
        System.out.println(queue);
    }
    @Test
    void test5() {
        float d[] = {1,2,3};
//        int x[] = int[10];
        System.out.println(round(22.9));
    }

    @Test
    void test6() {
        int x,y,z;
        x=9; y=10;
        z=++x+y++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

}

class Journey {
    Car car = new Car();

    public void startJourney() {
        //2. then you have to change the startJourney() method to call journey() method instead of calling travel() method.
        car.travel();
    }
}

class Car {
    //1. For example if Car class travel() method name change to journey(),
    public void travel() {
        System.out.println("Travel by Car");
    }
}


/*
Journey class depends on Car class to provide service to the end user (main class to call this Journey class). Journey class is tightly coupled with Car class - if any change in the Car class, it requires Journey class to change. 

For example if Car class travel() method change to journey() method then you have to change the startJourney() method to call journey() method instead of calling travel() method.
 */