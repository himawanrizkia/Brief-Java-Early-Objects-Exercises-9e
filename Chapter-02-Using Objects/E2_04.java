/* PRACTICE EXERCISES E2_04
Write a PerimeterTester program that constructs a Rectangle object and then computes and prints its perimeter.
Use the getWidth and getHeight methods.
Also print the expected answer.
--
Dalam konteks ini, nama PerimeterTester diganti menjadi E2_04
*/

//jangan lupa import dulu class Rectangle dari java.awt
import java.awt.Rectangle;

public class E2_04
{
    public static void main(String[] args)
    {
        Rectangle obyek = new Rectangle(10,20,1000,2500);
        double kelilingObyek = 2 * (obyek.getWidth() + obyek.getHeight());
        System.out.println("Keliling obyek adalah: " + kelilingObyek);
        System.out.println("Expected: 7000");
    }
}