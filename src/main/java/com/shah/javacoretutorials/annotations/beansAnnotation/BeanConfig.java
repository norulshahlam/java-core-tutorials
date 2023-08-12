package com.shah.javacoretutorials.annotations.beansAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    /*
    This is Java-based configuration, rather than annotation-based configuration. All the annotations are removed from the other classes and is replaced by this configuration here.
     */

    @Bean
    public Burger burger() {
        return new Burger();
    }

    @Bean
    public Pizza pizza() {
        return new Pizza();
    }

    /*
    @Bean annotation provides initMethod and destroyMethod attributes to perform certain actions after bean initialization or before bean destruction by a container.
     */

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Meal meal() {
        return new Meal(pizza());
    }
}
