package com.shah.javacoretutorials.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.StopWatch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

@Slf4j
public class CommonUtil {

    public static StopWatch stopWatch = new StopWatch();

    public static void startTimer() {
        stopWatchReset();
        stopWatch.start();
    }

    public static void timeTaken() {
        stopWatch.stop();
        log.info("Total Time Taken : {} ms", stopWatch.getTime());
    }

    public static void delay(long delayMilliSeconds) {
        try {
            sleep(delayMilliSeconds);
        } catch (Exception e) {
            log.info("Exception is :{}", e.getMessage());
        }

    }

    public static void stopWatchReset() {
        stopWatch.reset();
    }

    public static ArrayList<Integer> generateArrayList(int maxNumber) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        IntStream.rangeClosed(1, maxNumber)
                .boxed()
                .forEach((arrayList::add));
        return arrayList;
    }

    public static LinkedList<Integer> generateIntegerLinkedList(int maxNumber) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        IntStream.rangeClosed(1, maxNumber)
                .boxed()
                .forEach((linkedList::add));
        return linkedList;
    }

    public static void log(String message) {
        System.out.println("[" + Thread.currentThread().getName() + "] - " + message);
    }
}