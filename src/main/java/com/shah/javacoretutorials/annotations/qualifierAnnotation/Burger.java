package com.shah.javacoretutorials.annotations.qualifierAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Burger implements Food{

    @Override
    public String getFood() {
        return "burger";
    }
}
