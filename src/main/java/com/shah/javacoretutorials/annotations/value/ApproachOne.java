package com.shah.javacoretutorials.annotations.value;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApproachOne {

    /*
    use @ConfigurationProperties on a @Bean method to bind externalized properties to the Item instance:
     */

    @Bean
    @ConfigurationProperties(prefix = "item")
    public Item item() {
        return new Item();
    }
}