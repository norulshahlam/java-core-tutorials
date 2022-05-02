package com.shah.javacoretutorials.advance.threads;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

/*

https://www.udemy.com/course/java-programming-tutorial-for-beginners/learn/lecture/9565852#content

ExecutorService is a JDK API that simplifies running tasks in asynchronous mode. Generally speaking, ExecutorService automatically provides a pool of threads and an API for assigning tasks to it.

Future

Represents the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation. The result can only be retrieved using method get when the computation has completed,

This is similar to javascript Promises

 */
class Future7 {
  @Test
  void test() throws ExecutionException, InterruptedException {

    ExecutorService es = Executors.newFixedThreadPool(1);
    Future<String> x = es.submit(new task5("bob"));
    Future<String> y = es.submit(new task5("adam"));
    Future<String> z = es.submit(new task5("pam"));

    System.out.println("executed");
    System.out.println(x.get());
    System.out.println(y.get());
    System.out.println(z.get());
    System.out.println("completed");
    es.shutdown();
  }
}

class task5 implements Callable<String> {

  private String n;

  public task5(String n) {
    this.n = n;
  }

  @Override
  public String call() throws Exception {
    Thread.sleep(2000);
    return "hi " + n;
  }
}