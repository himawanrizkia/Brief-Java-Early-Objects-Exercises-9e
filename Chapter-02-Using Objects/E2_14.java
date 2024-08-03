/*
PRACTICE EXERCISES E2_14

Write a program RandomPrice that prints a random price between $10.00 and $19.95 every time the program is run.

---
Namun kita ingin agar start nilai random harganya mulai 10.00 dan berakhir di 19.95,
maka sebaiknya

Nilai Random + Max - Min
Dimana Max - Min = Range

Nama program diubah dari RandomPrice menjadi E2_14
*/

import java.text.DecimalFormat;
import java.util.Random;
public class E2_14
{
    public static void main(String[] args)
    {
        //hitung range
        double minimumPrice = 10.00;
        double maximumPrice = 19.95;
        double rangePrice = maximumPrice - minimumPrice;
        
        //ciptakan random generator, lalu modifikasi
        Random randomGenerator = new Random();
        double priceRandom = randomGenerator.nextDouble(rangePrice) + minimumPrice;

        //atur agar nantinya hasil 
        DecimalFormat priceFormatter = new DecimalFormat("##.##");

        //cetak hasilnya
        System.out.println("Harga sebesar $"+priceFormatter.format(priceRandom)+".");
    }
}