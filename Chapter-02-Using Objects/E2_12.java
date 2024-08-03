/* PRACTICE EXERCISES E2_12
 * Repeat Exercise •• E2.10, but apply the darker method of the Color class twice to the object Color.RED.
 * Call your class DarkerDemo.
 * --
 * Nama kelas diubah jadi E2_12
*/
import java.awt.Color;

public class E2_12
{
    public static void main(String[] args)
    {
        // apply darker twice
        Color myColor = Color.RED.darker();
        Color myColorDarker = myColor.darker();
        System.out.println("Input\n"
        +"R: "+myColor.getRed()+"\n"
        +"G: "+myColor.getGreen()+"\n"
        +"B: "+myColor.getBlue());
        System.out.println("Output\n"
        +"R: "+myColorDarker.getRed()+"\n"
        +"G: "+myColorDarker.getGreen()+"\n"
        +"B: "+myColorDarker.getBlue());
    }
}