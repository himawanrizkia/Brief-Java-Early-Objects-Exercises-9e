/*
PROGRAMMING PROJECT P2-08
Using the Day class of Worked Example 2.1, write a program that generates a Day object representing February 28 of this year,
and three more such objects that represent February 28 of the next three years.

Advance each object by one day, and print each object.
Also print the expected values:
2019-02-29
Expected: 2019-02-29
2020-03-01
Expected: 2020-03-01
. . .

*/
public class P2_08
{
    public static void main(String[] args)
    {
        Day endFeb24 = new Day(2024,02,28);
        Day endFeb25 = new Day(2025,02,28);
        Day endFeb26 = new Day(2026,02,28);
        Day endFeb27 = new Day(2027,02,28);

        Day nextdayEndFeb24 = endFeb24.addDays(1);
        Day nextdayEndFeb25 = endFeb25.addDays(1);
        Day nextdayEndFeb26 = endFeb26.addDays(1);
        Day nextdayEndFeb27 = endFeb27.addDays(1);

        System.out.println(nextdayEndFeb24);
        System.out.println("Expected result : 2024-02-29");
        System.out.println(nextdayEndFeb25);
        System.out.println("Expected result : 2025-03-01");
        System.out.println(nextdayEndFeb26);
        System.out.println("Expected result : 2026-03-01");
        System.out.println(nextdayEndFeb27);
        System.out.println("Expected result : 2027-03-01");
    }
}