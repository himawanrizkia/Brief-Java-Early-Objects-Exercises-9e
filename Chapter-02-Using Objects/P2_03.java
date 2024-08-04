/*
 * PROGRAMMING PROJECT P2-03
 * Baca instruksi di buku (Read the instruction of book)
 */

import java.awt.Rectangle;

public class P2_03
{
    public static void main(String[] args)
    {
        int xAwal = 100;
        int yAwal = 100;
        int width = 200;
        int height = 200;
        Rectangle square = new Rectangle(xAwal,yAwal,width,height);
        System.out.println(square);
        square.grow(-width/4,-height/4);
        System.out.println(square);
        System.out.println("Expected Answer\n"
        +"java.awt.Rectangle[x=100,y=100,width=200,height=200]\n"
        +"java.awt.Rectangle[x=150,y=150,width=100,height=100]");
    }
}