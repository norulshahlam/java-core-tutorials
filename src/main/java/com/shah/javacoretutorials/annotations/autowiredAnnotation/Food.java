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
//    private Pepsi pepsi;


    /* By constructor injection. */

//    private Pepsi pepsi;
//    public Food(Pepsi pepsi) {
//        this.pepsi = pepsi;
//    }

    /* By setter injection. */

    private Pepsi pepsi;

    @Autowired
    public void setDrink(Pepsi pepsi) {
        this.pepsi = pepsi;
    }

    public String getPizza() {
        return pepsi.getPepsi();
    }
}
