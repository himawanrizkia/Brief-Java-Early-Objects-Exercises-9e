/*
PRACTICE EXERCISES E1.6
Write a program that prints your name in large letters, such as
*   *    **    ****    ****    *     *
*   *   *  *   *   *   *   *    *   *
*****  *    *  ****    ****      * *
*   *  ******  *   *   *   *      *
*   *  *    *  *    *  *    *     *

Anggap saja nama saya Harry. Konstruksi huruf mengandalkan spasi dan bintang saja.
---
*/

public class E1_6
{
    public static void main(String[] args)
    {
        System.out.println("*   *    **    ****    ****    *     *");
        System.out.println("*   *   *  *   *   *   *   *    *   *");
        System.out.println("*****  *    *  ****    ****      * *");
        System.out.println("*   *  ******  *   *   *   *      *");
        System.out.println("*   *  *    *  *    *  *    *     *");

        //alternatif lain, kalau pakai yang bawah, yang atas dihapus saja
        System.out.println
        ("*   *    **    ****    ****    *     *\n"
        +"*   *   *  *   *   *   *   *    *   *\n"
        +"*****  *    *  ****    ****      * *\n"
        +"*   *  ******  *   *   *   *      *\n"
        +"*   *  *    *  *    *  *    *     *");
    }
}