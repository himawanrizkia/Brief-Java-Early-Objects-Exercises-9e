/*
PROGRAMMING PROJECT P2-12
Repeat Exercise ••• Testing P2.11, but now write a graphical application that shows the line and the points.
Draw each point as a tiny circle. Use the drawString method to draw each distance next to the point, using calls
g2.drawString("Distance: " + distance, p.getX(), p.getY());
*/

import javax.swing.JFrame;

public class P2_12_viewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(900,900);
        frame.setTitle("P2_12_Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        P2_12_component component = new P2_12_component();
        frame.add(component);
        frame.setVisible(true);
    }
}