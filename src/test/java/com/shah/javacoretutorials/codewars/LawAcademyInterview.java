package com.shah.javacoretutorials.codewars;

import com.shah.javacoretutorials.model.Person;
import org.junit.jupiter.api.Test;

public class SingtelNcsTest {

    @Test
    void question1() {

        Person a = new Person();
        System.out.println(a);

        /*
         Person person = new Person(“A”);
  makeItNull(person);
  if (person == null) {
                System.out.println(“Person is null”);
  } else {
  {
                System.out.println(“Person is NOT null”);
  }
}
private static void makeItNull(Person person) {
               person = null;
}
         */

    }

    @Test
    void question2() {
        String password = "apple";
        System.out.println(password.hashCode());
    }

    @Test
    void question3() {

    }
}
