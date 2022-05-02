package com.shah.javacoretutorials.advance.fileScanner;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
now we will read a file of type File
the java.io.File is now considered as legacy, and not recommended for new projects.
 */
class FileIoReadFive {

    @Test
    void test() throws IOException {

        File file = new File("src/test/java/com/shah/javacoretutorials/advance/fileScanner/readme.txt");
        String path = file.getAbsolutePath();

        System.out.println(path);

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable " + file.canRead());
            System.out.println("File size in bytes " + file.length());

            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } else {
            System.out.println("The file does not exist.");
        }
    }
}
