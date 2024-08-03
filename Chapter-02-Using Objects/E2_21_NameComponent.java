import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JComponent;

public class E2_21_NameComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(20,20,100,20);
        g2.setColor(Color.BLUE);
        g2.draw(box);
        g2.fill(box);
        g2.setColor(Color.RED);
        g2.drawString("Himawan",40,35);
    }

}