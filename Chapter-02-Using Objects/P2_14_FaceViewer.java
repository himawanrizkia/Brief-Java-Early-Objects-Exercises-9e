/*
 * PROGRAMMING PROJECT P2-14
 * Write a program to plot the face at right. Provide a class FaceViewer and a class FaceComponent.
 * 
 * Nama class kami modifikasi menjadi P2_14_FaceViewer dan P2_14_FaceComponent
 */

import javax.swing.JFrame;

public class P2_14_FaceViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(700,700);
        frame.setTitle("Face Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        P2_14_FaceComponent component = new P2_14_FaceComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}