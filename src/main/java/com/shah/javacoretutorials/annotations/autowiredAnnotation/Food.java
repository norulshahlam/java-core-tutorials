package com.shah.javacoretutorials.annotations.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Food {

    /*
    The @Autowired annotation is used to inject the bean automatically
    The @Autowired annotation is used in constructor injection, setter injection and field injection
     */

    /* By field injection */

//    @Autowired
//    private Drink drink;


    /* By constructor injection. */

//    private Drink drink;
//    public Food(Drink drink) {
//        this.drink = drink;
//    }

    /* By setter injection. */

    private Drink drink;

    @Autowired
    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public String getPizza() {
        return drink.getPepsi();
    }
}
