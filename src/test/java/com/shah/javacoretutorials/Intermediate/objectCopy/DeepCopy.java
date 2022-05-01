package com.shah.javacoretutorials.Intermediate.objectCopy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/*
In object-oriented programming, object copying is creating a copy of an existing object, the resulting object is called an object copy or simply copy of the original object

https://www.geeksforgeeks.org/deep-shallow-lazy-copy-java-examples/#:~:text=In%20shallow%20copy%2C%20only%20fields,as%20well%20as%20objet%20references.

we deep copy using Copy Constructor
*/
class DeepCopy {
    @Test
    void test() {
    int[] vals = {3, 7, 9};
    Ex e = new Ex(vals);
    e.showData(); // prints out [3, 7, 9]
    vals[0] = 13;
    e.showData(); // prints out [3, 7, 9]

   /* changes in array values will not be shown in data values. */
  }
}
