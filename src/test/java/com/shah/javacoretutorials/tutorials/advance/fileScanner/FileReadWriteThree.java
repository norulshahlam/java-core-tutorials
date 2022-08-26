package com.shah.javacoretutorials.tutorials.advance.fileScanner;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
now we will read & write to a file

 */
class FileReadWriteThree {

  @Test
  void test() throws IOException {

    Path fileLocation = Paths.get("src/test/java/com/shah/javacoretutorials/advance/fileScanner/writeme.txt");
    System.out.println(fileLocation);

    List<String> list =
    List.of("Apple","zdth","carrot","donkey","elephant");

    Files.write(fileLocation, list);
  }
}
