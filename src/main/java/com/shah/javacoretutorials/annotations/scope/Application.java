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

        Singleton scope is the default scope for beans in Spring container. This means that if we do not specify a scope for a bean, Spring will create a single bean instance and will reuse it whenever requested.

        One way to check is to use the hashcode() method. a singleton scope always returns the same hashcode value because it is the same instance.

        The latest version of the Spring framework defines 6 types of scopes:

        singleton
        prototype
        request
        session
        application
        websocket

        four additional scopes that are only available in a web-aware application context. We use these less often in practice.

        The request scope creates a bean instance for a single HTTP request, while the session scope creates a bean instance for an HTTP Session.

        The application scope creates the bean instance for the lifecycle of a ServletContext, and the websocket scope creates it for a particular WebSocket session.
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
