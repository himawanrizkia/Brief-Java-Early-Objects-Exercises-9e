/*
PRACTICE EXERCISES E1.3
Write a program that prints the product of the first ten positive integers, 1 × 2 × ... × 10. (Use * to indicate multiplication in Java.)
---
Kita akan membuat program di Java yang dapat menghitung dan menampilkan hasil perkalian 10 angka pertama yang bernilai positif dalam himpunan bilangan bulat.
Untuk tahapan sekarang, semestinya boleh mengerjakan tidak menggunakan Loops.
Namun soal ini juga bisa dikerjakan dengan Loops.
*/

//Alternatif Jawaban 1
/*
public class E1_3
{
    public static void main(String[] args)
    {
    //Kita buat dulu variabel baru bernama multiplication yang sifatnya integer (int). Sekaligus assign nilai variabelnya.
        int multiplication = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
    //Kita buat perintah untuk mencetak/print nilai multiplication
        System.out.println(multiplication);
    }
}
*/

//Alternatif Jawaban 2, menggunakan Loops
public class E1_3
{
    public static void main(String[] args)
    {
       //declare variablenya, agar program bekerja, variabel multiplication sebagai integer diset nilai awalnya sebesar 1
       int multiplication = 1;
       int j = 0;

       //iterate dengan set kondisi yang sifatnya TRUE agar statement tertentu dieksekusi. Statement yang diperlukan antara lain. Pertama, naikan nilai j sebesar 1. Kedua, lakukan perkalian antara nilai awal variabel multiplication dengan nilai variabel j untuk menghasilkan nilai multiplication yang baru.
       while (j<10){
        j++;
        multiplication = multiplication * j;
       }

       //print the output
       System.out.println("Hasil perkalian yang diperoleh sebesar "+multiplication+".");
       
    }
}
