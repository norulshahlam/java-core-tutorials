package com.shah.javacoretutorials.beginner.dateTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
/*  how to take a date and manipulate it  */
class manipulate2 {

	@Test
	void test()  {

		//check and store today date
		LocalDate todaydate = LocalDate.now();
		System.out.println("todaydate: "+todaydate);
		
		//store specific date
		LocalDate weddingdate = LocalDate.of(2018, 03, 10);
		System.out.println("weddingdate: "+weddingdate);
		
		//Once you have a LocalDate object, you can find out the year, month, and	day with the methods getYear, getMonthValue, and getDayOfMonth:
		System.out.println(weddingdate.getMonthValue());
		System.out.println(weddingdate.getDayOfMonth());
		System.out.println(weddingdate.getDayOfYear());
		System.out.println(weddingdate.getDayOfWeek());
		
		//wht is the date 1000 days after your wedding?
		LocalDate thousandDays = weddingdate.plusDays(1000);
		System.out.println("thousand days later: "+thousandDays);
	}

}
