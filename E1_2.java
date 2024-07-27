/*
PRACTICE EXERCISES E1.2
Write a program that prints the sum of the first ten positive integers, 1 + 2 + ... + 10.
---
Kita akan membuat program di Java yang dapat menghitung dan menampilkan hasil penjumlahan 10 angka pertama yang bernilai positif dalam himpunan bilangan bulat.
Untuk tahapan sekarang, semestinya boleh mengerjakan tidak menggunakan Loops.
Namun soal ini juga bisa dikerjakan dengan Loops.
*/

//Alternatif Jawaban 1

public class E1_2
{
    public static void main(String[] args)
    {
    //Kita buat dulu variabel baru bernama sum yang sifatnya integer (int). Sekaligus assign nilai variabelnya.
        int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
    //Kita buat perintah untuk mencetak/print nilai sum
        System.out.println(sum);
    }
}


// //Alternatif Jawaban 2, jika kita menggunakan Loops

/*
public class E1_2
{
    public static void main(String[] args)
    {
       //deklarasikan variabel yang dibutuhkan. variable sum digunakan untuk mencatat nilai penjumlahan dan setting sebagai integer. variabel j akan menjadi variabel yang nilainya akan kita naikan saat melakukan repetisi. Set semuanya bernilai nol.
       int sum = 0;
       int j = 0;

       //iterasi dengan while. Pertama, definisikan kondisi kapan perintah dijalankan, yaitu saat j < 10, karena kita start dari 0
       while (j<10){
        //jika kondisi terpenuhi, tambahkan nilai 1 pada variabel j
        j++;
        //sum yang baru adalah = nilai sum yang sebelumnya sudah disimpan dan ditambah dengan nilai variabel j
        sum = sum + j;
       }

       //print hasil perhitungannya
       System.out.println(sum);

    }
}
 */