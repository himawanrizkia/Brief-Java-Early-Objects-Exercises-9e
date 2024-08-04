/*
 * PROGRAMMING PROJECT P2-04
 * Baca instruksi di buku (Read the instruction of book)
 */

import java.awt.Rectangle;

public class P2_04
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(10,10,20,20);
        Rectangle r2 = new Rectangle(15,15,30,30);
        Rectangle r3 = r1.intersection(r2);
        System.out.println("Input:");
        System.out.println("r1 : "+r1);
        System.out.println("r2 : "+r2);
        System.out.println("Apakah ada intersection?");
        if (r3.getWidth()<0||r3.getHeight()<0)
            System.out.println("Tidak ada intersection.");
        else
            System.out.println("Terdapat intersection. r3 : "+r3);
    }
}