/* PRACTICE EXERCISES E2_08
Write a program HollePrinter that switches the letters "e" and "o" in a string.
Use the replace method repeatedly.
Demonstrate that the string "Hello, World!" turns into "Holle, Werld!"

Nama program HollePrinter diubah jadi E2_08

Gunakan karakter sementara
*/

public class E2_08
{
    public static void main(String[] args)
    {
        String kata = "Hello, World!";
        String kata1 = kata.replace("e","@");
        kata1 = kata1.replace("o","0");
        kata1 = kata1.replace("@","o");
        kata1 = kata1.replace("0","e");
        System.out.println("Kata yang diinput : "+kata);
        System.out.println("Hasil konversi : "+kata1);
    }
}