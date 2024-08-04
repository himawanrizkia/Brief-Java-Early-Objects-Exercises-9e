/*
PROGRAMMING PROJECT P2-12
Repeat Exercise ••• Testing P2.11, but now write a graphical application that shows the line and the points.
Draw each point as a tiny circle. Use the drawString method to draw each distance next to the point, using calls
g2.drawString("Distance: " + distance, p.getX(), p.getY());
*/

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.text.DecimalFormat;
import java.awt.Color;


public class P2_12_component extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Casting graphics2D
        Graphics2D g2 = (Graphics2D) g;

        //Definisikan format angka yang akan dimunculkan outputnya
        DecimalFormat formatAngka = new DecimalFormat("##.##");

        //Set variabel dan sebutkan nilainya juga. Sehingga, instead of nanti kita memanggil getX dan getY, kita bisa langsung pakai variabel-variabel di atas.
        int x1 = 100;
        int y1 = 100;
        int x2 = 200;
        int y2 = 200;
        int x3 = 100;
        int y3 = 200;
        int x4 = 150;
        int y4 = 150;
        int x5 = 250;
        int y5 = 50;

        //Buat Object Titik
        Point2D.Double point1 = new Point2D.Double(x1,y1);
        Point2D.Double point2 = new Point2D.Double(x2,y2);
        Point2D.Double point3 = new Point2D.Double(x3,y3);
        Point2D.Double point4 = new Point2D.Double(x4,y4);
        Point2D.Double point5 = new Point2D.Double(x5,y5);

        //Buat object garisnya
        Line2D.Double lineSegment = new Line2D.Double(point1,point2);

        //Hitung jaraknya
        double distanceLinePoint3 = lineSegment.ptSegDist(point3);
        double distanceLinePoint4 = lineSegment.ptSegDist(point4);
        double distanceLinePoint5 = lineSegment.ptSegDist(point5);

        //Visualisasikan garisnya
        g2.setColor(Color.BLUE);
        g2.draw(lineSegment);

        //Visualisasikan lingkaran penanda titik. Agar akurat, karena ellipse acuannya dari pojok kanan atas, maka posisinya harus disesuaikan agar titik pusat lingkaran pas di titik yang sudah didefinisikan.
        int doubleR = 20;
        Ellipse2D.Double ellipse3 = new Ellipse2D.Double(x3-doubleR/2,y3-doubleR/2,doubleR,doubleR);
        Ellipse2D.Double ellipse4 = new Ellipse2D.Double(x4-doubleR/2,y4-doubleR/2,doubleR,doubleR);
        Ellipse2D.Double ellipse5 = new Ellipse2D.Double(x5-doubleR/2,y5-doubleR/2,doubleR,doubleR);
        g2.setColor(Color.ORANGE);
        g2.draw(ellipse3);
        g2.fill(ellipse3);
        g2.draw(ellipse4);
        g2.fill(ellipse4);
        g2.draw(ellipse5);
        g2.fill(ellipse5);

        //Visualisasikan keterangan jaraknya. Instead of using getX dan getY, panggil saja langsung variabelnya.
        g2.setColor(Color.BLACK);
        g2.drawString("Distance = "+formatAngka.format(distanceLinePoint3),x3,y3);
        g2.drawString("Distance = "+formatAngka.format(distanceLinePoint4),x4,y4);
        g2.drawString("Distance = "+formatAngka.format(distanceLinePoint5),x5,y5);

    }
}