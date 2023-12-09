package com.shah.javacoretutorials.tutorials.advance.fileScanner;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
now we will read a file of type Path

1. normal approach - read everything in a file

in practice, we don't read all. we read certain content using filter, so we remove unnecessary data, avoid memory overloading

2. stream approach - lowercase all content, get only word contains 'a'
 */
class FileWriteReadFour {

    @SuppressWarnings({"unused"})
    @Test
    void test() throws IOException {
        Path currentDirectory = Paths.get("./src/test/java/com/shah/javacoretutorials/advance/fileScanner/readme.txt");
        System.out.println("File name: "+currentDirectory.getFileName());
        System.out.println("File size: "+Files.size(currentDirectory)+" bytes");

        List<String> content = Files.readAllLines(currentDirectory);

        System.out.println("1. Read all content");
        System.out.println(content);

        System.out.println(" 2. Read filtered content");
        Files.lines(currentDirectory).map(String::toLowerCase).filter(s -> s.contains("a")).forEach(System.out::println);
    }
}
