package com.shah.javacoretutorials.annotations.autowiredAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Coke implements Drink {

    public String getPepsi() {
        return "coke";
    }
}
