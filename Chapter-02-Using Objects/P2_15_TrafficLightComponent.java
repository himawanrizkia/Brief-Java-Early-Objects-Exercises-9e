/*
 * PROGRAMMING PROJECT P2-15
 * Write a graphical program that draws a traffic light.
 * 
 * Hasil dari tugas ini adalah dua file yaitu P2_15_TrafficLightViewer.java dan P2_15_TrafficLightComponent.java
 */


import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;

public class P2_15_TrafficLightComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        //Set spesifikasi
        Rectangle box = new Rectangle(125,125,150,400);
        Ellipse2D.Double light1 = new Ellipse2D.Double(150,150,100,100);
        Ellipse2D.Double light2 = new Ellipse2D.Double(150,275,100,100);
        Ellipse2D.Double light3 = new Ellipse2D.Double(150,400,100,100);

        //Draw
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(box);
        g2.setColor(Color.RED);
        g2.fill(light1);
        g2.setColor(Color.YELLOW);
        g2.fill(light2);
        g2.setColor(Color.GREEN);
        g2.fill(light3);
    }
}