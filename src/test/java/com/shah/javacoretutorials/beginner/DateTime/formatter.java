package com.shah.javacoretutorials.beginner.DateTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

class formatter {

	@Test
	void test()  {
		
		//how to print different format of date/time

		DateTimeFormatter medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter long1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter short1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

		LocalDate currentDate = LocalDate.now();
		System.out.println("medium: " + currentDate.format(medium));
		System.out.println("full: "+currentDate.format(full));
		System.out.println("long: "+currentDate.format(long1));
		System.out.println("short: "+currentDate.format(short1));
	}
}
