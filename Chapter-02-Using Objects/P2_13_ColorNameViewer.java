/*
 * PROGRAMMING PROJECT P2-13
 * Write a graphics program that draws 12 strings, one each for the 12 standard colors (except Color.WHITE),
 * each in its own color. Provide a class ColorNameViewer and a class ColorNameComponent.
 * 
 * Nama class kami modifikasi menjadi P2_13_ColorNameViewer dan P2_13_ColorNameComponent
 */

import javax.swing.JFrame;

public class P2_13_ColorNameViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(400,600);
        frame.setTitle("Color Name Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        P2_13_ColorNameComponent component = new P2_13_ColorNameComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}