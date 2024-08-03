/* PRACTICE EXERCISES E2_10

In the Java library, a color is specified by its red, green, and blue components between 0 and 255 (see Table 4 on page 57).
Write a program BrighterDemo that constructs a Color object with red, green, and blue values of 50, 100, and 150.
Then apply the brighter method of the Color class and print the red, green, and blue values of the resulting color.
(You won’t actually see the color—see Exercise •• Graphics E2.11 on how to display the color.)

Nama program BrighterDemo diubah jadi E2_10
*/
import java.awt.Color;

public class E2_10
{
    public static void main(String[] args)
    {
        Color biru = new Color(50,100,200);
        Color biruCerah = biru.brighter();
        System.out.println("Input\n"
        +"R: "+biru.getRed()+"\n"
        +"G: "+biru.getGreen()+"\n"
        +"B: "+biru.getBlue());
        System.out.println("Output\n"
        +"R: "+biruCerah.getRed()+"\n"
        +"G: "+biruCerah.getGreen()+"\n"
        +"B: "+biruCerah.getBlue());
    }
}