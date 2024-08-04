/*
PROGRAMMING PROJECT P2-11
Write a program LineDistanceTester that constructs a line joining the points (100, 100) and (200, 200),
then constructs points (100, 200), (150, 150), and (250, 50).
Print the distance from the line to each of the three points, using the ptSegDist method of the Line2D class.
Also print the expected values. (Draw a sketch on graph paper to find what values you expect.)
*/

import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.text.DecimalFormat;
public class P2_11
{
    public static void main(String[] args)
    {
        DecimalFormat formatAngka = new DecimalFormat("##.##");
        Point2D.Double point1 = new Point2D.Double(100,100);
        Point2D.Double point2 = new Point2D.Double(200,200);
        Point2D.Double point3 = new Point2D.Double(100,200);
        Point2D.Double point4 = new Point2D.Double(150,150);
        Point2D.Double point5 = new Point2D.Double(250,50);

        Line2D.Double lineSegment = new Line2D.Double(point1,point2);

        double distanceLineToPoint3 = lineSegment.ptSegDist(point3);
        double distanceLineToPoint4 = lineSegment.ptSegDist(point4);
        double distanceLineToPoint5 = lineSegment.ptSegDist(point5);

        System.out.println("Result:");
        System.out.println("Distance from Line to Point 3 = "+formatAngka.format(distanceLineToPoint3));
        System.out.println("Expected result = 70.71");
        System.out.println("Distance from Line to Point 4 = "+formatAngka.format(distanceLineToPoint4));
        System.out.println("Expected result = 0,00");
        System.out.println("Distance from Line to Point 5 = "+formatAngka.format(distanceLineToPoint5));
        System.out.println("Expected result = 141.42");


    }
    
}