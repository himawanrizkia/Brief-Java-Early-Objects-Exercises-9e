/* PRACTICE EXERCISES E2_03
Write an AreaTester program that constructs a Rectangle object and then computes and prints its area.
Use the getWidth and getHeight methods.
Also print the expected answer.
--
Dalam konteks ini, nama AreaTester diganti menjadi E2_03
*/
import java.awt.Rectangle;

public class E2_03
{
    public static void main(String[] args)
    {
        Rectangle obyek = new Rectangle(10,20,1000,2500);
        double luasObyek = obyek.getWidth() * obyek.getHeight();
        System.out.println("Luas obyek adalah: "+luasObyek);
        System.out.println("Expected: 2500000");
    }
}