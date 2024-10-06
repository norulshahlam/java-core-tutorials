package com.shah.javacoretutorials.practice.async;

import com.shah.javacoretutorials.parallelStreams.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@Slf4j
public class UseCaseTest {

    @Mock
    private HelloWorldService helloWorldService;
    static int processors;
    static ExecutorService executorService;

    @BeforeAll
    static void setUp() {
        /* Set the thread pool to match the cpu processor */
        processors = Runtime.getRuntime().availableProcessors();
        executorService = Executors.newFixedThreadPool(processors);
        log.info("Processor in my PC: " + processors);
    }

    @RepeatedTest(10)
    void testing() {

        when(helloWorldService.hello()).thenCallRealMethod();
        when(helloWorldService.world()).thenCallRealMethod();
        when(helloWorldService.beautiful(anyString(), anyString())).thenCallRealMethod();
        /* Here we have 3 processes. method 1 is io bound, method 2 cpu-bound. method 3 need input from method 1 n 2. and method 2 can run in parallel */
        long start = System.currentTimeMillis();

        CompletableFuture<String> helloFuture = CompletableFuture.supplyAsync(() -> helloWorldService.hello(),executorService);

        CompletableFuture<String> worldFuture = CompletableFuture.supplyAsync(() -> helloWorldService.world(),executorService);

        CompletableFuture<String> helloWorldFuture = helloFuture.thenCombineAsync(worldFuture, (hello, world) -> helloWorldService.beautiful(hello, world),executorService);

        CompletableFuture.allOf(helloWorldFuture);

        String result = helloWorldFuture.join();
        log.info(result);
        log.info("Time taken: " + (System.currentTimeMillis() - start));
    }
}
