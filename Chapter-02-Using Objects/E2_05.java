/* PRACTICE EXERCISES E2_05
Write a program that constructs a rectangle with area 42 and a rectangle with perimeter 42.
Print the widths and heights of both rectangles.
--
Persegi panjang dengan luas 42 misalnya persegi panjang yang memiliki panjang 6 dan lebar 7 (in case bilangan bulat)
Persegi panjang dengan keliling 42 misalnya persegi panjang dengan panjang 3 dan lebar 7 (in case bilangan bulat)
*/
import java.awt.Rectangle;

public class E2_05
{
    public static void main(String[] args)
    {
        Rectangle box1 = new Rectangle(2,2,6,7);
        double box1_width = box1.getWidth();
        double box1_height = box1.getHeight();
        Rectangle box2 = new Rectangle(2,2,3,7);
        double box2_width = box2.getWidth();
        double box2_height = box2.getHeight();

        //Cetak hasil
        System.out.println("Untuk box 1");
        System.out.println("Lebar box 1 = "+box1_width);
        System.out.println("Panjang box 1 = "+box1_height+"\n");
        System.out.println("Untuk box 2");
        System.out.println("Lebar box 2 = "+box2_width);
        System.out.println("Panjang box 2 = "+box2_height);

    }
}