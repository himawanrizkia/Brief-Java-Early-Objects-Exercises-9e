/*
PROGRAMMING PROJECTS P2_01
Write a program called FourRectanglePrinter that constructs a Rectangle object,
prints its location by calling System.out.println(box), and then translates and prints it three more times,
so that, if the rectangles were drawn, they would form one large rectangle, as shown at right.
Your program will not produce a drawing. It will simply print the locations of the four rectangles.

*/
import java.awt.Rectangle;

public class P2_01
{
    public static void main(String[] args)
    {
        int xAwal = 0;
        int yAwal = 0;
        int panjang = 30;
        int lebar = 40;
        Rectangle box = new Rectangle (xAwal,yAwal,lebar,panjang);
        System.out.println(box);

        box.translate(lebar,0);
        System.out.println(box);

        box.translate(0,panjang);
        System.out.println(box);

        box.translate(-lebar,0);
        System.out.println(box);
    }
}