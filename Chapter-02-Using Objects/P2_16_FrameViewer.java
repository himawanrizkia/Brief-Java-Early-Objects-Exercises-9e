/*
 * PROGRAMMING PROJECT P2-16
Run the following program:
import java.awt.Color; import javax.swing.JFrame; import javax.swing.JLabel;
public class FrameViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        JLabel label = new JLabel("Hello, World!");
        label.setOpaque(true);
        label.setBackground(Color.PINK);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

Modify the program as follows:
• Double the frame size.
• Change the greeting to “Hello, your name!”.
• Change the background color to pale green (see Exercise •• Graphics E2.11).
• For extra credit, add an image of yourself. (Hint: Construct an ImageIcon.)
 */

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class P2_16_FrameViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        ImageIcon icon = new ImageIcon("asianjim.png");
        JLabel label = new JLabel(icon);
        label.setText("Hello, Himawan!");
        label.setOpaque(true);
        Color paleGreen = new Color(152,251,152);
        label.setBackground(paleGreen);
        frame.add(label);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}