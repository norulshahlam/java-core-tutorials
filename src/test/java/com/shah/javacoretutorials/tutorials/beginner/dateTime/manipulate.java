package com.shah.javacoretutorials.tutorials.beginner.dateTime;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
/*	how to take a date and manipulate it	*/
class manipulate {

	@Test
	void test()  {
		
		//the time and date now
		Instant currentTime = Instant.now();
		System.out.println(currentTime);
		
		LocalDate currentdate = LocalDate.now();
		//set a date manually
		LocalDate nationalDay = LocalDate.of(1965, Month.AUGUST, 9);
		System.out.println("national day is: "+nationalDay);
		System.out.println("today date is: "+currentdate);
		System.out.println("last month was: "+currentdate.minusMonths(1));
		System.out.println("tomorrow date is: "+currentdate.plusDays(1));
		System.out.println("is this leap year? "+currentdate.isLeapYear());
		System.out.println("move current date to 30th: "+currentdate.withDayOfMonth(30));
		System.out.println("number of days in current month: "+currentdate.lengthOfMonth());
		
		System.out.println("\n finding date time in certain zone \n");
		
		ZonedDateTime currentTime1 = ZonedDateTime.now();
		//zone id can be found in https://www.mkyong.com/java8/java-display-all-zoneid-and-its-utc-offset/
		/*
		2 way to get diff time zone
		1. get timezone direct
		2. get curr timexone and change to other timezone
		*/
		ZonedDateTime indiaTimeDate = ZonedDateTime.now(ZoneId.of("Indian/Mayotte"));
		ZonedDateTime newYorkDateTime = currentTime1.withZoneSameInstant(ZoneId.of("America/New_York"));

		System.out.println("local time: "+currentTime1);
		System.out.println("india time: "+indiaTimeDate);
		System.out.println("new york time: "+newYorkDateTime);
		
		System.out.println("\n finding the period between 2 dates \n");
		
		LocalDate start = LocalDate.of(1985, Month.DECEMBER, 20);
		LocalDate end = LocalDate.now();
		Period period = start.until(end);
		
		System.out.println("days: "+period.getDays());
		System.out.println("months: "+period.getMonths());
		System.out.println("year: "+period.getYears());
		System.out.println(period);			
	}
}