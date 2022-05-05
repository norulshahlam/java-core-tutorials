package com.shah.javacoretutorials.intermediate.aggregation;

/*
Association is relation between two separate classes which establishes through their Objects. Association can be one-to-one, one-to-many, many-to-one, many-to-many.

In Object-Oriented programming, an Object communicates to other Object to use functionality and services provided by that object. Composition and Aggregation are the two forms of association. we will be discussing only on Aggregation.

Aggregation is a term which is used to refer one way (HAS-A) relationship between two objects. For example, Student class can have reference of Address class but vice versa does not make sense.

The HAS-A relationship is based on usage, rather than inheritance. For example, take two classes Author and Book. Book class has relation with Author class by having its reference. Now we are able to get all the properties of both class.
*/

import com.shah.javacoretutorials.model.Author;
import com.shah.javacoretutorials.model.Book;
import org.junit.jupiter.api.Test;

class IntroOne {
	@Test
	void test() {
		Author author = new Author("John", 42, "USA");
		Book b = new Book("Java for Beginner", 800, author);
System.out.println(b);
	}
}

