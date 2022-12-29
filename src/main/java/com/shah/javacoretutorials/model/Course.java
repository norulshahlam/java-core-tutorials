package com.shah.javacoretutorials.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;
}
