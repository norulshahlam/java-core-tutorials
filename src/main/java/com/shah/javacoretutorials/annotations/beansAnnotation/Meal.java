package com.shah.javacoretutorials.annotations.beansAnnotation;

public class Meal {

    private final Food food;

    public Meal(Food food) {
        this.food = food;
    }

    public String getMeal() {
        return food.getFood();
    }

    public void init() {
        System.out.println("Initialization Logic™");
    }

    public void destroy() {
        System.out.println("Destruction Logic®");
    }
}
