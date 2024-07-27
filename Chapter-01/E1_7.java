/*
PRACTICE EXERCISES E1.7
Write a program that prints your name in Morse code, like this:
.... .- .-. .-. -.--
Use a separate call to System.out.print for each letter.
---
Daftar morse code bisa diakses di https://id.wikipedia.org/wiki/Kode_Morse

Misalkan nama anda adalah Himawan, maka:
H = .... 
I = .. 
M = -- 
A = .- 
W = .-- 
A = .- 
N = -.

Dengan memakai System.out.print, akan terbentuk kumpulan huruf yang berjejer dalam satu baris menjadi kata.
*/

public class E1_7
{
    public static void main(String[] args)
    {
        System.out.print(".... ");
        System.out.print(".. ");
        System.out.print("-- ");
        System.out.print(".- ");
        System.out.print(".-- ");
        System.out.print(".- ");
        System.out.print("-. ");
    }
}