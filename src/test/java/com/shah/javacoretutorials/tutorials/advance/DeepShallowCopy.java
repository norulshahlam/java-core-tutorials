package com.shah.javacoretutorials.tutorials.advance;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.shah.javacoretutorials.model.Author;
import com.shah.javacoretutorials.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

import static org.assertj.core.api.Assertions.assertThat;

/*
In object-oriented programming, object copying is creating a copy of an existing object, the resulting object is called an object copy or simply copy of the original object

Shallow copy

Whenever you try to create a copy of an object using the shallow copy, all fields of the original objects are copied exactly. But, if it contains any objects as fields then, only references to those objects are copied not the compete objects.

This implies that, if you perform shallow copy on an object that contains any objects as fields, since only references are copied in a shallow copy, both the original and copied object points to the same reference internally and, if you do any changes to the data using the copied object, they are reflected in the original object too.

Deep copy

Whenever you try to create a copy of an object, in the deep copy all fields of the original objects are copied exactly, in addition to this, if it contains any objects as fields then copy of those is also created (using the clone() method).

This implies that, if perform you deep copy on an object that contains reference (object), both the original and copied object refers to different objects and, if you do any changes to the data the copied object they are not reflected in the original object.

https://www.baeldung.com/java-deep-copy


*/
class DeepShallowCopy {

    @Test
    void shallowCopyTest() {
        Author author1 = new Author("john", 21, "SG");
        Book book1 = new Book("history", 21, author1);
        Book book2 = book1;
        assertThat(book1.getAuthor().getAuthorName()).isEqualTo(book2.getAuthor().getAuthorName());

        /* change in 1 affect the other */
        book1.getAuthor().setAuthorName("seg");
        assertThat(book1.getAuthor().getAuthorName()).isEqualTo(book2.getAuthor().getAuthorName());
    }

    @Test
    void shallowCopyTest2() {
        Author author1 = new Author("john", 21, "SG");
        Book book1 = new Book("history", 21, author1);
        Book book2 = new Book();
        BeanUtils.copyProperties(book1, book2);

        /* change in 1 affect the other */
        book1.getAuthor().setAuthorName("seg");
        assertThat(book1.getAuthor().getAuthorName()).isEqualTo(book2.getAuthor().getAuthorName());
    }

    @Test
    void deepCopyTest() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        Author author1 = new Author("john", 21, "SG");
        Book book1 = new Book("history", 21, author1);
        Book book2 = objectMapper.readValue(objectMapper.writeValueAsString(book1), Book.class);

        /* change in 1 DOESN'T affect the other */
        book1.getAuthor().setAuthorName("seg");
        assertThat(book1.getAuthor().getAuthorName()).isNotEqualTo(book2.getAuthor().getAuthorName());
    }

    @Test
    void deepCopyTest2() {
        Gson gson = new Gson();

        Author author1 = new Author("john", 21, "SG");
        Book book1 = new Book("history", 21, author1);
        Book book2 = gson.fromJson(gson.toJson(book1), Book.class);

        /* change in 1 DOESN'T affect the other */
        book1.getAuthor().setAuthorName("seg");
        assertThat(book1.getAuthor().getAuthorName()).isNotEqualTo(book2.getAuthor().getAuthorName());
    }
}
