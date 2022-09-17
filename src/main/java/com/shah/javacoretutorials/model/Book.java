package com.shah.javacoretutorials.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book  {

    String name;
    int price;
    // book has-a relationship with author
    Author author;
}
