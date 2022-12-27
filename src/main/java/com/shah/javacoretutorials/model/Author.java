package com.shah.javacoretutorials.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private String authorName;
    private int age;
    private String place;

    public Author(int age) {
        this.age = age;
        System.out.println("Object created with one int param");
    }

}
