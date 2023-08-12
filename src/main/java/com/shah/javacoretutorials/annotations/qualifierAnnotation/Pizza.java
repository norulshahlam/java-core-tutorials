package com.shah.javacoretutorials.annotations.qualifierAnnotation;

import org.springframework.stereotype.Component;

@Component
// if you want to use this implementation
//@Primary
public class Pizza implements Food{

    @Override
    public String getFood() {
        return "pizza";
    }
}
