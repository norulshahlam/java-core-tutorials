package com.shah.javacoretutorials.tutorials.advance.multithreading;

import org.junit.jupiter.api.Test;

/*

https://www.youtube.com/watch?v=3vptroRUvn8
https://www.youtube.com/watch?v=71dgtPrbToE&t=5s

Volatile
For read / write variables
Changes done by 1 thread are visible to other threads
Can be used to implement Non-lock-based algorithms
Relatively faster than Synchronized
Possibility of deadlock and livelock

Synchronized
For executing on Methods/blocks
1 & only 1 thread is allowed to enter block of code at the same time
Can be used to implement lock-based algorithms
Slow because of acquire and release of lock
No possibility of deadlock and livelock



Atomic
For read / write / modify variables
Can be used to implement Non-lock-based algorithms
Relatively faster than Synchronized and Volatile
Possibility of deadlock and livelock


 */
class AtomicVolatileSynchronized {
    @Test
    void test() {

    }
}

