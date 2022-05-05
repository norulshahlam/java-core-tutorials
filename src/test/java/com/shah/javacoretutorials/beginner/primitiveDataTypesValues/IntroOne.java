package com.shah.javacoretutorials.beginner.primitiveDataTypesValues;

import org.junit.jupiter.api.Test;

/*
A primitive data type specifies the size and type of variable values, and it has no additional methods.

On the other hand, Object types like Integer, String, has methods

There are eight primitive data types in Java:

DataType	Size	    Description
byte	    1 byte  	Stores whole numbers from -128 to 127
short   	2 bytes	  Stores whole numbers from -32,768 to 32,767
int     	4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	    8 bytes	  Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float   	4 bytes	  Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double  	8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	  1 bit	    Stores true or false values
char	    2 bytes	  Stores a single character/letter or ASCII values
*/
class IntroOne {

    /* some of the values shown here */
    @Test
    void test() {
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;

        System.out.println("Byte min & max val: " + minByte + " to " + maxByte);

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("Integer min & max val: " + minInt + " to " + maxInt);
    }
}
