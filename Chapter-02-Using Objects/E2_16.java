/*
PRACTICE EXERCISES E2_16

Using the Day class of Worked Example 2.1, write a DayTester program that constructs a Day object representing today, 
adds ten days to it, and then computes the difference between that day and today.

Print the difference and the expected value.
--
Agar program berjalan, jangan lupa download Day.java yang sudah disediakan di student companion.
Nama program kami ubah dari DayTester menjadi E2_16
*/

public class E2_16
{
    public static void main(String[] args)
    {
        Day today = new Day();
        Day someDate = today.addDays(10);
        int jumlahHari = someDate.daysFrom(today);

        System.out.println("Hasil perhitungan = "+jumlahHari);
        System.out.println("Expected result = 10");
    }
}

