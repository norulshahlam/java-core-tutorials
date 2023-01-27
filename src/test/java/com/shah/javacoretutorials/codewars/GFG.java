package com.shah.javacoretutorials.codewars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;


public class GFG
{
    // public instance initialized when loading the class
    private static final GFG instance = new GFG();

    private GFG()
    {
        // private constructor
    }
    public static GFG getInstance(){
        return instance;
    }
}
