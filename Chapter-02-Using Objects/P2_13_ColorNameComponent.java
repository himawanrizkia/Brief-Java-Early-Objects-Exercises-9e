/*
 * PROGRAMMING PROJECT P2-13
 * Write a graphics program that draws 12 strings, one each for the 12 standard colors (except Color.WHITE),
 * each in its own color. Provide a class ColorNameViewer and a class ColorNameComponent.
 * 
 * Nama class kami modifikasi menjadi P2_13_ColorNameViewer dan P2_13_ColorNameComponent
 */

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class P2_13_ColorNameComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.drawString("Black",20,40);
        g2.setColor(Color.BLUE);
        g2.drawString("Blue",20,80);
        g2.setColor(Color.CYAN);
        g2.drawString("Cyan",20,120);
        g2.setColor(Color.GRAY);
        g2.drawString("Gray",20,160);
        g2.setColor(Color.DARK_GRAY);
        g2.drawString("Dark Gray",20,200);
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawString("Light Gray",20,240);
        g2.setColor(Color.GREEN);
        g2.drawString("Green",20,280);
        g2.setColor(Color.MAGENTA);
        g2.drawString("Magenta",20,320);
        g2.setColor(Color.ORANGE);
        g2.drawString("Orange",20,360);
        g2.setColor(Color.PINK);
        g2.drawString("Pink",20,400);
        g2.setColor(Color.RED);
        g2.drawString("Red",20,440);
        g2.setColor(Color.YELLOW);
        g2.drawString("Yellow",20,480);
        
    }
}