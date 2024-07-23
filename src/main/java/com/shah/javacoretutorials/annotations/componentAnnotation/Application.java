package com.shah.javacoretutorials.annotations.componentAnnotation;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Log
public class Application {

    public static void main(String[] args) {

		/*
		https://www.youtube.com/watch?v=AXZkhKTbbWc&list=PLNZoxAm3UwYHlL0hyRiCUBOv4xHQ92jcZ&index=18&ab_channel=JavaGuides

		ApplicationContext is where Spring holds instances of objects that it has identified to be managed and distributed automatically. These are called beans.
		 */
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        /*
        Get the Food bean you just created. there are 2 ways:
        1. use the class name
        2. use the bean name you defined in @Component
         */
        Food foodBean = applicationContext.getBean(Food.class);
        Food foodBean2 = (Food) applicationContext.getBean("foodBean");
        log.info(foodBean.getPizza());
        log.info(foodBean2.getPizza());

        /*
        List all beans in the application
         */
        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }

}
