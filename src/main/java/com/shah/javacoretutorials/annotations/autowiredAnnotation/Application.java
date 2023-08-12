package com.shah.javacoretutorials.annotations.autowiredAnnotation;

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

        Food foodBean = applicationContext.getBean(Food.class);
        log.info(foodBean.getPizza());
    }

}
