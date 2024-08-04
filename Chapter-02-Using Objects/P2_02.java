/*
 * PROGRAMMING PROJECT P2-02
 * Baca instruksi di buku (Read the instruction of book)
 */

import java.awt.Rectangle;

public class P2_02
{
    public static void main(String[] args)
    {
        int xAwal = 100;
        int yAwal = 100;
        int width = 50;
        int height = 50;
        Rectangle square = new Rectangle(xAwal,yAwal,width,height);
        System.out.println(square);
        square.translate(width/2,height/2);
        square.grow(width/2,height/2);
        System.out.println(square);
        System.out.println("Expected Answer\n"
        +"java.awt.Rectangle[x=100,y=100,width=50,height=50]\n"
        +"java.awt.Rectangle[x=100,y=100,width=100,height=100]");
    }
}