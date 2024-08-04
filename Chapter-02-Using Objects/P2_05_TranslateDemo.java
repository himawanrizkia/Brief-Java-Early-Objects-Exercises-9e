/*
 * PROGRAMMING PROJECT P2-05
 * Baca instruksi di buku (Read the instruction of book)
 */

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class P2_05_TranslateDemo
{
    public static void main(String[] args)
    {
        // Construct a frame and show it
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // Your work goes here: Construct a rectangle and set the frame bounds
        Rectangle box = new Rectangle(100,100,300,400);
        frame.setBounds(box);
        
        JOptionPane.showMessageDialog(frame, "Click OK to continue");
        
        // Your work goes here: Move the rectangle and set the frame bounds again
        box.translate(400,500);
        frame.setBounds(box);
    }
}

