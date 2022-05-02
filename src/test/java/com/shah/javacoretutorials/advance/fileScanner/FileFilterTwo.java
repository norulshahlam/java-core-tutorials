package com.shah.javacoretutorials.advance.fileScanner;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/*
now we know how to get file, let's filter!

1. find filename with .java extension
2a - size more than 1000 bytes
2b - if it is a directory

*/
class FileFilterTwo {

    @SuppressWarnings({"unused"})
    @Test
    void test() throws IOException {

        Path currentDirectory = Paths.get(".");

        // with .txt extension?
        Predicate<? super Path> p = path -> String.valueOf(path).contains(".txt");
        Files.walk(currentDirectory, 4).filter(p).forEach(System.out::println);

        // with .java extension?
        BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");
        Files.find(currentDirectory, 4, matcher).forEach(System.out::println);

        // size more than 1000 bytes?
        BiPredicate<Path, BasicFileAttributes> bySize = (path, attributes) -> attributes.size() > 10000;
        Files.find(currentDirectory, 3, bySize).forEach(System.out::println);

        // is it a directory?
        BiPredicate<Path, BasicFileAttributes> ifFolder = (path, attributes) -> attributes.isDirectory();
        Files.find(currentDirectory, 3, ifFolder).forEach(System.out::println);
    }
}
