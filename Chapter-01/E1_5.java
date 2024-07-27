/*
PRACTICE EXERCISES E1.5
Write a program that displays your name inside a box on the screen, like this:

+------+
| Dave |
+------+

Do your best to approximate lines with characters such as | - +.
---
Misal kita akan membuat
+---------------+
| himawanrizkia |
+---------------+
Jangan lupa, karena +---------------+ akan dianggap text dan bukan operator, beri tanda kutip sehingga menjadi "+---------------+"
*/

public class E1_5
{
    public static void main(String[] args)
    {
        System.out.println("+---------------+");
        System.out.println("| himawanrizkia |");
        System.out.println("+---------------+");

        //alternatif lain, kalau pakai yang bawah, yang atas dihapus saja
        System.out.println
        ("+---------------+\n"
        +"| himawanrizkia |\n"
        +"+---------------+");
    }
}