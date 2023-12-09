package com.shah.javacoretutorials.tutorials.intermediate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import java.util.EnumSet;
/*
A Java Enum is a special Java type used to define collections of constants. 
More precisely, a Java enum type is a special kind of Java class. 
An enum can contain constants, methods etc. 
Java enums were added in Java 5.
enums are used when we know the values at compile time
 */

@AllArgsConstructor
@Getter
enum EnumGirls {
    // constant or object or enum or variables that never change
    nadia("fun", "33"),
    rema("hot", "23"),
    fia("faithful", "28"),
    emma("fit", "25"),
    aqasha("beauty", "30");

    private final String remarks;
    private final String age;

}

class IntroTwo {
    @Test
    void test() {
        //print all values
        for (EnumGirls girls : EnumGirls.values())
            System.out.println(girls + " " + girls.getRemarks() + " " + girls.getAge());

        System.out.println("\nAnd now for the range of constants:\n");

        // print range of values based on name
        for (EnumGirls girls : EnumSet.range(EnumGirls.rema, EnumGirls.emma))
            System.out.printf("%s\t%s\t%s\n", girls, girls.getRemarks(), girls.getAge());
    }
}
