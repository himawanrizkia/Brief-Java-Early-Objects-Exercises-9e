/*
PROGRAMMING PROJECT P2-09
The GregorianCalendar class describes a point in time, as measured by the Gregorian calendar,
the standard calendar that is commonly used throughout the world today.

You construct a GregorianCalendar object from a year, month, and day of the month, like this:
GregorianCalendar cal = new GregorianCalendar(); // Today’s date
GregorianCalendar eckertsBirthday = new GregorianCalendar(1919,Calendar.APRIL, 9);
Use the values Calendar.JANUARY . . . Calendar.DECEMBER to specify the month.

The add method can be used to add a number of days to a GregorianCalendar object:
cal.add(Calendar.DAY_OF_MONTH, 10); // Now cal is ten days from today
This is a mutator method—it changes the cal object.

The get method can be used to query a given GregorianCalendar object:
int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH); int month = cal.get(Calendar.MONTH);
int year = cal.get(Calendar.YEAR);
int weekday = cal.get(Calendar.DAY_OF_WEEK);
// 1 is Sunday, 2 is Monday, . . . , 7 is Saturday

Your task is to write a program that prints:
• The date and weekday that is 100 days from today.
• The weekday of your birthday.
• The date that is 10,000 days from your birthday.
Use the birthday of a computer scientist if you don’t want to reveal your own.
Hint: The GregorianCalendar class is complex,
and it is a really good idea to write a few test programs to explore the API before tackling the whole problem.
Start with a program that constructs today’s date, adds ten days, and prints out the day of the month and the weekday.
*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class P2_09
{
    public static void main(String[] args)
    {
        //Today
        GregorianCalendar cal = new GregorianCalendar();
        //Tambah hari
        int inputDay1 = 100;
        cal.add(Calendar.DAY_OF_MONTH,inputDay1);
        //Cetak
        System.out.println(inputDay1+" hari dari hari ini akan jatuh pada:");
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        switch (weekday)
        {
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
        }
        System.out.print(", ");

        int month = cal.get(Calendar.MONTH);
        switch (month)
        {
            case 0:
                System.out.print("January");
                break;
            case 1:
                System.out.print("February");
                break;
            case 2:
                System.out.print("March");
                break;
            case 3:
                System.out.print("April");
                break;
            case 4:
                System.out.print("May");
                break;
            case 5:
                System.out.print("June");
                break;
            case 6:
                System.out.print("July");
                break;
            case 7:
                System.out.print("August");
                break;
            case 8:
                System.out.print("September");
                break;
            case 9:
                System.out.print("October");
                break;
            case 10:
                System.out.print("November");
                break;
            case 11:
                System.out.print("December");
                break;
        }
        System.out.print(" ");

        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.print(dayOfMonth);
        System.out.print(", ");

        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println();

        //input Himawan Birthday
        GregorianCalendar himawanBirthday = new GregorianCalendar(1945,Calendar.AUGUST,17);
        int weekdayBirthday = himawanBirthday.get(Calendar.DAY_OF_WEEK);
        System.out.print("You were born on ");
        switch (weekdayBirthday)
        {
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
        }
        System.out.println(".");
        System.out.println("");
        //beberapa hari setelah tanggal kelahiran
        int inputDay2 = 10000;
        himawanBirthday.add(Calendar.DAY_OF_MONTH,inputDay2);
        //cetak
        System.out.println(inputDay2+" hari dari tanggal dimaksud akan jatuh pada:");
        int weekday2 = himawanBirthday.get(Calendar.DAY_OF_WEEK);
        switch (weekday2)
        {
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
        }
        System.out.print(", ");

        int month2 = himawanBirthday.get(Calendar.MONTH);
        switch (month2)
        {
            case 0:
                System.out.print("January");
                break;
            case 1:
                System.out.print("February");
                break;
            case 2:
                System.out.print("March");
                break;
            case 3:
                System.out.print("April");
                break;
            case 4:
                System.out.print("May");
                break;
            case 5:
                System.out.print("June");
                break;
            case 6:
                System.out.print("July");
                break;
            case 7:
                System.out.print("August");
                break;
            case 8:
                System.out.print("September");
                break;
            case 9:
                System.out.print("October");
                break;
            case 10:
                System.out.print("November");
                break;
            case 11:
                System.out.print("December");
                break;
        }
        System.out.print(" ");

        int dayOfMonth2 = himawanBirthday.get(Calendar.DAY_OF_MONTH);
        System.out.print(dayOfMonth2);
        System.out.print(", ");

        int year2 = himawanBirthday.get(Calendar.YEAR);
        System.out.print(year2);

    }
}