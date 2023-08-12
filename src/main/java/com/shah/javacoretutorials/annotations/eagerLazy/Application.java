package com.shah.javacoretutorials.annotations.eagerLazy;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Log
public class Application {

    public static void main(String[] args) {

		/*
		ApplicationContext is where Spring holds instances of objects that it has identified to be managed and distributed automatically. These are called beans.
		 */
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        /*
        By default, Spring creates all singleton beans eagerly at the startup /bootstrapping of the application context. You can load the Spring beans lazily (on-demand) using @Lazy annotation

        @Lazy annotation can be used with @Configuration, @Component and @Bean annotations. Eager initialization is recommended to avoid and detect all possible errors immediately rather than at runtime.

        Use case: We created two beans with constructor to print a string. one os eager and one is lazy. when spring starts, we see that only the eager class gets loaded from the log.

         */


    }

}
