/*
 * PROGRAMMING PROJECT P2-15
 * Write a graphical program that draws a traffic light.
 * 
 * Hasil dari tugas ini adalah dua file yaitu P2_15_TrafficLightViewer.java dan P2_15_TrafficLightComponent.java
 */


import javax.swing.JFrame;

public class P2_15_TrafficLightViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(500,600);
        frame.setTitle("Traffic Light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        P2_15_TrafficLightComponent component = new P2_15_TrafficLightComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
