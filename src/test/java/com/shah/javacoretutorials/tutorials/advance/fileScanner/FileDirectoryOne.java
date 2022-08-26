package com.shah.javacoretutorials.tutorials.advance.fileScanner;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*

how read file directory

*/
class FileDirectoryOne {

    @Test
    void test() throws IOException {

        Path mainDirectory = Path.of(".");

        System.out.println("\n\nget the items in MAIN directory\n");
        Files.list(mainDirectory).forEach(System.out::println);

        System.out.println("\n\nget the items in SOURCE directory\n");
        Files.list(Paths.get("./src")).forEach(System.out::println);

        /**** get files recursively ******/

        System.out.println("\n\nu can also get file recursively - 1 level deep\n");
        Files.walk(mainDirectory, 1).forEach(System.out::println);

        System.out.println("\n\nu can also get file recursively - 2 level deep\n");
        Files.walk(mainDirectory, 2).forEach(System.out::println);
    }
}
