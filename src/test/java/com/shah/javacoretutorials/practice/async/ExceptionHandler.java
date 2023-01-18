package com.shah.javacoretutorials.practice.async;

import com.shah.javacoretutorials.parallelStreams.GroceriesService;
import com.shah.javacoretutorials.parallelStreams.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExceptionHandler {

    @Mock
    private HelloWorldService helloWorldService;

    @InjectMocks
    private GroceriesService groceriesService;

    @Test
    void helloWorldSuccess() {
        when(helloWorldService.hello()).thenCallRealMethod();
        when(helloWorldService.world()).thenCallRealMethod();
        String s = groceriesService.asyncWithExceptionalHandling();
        System.out.println(s);
    }

    @Test
    void helloThrowException() {
        when(helloWorldService.hello()).thenThrow(new RuntimeException("Exception Occurred"));
        when(helloWorldService.world()).thenCallRealMethod();
        String s = groceriesService.asyncWithExceptionalHandling();
        System.out.println(s);
    }

    @Test
    void worldThrowException() {
        when(helloWorldService.hello()).thenCallRealMethod();
        when(helloWorldService.world()).thenThrow(new RuntimeException("Exception Occurred"));
        String s = groceriesService.asyncWithExceptionalHandling();
        System.out.println(s);
    }

    @Test
    void helloWorldThrowException() {
        when(helloWorldService.hello()).thenThrow(new RuntimeException("Exception Occurred"));
        when(helloWorldService.world()).thenThrow(new RuntimeException("Exception Occurred"));
        String s = groceriesService.asyncWithExceptionalHandling();
        System.out.println(s);
    }
}
