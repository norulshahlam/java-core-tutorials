package com.shah.javacoretutorials.model;

import lombok.*;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private int marks;

    @Override
    public int compareTo(@NotNull Student s) {
        // a. ternary operator.
        // b. return this.age > s.age ? -1 : this.age < s.age ? 1 : 0;

        return Integer.compare(this.marks, s.marks);
    }
}
