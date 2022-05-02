package com.shah.javacoretutorials.advance.exceptionHandler;

/*
Some resources require you to use try-catch because they have a potential to cause exceptions.
resources like FileReader, BufferedReader, SQLConnections etc.
You can avoid handling this by suppressing them by adding 'throws Exception' in your main method. this will ignore ALL resources. if u only 1 2 suppress certain resource, use that specific handler eg 'throws IOException'. NOTE: use this if u r certain theres no error
*/
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

class SuppressedExceptionFour {
  /* remove the throws statement n c what happens */
  @Test
  @Disabled
  void test()  throws IOException, SQLException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter something");
    String str = br.readLine();
    System.out.println("You typed: " + str);

  }
}
