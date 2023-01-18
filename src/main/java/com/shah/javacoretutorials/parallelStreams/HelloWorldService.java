package com.shah.javacoretutorials.parallelStreams;

import org.springframework.stereotype.Service;

import static com.shah.javacoretutorials.util.CommonUtil.delay;
import static com.shah.javacoretutorials.util.CommonUtil.log;

@Service
public class HelloWorldService {
    public String hello() {
        delay(1000);
        log("inside hello");
        return "hello";
    }

    public String world() {
        delay(1000);
        log("inside world");
        return " world!";
    }
}
