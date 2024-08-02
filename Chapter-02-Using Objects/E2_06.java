/* PRACTICE EXERCISES E2_06
Look into the API documentation of the Rectangle class and locate the method

void add(int newx, int newy)

Read through the method documentation. Then determine the result of the following statements:

Rectangle box = new Rectangle(5, 10, 20, 30); box.add(0, 0);

Write a program AddTester that prints the expected and actual location, width, and height of box after the call to add.

The method add(int newx,int newy)adds the point newx and newy to rectangle bounds and shift the rectangle to the new boundaries.
After adding the newx and newy to a rectangle bounds, the new locations of width and height a rectangle becomes
new width = width + x  - newx
new height = height + y - newy

name AddTester kita ganti menjadi E2_06
*/
import java.awt.Rectangle;

public class E2_06
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println("Koordinat-X : "+box.getX());
        System.out.println("Koordinat-Y : "+box.getY());
        System.out.println("Width : "+box.getWidth());
        System.out.println("Height : "+box.getHeight());
        System.out.println("Expected Value\n"
        +"Koordinat-X : 0\n"
        +"Koordinat-Y : 0\n"
        +"Width : 25\n"
        +"Height : 40\n");
    }
}