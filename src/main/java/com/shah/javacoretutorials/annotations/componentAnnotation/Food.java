package com.shah.javacoretutorials.annotations.componentAnnotation;

import org.springframework.stereotype.Component;

@Component("foodBean")
public class Food {

    /*
    The @Component annotation indicates that an annotated class is a “spring bean/component”.

    The @Component annotation tells Spring container to automatically create Spring bean.
     */

    public String getPizza() {
        return "pizza";
    }
}
