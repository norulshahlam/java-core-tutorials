package com.shah.javacoretutorials.annotations.scope;

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
        We use @Scope to define the scope of a @Component class or a @Bean definition.

        Singleton: only one instance of the bean is created and shared across the entire application. This is the default scope.

        Prototype: a new instance of the bean is created every time it is requested.

        One way to check is to use the hashcode() method. a singleton scope always returns the same hashcode value because it is the same instance.
         */

        PrototypeScope prototypeScope = applicationContext.getBean(PrototypeScope.class);
        PrototypeScope prototypeScope2 = applicationContext.getBean(PrototypeScope.class);

        SingletonScope singletonScope = applicationContext.getBean(SingletonScope.class);
        SingletonScope singletonScope2 = applicationContext.getBean(SingletonScope.class);

        System.out.println("prototypeScope: "+prototypeScope.hashCode());
        System.out.println("prototypeScope2: "+prototypeScope2.hashCode());
        System.out.println("singletonScope: "+singletonScope.hashCode());
        System.out.println("singletonScope2: "+singletonScope2.hashCode());
    }
}
