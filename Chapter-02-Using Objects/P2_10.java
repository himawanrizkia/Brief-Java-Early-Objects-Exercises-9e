/*
PROGRAMMING PROJECT P2-10
The LocalDate class describes a calendar date that does not depend on a location or time zone.
You construct a date like this:
LocalDate today = LocalDate.now(); // Today’s date
LocalDate eckertsBirthday = LocalDate.of(1919, 4, 9);

The plusDays method can be used to add a number of days to a LocalDate object:
LocalDate later = today.plusDays(10); // Ten days from today
This method does not mutate the today object, but it returns a new object that is a given number of days away from today.

To get the year of a day, call
int year = today.getYear();

To get the weekday of a LocalDate, call
String weekday = today.getDayOfWeek().toString();

Your task is to write a program that prints
• The weekday of “Pi day”, that is, March 14, of the current year.
• The date and weekday of “Programmer’s day” in the current year; that is, the 256th day of the year.
(The number 256, or 28, is useful for some programming tasks.)
• The date and weekday of the date that is 10,000 days earlier than today.
*/

import java.time.LocalDate;

public class P2_10
{
    public static void main(String[] args)
    {
        //Input
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();

        //Pi Day
        LocalDate piDay = LocalDate.of(currentYear,3,14);
        System.out.println(piDay);

        //Programmer Day on Current Year
        LocalDate firstDayOfTheCurrentYear = LocalDate.of(currentYear,1,1);
        LocalDate programmerDay = firstDayOfTheCurrentYear.plusDays(255);
        System.out.println(programmerDay);

        //10.000 hari sebelum hari ini
        int flashbackDays = 7;
        LocalDate flashback = today.plusDays(flashbackDays*-1);
        String flashbackWeekday = flashback.getDayOfWeek().toString();
        System.out.println(flashbackWeekday+", "+flashback);

    }
}