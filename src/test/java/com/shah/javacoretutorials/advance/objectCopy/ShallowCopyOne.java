package com.shah.javacoretutorials.advance.objectCopy;

import org.junit.jupiter.api.Test;

class ShallowCopyOne {

    @Test
    void test() {
        int[] vals = {3, 7, 9};
        ExTwo e = new ExTwo(vals);
        e.showData(); // prints out [3, 7, 9]
        /* changing 1 of this obj will change the other */
        vals[0] = 13;
        e.showData(); // prints out [13, 7, 9]
    }
}