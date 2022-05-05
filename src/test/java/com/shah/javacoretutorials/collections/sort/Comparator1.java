package com.shah.javacoretutorials.collections.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
/* Java provides two interfaces to sort objects using data members of the class:
 Comparable & Comparator
 
 Comparable 

 1) provides a single sorting sequence. ie, we can sort the collection on the basis of a single element such as id or name or price. 
 2) affects the original class, i.e., the actual class is modified. 
 3) provides compareTo() method to sort elements. 
 4) in java.lang package. 
 5) can sort the list elements of Comparable type by Collections.sort(List) method.
 
 Comparator 

 1) provides multiple sorting sequences. ie, can sort the collection on the basis of multiple elements such as id, name, and price etc. 
 2) doesn't affect the original class, i.e the actual class is not modified. 
 3) provides compare() method to sort elements.
 4) in java.util package. 
 5) can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
 
 When to use Comparator /Comparable?
 If you are using custom class, use Comparable
 If a class cannot be changed, use Comparator
 if sorting of objects needs to be based on natural order then use Comparable 
 if sorting needs to be done on attributes of different objects, then use Comparator in Java.
 For Comparable, don’t need to make any code changes at client side for using Arrays.sort() or Collection.sort() methods automatically uses the compareTo() method of the class. 
 For Comparator, client needs to provide the Comparator class to use in compare() method.
 
 * this demonstrates the use of comparator. user will customized comparator to sort by the last digit of the elements	
 
 demo how to use comparator (not comparable) comparing only 1 element	sort from highest marks to lowest	
 a) create a class that implement comparator
 b) override compareTo() inside this class to define your sorting logic
 c) ctreate obj of this class in main()
 d) use this overridden method by Collections.sort(itemToBeSorted, yourCustomSort);
 
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Comparator1 {
    /*
    THIS IS NO LONGER WIDELY USED AS WE CAN USE JAVA STREAMS TO ACHIEVE THE SAME WITH SHORTER CODE
    */
    @Test
    void test() {


        List<Integer> val1 = Arrays.asList(403, 109, 845, 330, 23);
        System.out.println("before sort:" + val1);

        Comparator<Integer> com = new CompSet();
        Collections.sort(val1, com);
        System.out.println("after sort:" + val1);
    }
}

// a)
class CompSet implements Comparator<Integer> {

    // b)
    @Override
    public int compare(Integer o1, Integer o2) {
        System.out.println("o1: " + o1 + ", o2: " + o2);
        // compare the last digit of each element only by using modulus
        if (o1 % 10 > o2 % 10) return 1;
        return -1;
    }
}
/*
 * How it works?
 *
 * it all starts with this line: Collections.sort(val1, com); sort() takes in 2
 * param - the List and a Comparator Comparator has 2 param where it is being
 * compared against each other Compares its two arguments for order. Returns a
 * negative integer,zero, or a positive integer as the first argument is less
 * than, equal to, or greater than the second o1 will keep checking and store
 * after checking against o2 we have to create class, implements Comparator,
 * define the logic then use this obj of it as param for sort()
 *
 * Comparator is functional interface ie 1 abstract method which means we can
 * use lambda expression we can define the method logic and run it in 1 line:
 *
 * Collections.sort(val1, (o1,o2) -> { return o1%10 > o2%10 ? 1 : -1; });
 *
 * this is another way of implementing d)
 *
 * Laymen: if o1 > o2, return 1. else return -1. repeat for next element. this
 * is how sorting works
 */
