package com.shah.javacoretutorials.annotations.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Meal {
    /*
    @Qualifier annotation is used in conjunction with Autowired to avoid confusion when we have two or more beans configured for the same type. Similarly, we can achieve the same by using @Primary annotation to give higher preference to a bean when there are multiple beans of the same type.
     */

    private final Food food;

    /*
    We have 2 implementation - pizza & burger, and we decided to use the pizza implementation using the @Qualifier annotation. Or, we can annotate the @Primary annotation on the class where we want to use the implementation.
     */

    public Meal(@Qualifier("pizza") Food food) {
        this.food = food;
    }

    public String getMeal() {
        return food.getFood();
    }

}
