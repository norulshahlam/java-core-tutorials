package com.shah.javacoretutorials.tutorials.java8.FunctionalProgramming3.ReadFile7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/*
how to read text file and manipulate using streams
*/
public class intro1 {
  public static void main(String[] args) throws IOException {

    // normal fetch
    Files.lines(Paths.get(
        "C:/Users/NORULSHAHLAM/Downloads/coding/JavaCoreTutorials/src/Java8/FunctionalProgramming/ReadFile7/file.txt"))
        .forEach(System.out::println);

    // fetch, split into individua words, remove duplicates, sort
    Files.lines(Paths.get(
        "C:/Users/NORULSHAHLAM/Downloads/coding/JavaCoreTutorials/src/Java8/FunctionalProgramming/ReadFile7/file2.txt"))
        .map(i -> i.split(" ")).flatMap(Arrays::stream).distinct().sorted().forEach(System.out::println);

    // fetch project directory
    Files.list(Paths.get("C:/Users/NORULSHAHLAM/Downloads/coding/JavaCoreTutorials/src")).forEach(System.out::println);

  }
}
