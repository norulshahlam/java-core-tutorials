package com.shah.javacoretutorials.tutorials.collections.sort;

/*

    ****DEPRECATED****

this is the same as the previous demo.
comparator can be used to sort multiple elements, so we will create 1 to sort
 by name, another 1 by age. steps are similar to comparable:

 a) create a class that implements comparator
 b) override compareTo() inside this class to define your sorting logic
 c) create obj of this class in main()
 d) use this overridden method by Collections.sort(itemToBeSorted, yourCustomSort);

 THIS IS NO LONGER WIDELY USED AS WE CAN USE JAVA STREAMS TO ACHIEVE THE SAME WITH SHORTER CODE
*/

import com.shah.javacoretutorials.model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;

class Comparator2 {
    @Test
    void test() {

        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(109, "Asshish", 18));
        al.add(new Student(105, "Jai", 21));
        al.forEach(s -> System.out.println(s.getRollNo() + " " + s.getName() + " " + s.getMarks()));

        System.out.println("\nSorting by Name");
        al.sort(new sortByNameAsc());
        al.forEach(s -> System.out.println(s.getRollNo() + " " + s.getName() + " " + s.getMarks()));

        System.out.println("\nsorting by Age Asc");
        al.sort(new sortByMarkAsc());
        al.forEach(s -> System.out.println(s.getRollNo() + " " + s.getName() + " " + s.getMarks()));

        System.out.println("\nsorting by Age Desc");
        al.sort(new sortByMarkDesc());
        al.forEach(s -> System.out.println(s.getRollNo() + " " + s.getName() + " " + s.getMarks()));
    }
}

class sortByMarkAsc implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getMarks(), s2.getMarks());
    }
}

class sortByMarkDesc implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getMarks(), s1.getMarks());
    }
}

class sortByNameAsc implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
