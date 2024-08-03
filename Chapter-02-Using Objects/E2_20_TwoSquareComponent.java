import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JComponent;

public class E2_20_TwoSquareComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle box1 = new Rectangle(100,100,300,300);
        g2.setColor(Color.PINK);
        g2.draw(box1);
        g2.fill(box1);

        Rectangle box2 = new Rectangle (100,400,300,300);
        Color purple = new Color(219,165,255);
        g2.setColor(purple);
        g2.draw(box2);
        g2.fill(box2);
    }
}