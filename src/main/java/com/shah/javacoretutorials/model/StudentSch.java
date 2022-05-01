package com.shah.javacoretutorials.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentSch {

    String name;
    // Student has-a relationship with School
    School school;
}
