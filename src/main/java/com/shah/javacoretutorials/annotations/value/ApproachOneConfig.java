package com.shah.javacoretutorials.annotations.value;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApproachOneConfig {

    /*
    use @ConfigurationProperties on a @Bean method to bind externalized properties to the ApproachOne instance
     */

    @Bean
    @ConfigurationProperties(prefix = "openapi")
    public ApproachOne openapi() {
        return new ApproachOne();
    }
}