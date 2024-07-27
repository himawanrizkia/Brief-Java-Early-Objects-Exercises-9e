/*
PRACTICE EXERCISES E1.4
Write a program that prints the balance of an account after the first, second, and third year. The account has an initial balance of $1,000 and earns 5 percent interest per year.
---
Diketahui:
Initial balance = USD1.000
Masa menabung = 3 tahun
Bunga tabungan = 5 persen per tahun
Diminta:
Buat program yang dapat menampilkan saldo tabungan setelah bunga pada tahun ke-1, 2, dan 3.

Soal ini bisa dikerjakan manual, dan bisa dengan Loops juga (nanti di Bab 6)
*/

public class E1_4
{
    public static void main(String[] args)
    {
       //declare variable needed, define the variable type and its initial value
       double balance = 1000;
       double rate = 0.05;
       int year = 0;

       //iterate and print output every year, at first, don't forget to increment/add the year value by 1
       while (year<3){
        year++;
        double interest = balance * rate;
        balance = balance + interest;
        System.out.println("The balance after "+year+" years is "+balance);
       }

    }
}
