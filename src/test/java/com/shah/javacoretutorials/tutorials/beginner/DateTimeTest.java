package com.shah.javacoretutorials.tutorials.beginner;

/*
how to get current time . date of specific zone by specifying the zone name
how to get all the list of diff zones
understand what is machine-readable and human-readable datetime
 */

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

class DateTimeTest {

    @Test
    void test() {
        // fetching all zone id
        for (String s : ZoneId.getAvailableZoneIds())
            System.out.println(s);

        // getting time of a specific zone(human-readable)
        LocalDate d = LocalDate.now(ZoneId.of(("Asia/Singapore")));
        LocalTime t = LocalTime.now(ZoneId.of("Asia/Singapore"));
        System.out.println("Time: " + t + ". Date: " + d);

        // getting time of a specific zone(machine-readable)
        Instant i = Instant.now();
        System.out.println(i);
    }

    @Test
    void dateManipulater() {

        //check and store today date
        LocalDate todayDate = LocalDate.now();
        System.out.println("todaydate: " + todayDate);

        //store specific date
        LocalDate weddingDate = LocalDate.of(2018, 03, 10);
        System.out.println("weddingdate: " + weddingDate);

        //Once you have a LocalDate object, you can find out the year, month, and	day with the methods getYear, getMonthValue, and getDayOfMonth:
        System.out.println(weddingDate.getMonthValue());
        System.out.println(weddingDate.getDayOfMonth());
        System.out.println(weddingDate.getDayOfYear());
        System.out.println(weddingDate.getDayOfWeek());

        //wht is the date 1000 days after your wedding?
        LocalDate thousandDays = weddingDate.plusDays(1000);
        System.out.println("thousand days later: " + thousandDays);
    }

    @Test
    void dateManipulater2() {

        //the time and date now
        Instant currentTime = Instant.now();
        System.out.println(currentTime);

        LocalDate currentdate = LocalDate.now();
        //set a date manually
        LocalDate nationalDay = LocalDate.of(1965, Month.AUGUST, 9);
        System.out.println("national day is: " + nationalDay);
        System.out.println("today date is: " + currentdate);
        System.out.println("last month was: " + currentdate.minusMonths(1));
        System.out.println("tomorrow date is: " + currentdate.plusDays(1));
        System.out.println("is this leap year? " + currentdate.isLeapYear());
        System.out.println("move current date to 30th: " + currentdate.withDayOfMonth(30));
        System.out.println("number of days in current month: " + currentdate.lengthOfMonth());

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

        System.out.println("local time: " + currentTime1);
        System.out.println("india time: " + indiaTimeDate);
        System.out.println("new york time: " + newYorkDateTime);

        System.out.println("\n finding the period between 2 dates \n");

        LocalDate start = LocalDate.of(1985, Month.DECEMBER, 20);
        LocalDate end = LocalDate.now();
        Period period = start.until(end);

        System.out.println("days: " + period.getDays());
        System.out.println("months: " + period.getMonths());
        System.out.println("year: " + period.getYears());
        System.out.println(period);
    }

    @Test
    void dateFormatter() {

        //how to print different format of date/time

        DateTimeFormatter medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter long1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter short1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        LocalDate currentDate = LocalDate.now();
        System.out.println("medium: " + currentDate.format(medium));
        System.out.println("full: " + currentDate.format(full));
        System.out.println("long: " + currentDate.format(long1));
        System.out.println("short: " + currentDate.format(short1));
    }
}
