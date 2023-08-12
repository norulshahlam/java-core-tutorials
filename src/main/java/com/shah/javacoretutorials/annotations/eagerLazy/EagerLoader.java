package com.shah.javacoretutorials.annotations.eagerLazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {

    public EagerLoader() {
        System.out.println("eager");
    }
}
