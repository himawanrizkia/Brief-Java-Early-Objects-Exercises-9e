/*
PRACTICE EXERCISES E2_15
Look at the API of the Point class and find out how to construct a Point object.
In a PointTester program, construct two points with coordinates (3, 4) and (–3, –4).
Find the distance between them, using the distance method. Print the distance, as well as the expected value.
(Draw a sketch on graph paper to find the value you will expect.)

--
Cari dulu class point ada di Package mana, cari di https://docs.oracle.com/javase/8/docs/api/

Nama program kami ubah dari PointTester menjadi E2_15
*/
import java.awt.Point;

public class E2_15
{
    public static void main(String[] args)
    {
        Point titikA = new Point(3,4);
        Point titikB = new Point(-3,-4);
        double jarak = titikA.distance(titikB);
        System.out.println("Hasil perhitungan = "+jarak);
        System.out.println("Expected result = 10");
    }
}