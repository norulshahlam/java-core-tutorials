package com.shah.javacoretutorials.annotations.beansAnnotation;

import org.springframework.stereotype.Component;

public class Burger implements Food {

    @Override
    public String getFood() {
        return "burger";
    }
}
