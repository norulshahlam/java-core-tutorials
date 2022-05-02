package com.shah.javacoretutorials.advance.objectCopy;

import com.shah.javacoretutorials.model.Employee;
import org.junit.jupiter.api.Test;

/*
here we have our plain POJO & create a new obj using existing obj
so by default it is shallow copy

1. create instance of the new obj based on old obj
2. try to change one of the field
3. print to see if it affects the other

*/
class ShallowCopyTwo {
    @Test
    void test() {

        /**** shallow copy *****/
        Employee a = new Employee("shah", 35);

        Employee b = a;

        System.out.println(a);
        System.out.println(b);

        /* 2. change one of the field will result in changing the other */
        b.setAge(10);
        System.out.println("************");
        // 3.
        System.out.println(a);
        System.out.println(b);

    }
}
