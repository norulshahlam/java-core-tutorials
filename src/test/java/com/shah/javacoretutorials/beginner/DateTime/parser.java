package com.shah.javacoretutorials.beginner.DateTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/* Creates a formatter using the specified pattern. */
class parser {

	@Test
	void test()  {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("enter date. format in dd/mm/yyyy. use proper date2");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		LocalDate enteredDate = LocalDate.parse(input,formatter);
		
		System.out.println("entered date: "+enteredDate);
		scanner.close();

	}

}
