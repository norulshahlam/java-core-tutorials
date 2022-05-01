package com.shah.javacoretutorials.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    int RollNo;
    String Name;
    int Marks;
}
