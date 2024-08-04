/*
 * PROGRAMMING PROJECT P2-14
 * Write a program to plot the face at right. Provide a class FaceViewer and a class FaceComponent.
 * 
 * Nama class kami modifikasi menjadi P2_14_FaceViewer dan P2_14_FaceComponent
 */

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class P2_14_FaceComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //casting
        Graphics2D g2 = (Graphics2D) g;

        //making object
        Ellipse2D.Double face = new Ellipse2D.Double(100,100,400,400);
        Ellipse2D.Double eye1 = new Ellipse2D.Double(175,175,50,50);
        Ellipse2D.Double eye2 = new Ellipse2D.Double(375,175,50,50);
        Line2D.Double mouth = new Line2D.Double(175,400,425,400);

        //draw
        Color purple = new Color(60,0,100);
        g2.setColor(purple);
        g2.draw(face);
        g2.draw(eye1);
        g2.draw(eye2);
        g2.draw(mouth);
    }
}