import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class E2_19_TwoSquareComponent extends JComponent
{
    /* Alternatif kalau mau di-fix-kan dari awal

    E2_19_TwoSquareComponent()
    {
        centerX = 200;
        centerY = 200;
    }
    */

    public void paintComponent(Graphics g)
    {
        //Tetapkan dulu acuannya
        int centerX = 200;
        int centerY = 200;

        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        Rectangle box1 = new Rectangle(centerX-150,centerY-150,centerX+100,centerY+100);
        g2.setColor(Color.GREEN);
        g2.draw(box1);
        g2.fill(box1);

        Rectangle box2 = new Rectangle(centerX-100,centerY-100,centerX,centerY);
        g2.setColor(Color.ORANGE);
        g2.draw(box2);
        g2.fill(box2);

        Ellipse2D.Double dot = new Ellipse2D.Double(centerX-5,centerY-5,10,10);
        g2.setColor(Color.WHITE);
        g2.draw(dot);
        g2.fill(dot);

        g2.setColor(Color.BLACK);
        g2.drawString("Center",centerX,centerY);

    }
}