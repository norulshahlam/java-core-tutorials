package com.shah.javacoretutorials.tutorials.advance.coupling;

import org.junit.jupiter.api.Test;

/*
Tightly coupled object is an object that needs to know quite a bit about other objects and are usually highly dependent on each other's interfaces. Changing one object in a tightly coupled application often requires changes to a number of other objects. In a small application we can easily identify the changes and there is less chance to miss anything. But in 
large applications these inter-dependencies are not always known by every programmer and there is chance of overlooking changes.
 */
class TightCoupling1 {

    @Test
    void test() {

        Journey j = new Journey();
        // 3. and change here too
        j.startJourney();
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

class Bus {

    public void travel() {
        System.out.println("Travel by Bus");
    }
}
/*
Journey class depends on Car class to provide service to the end user (main class to call this Journey class). Journey class is tightly coupled with Car class - if any change in the Car class, it requires Journey class to change. 

For example if Car class travel() method change to journey() method then you have to change the startJourney() method to call journey() method instead of calling travel() method.
 */