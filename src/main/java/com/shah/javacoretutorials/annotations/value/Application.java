package com.shah.javacoretutorials.annotations.value;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Application {

    public static void main(String[] args) {

		/*
		ApplicationContext is where Spring holds instances of objects that it has identified to be managed and distributed automatically. These are called beans.
		 */
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        /*
        @Value annotation is used to assign default values to variables and method arguments.
        It is mostly used to get value for a specific property key from the properties file. We can read spring environment variables as well as system variables using @Value annotation.

        https://www.baeldung.com/spring-value-defaults
        https://www.baeldung.com/configuration-properties-in-spring-boot

        use-case: 3 approaches to use this
         */

        /* For this approach, remember to add @ConfigurationPropertiesScan in your main class */

        ApproachOne approachOne = applicationContext.getBean(ApproachOne.class);
        System.out.println(approachOne);
        ApproachTwo approachTwo = applicationContext.getBean(ApproachTwo.class);
        System.out.println(approachTwo);
        ApproachThree approachThree = applicationContext.getBean(ApproachThree.class);
        System.out.println(approachThree);
    }
}
