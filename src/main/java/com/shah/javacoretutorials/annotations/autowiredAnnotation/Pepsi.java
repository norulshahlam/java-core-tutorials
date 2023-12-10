package com.shah.javacoretutorials.annotations.autowiredAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Pepsi implements Drink {

    public String getPepsi() {
        return "pepsi";
    }
}
