package com.shah.javacoretutorials.tutorials.intermediate;

/*
What is the difference between Association and Aggregation?

Association means the relationship between the two interdependent classes. The connection is established using the two objects.

Aggregation - both the entries can survive individually which means ending one entity will not affect the other entity.

Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.

What is the use of Aggregation and Composition in Java?

Aggregation is used when the objects are independent, and Composition is used when the objects are dependent on each other. Aggregation is used for code re-usability, and Composition offers adaptability and vigorous code.

*/

import com.shah.javacoretutorials.model.Author;
import com.shah.javacoretutorials.model.Book;
import com.shah.javacoretutorials.model.Employee;
import org.junit.jupiter.api.Test;

class AssociationCompositionAggregation {
    @Test
    void composition() {
        // Composition - Book depends on Author
        Author author = new Author("John", 42, "USA");
        Book b = new Book("Java for Beginner", 800, author);
        System.out.println(b);
    }

    @Test
    void aggregation() {
        // Aggregation - Employee can exist independently of Author
        Employee employee = new Employee("john", 12);
        Author author = new Author("John", 42, "USA");
        System.out.println(author);
        System.out.println(employee);
    }
}

