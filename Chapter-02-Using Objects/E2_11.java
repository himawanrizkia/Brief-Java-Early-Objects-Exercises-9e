/* PRACTICE EXERCISE E2_11
 * Repeat Exercise •• E2.10, but place your code into the following class.
 * Then the color will be displayed.
 * 
 * ---
 * Langsung eksekusi lengkapi deklarasi statement my color mengacu pada exercise E2_10
 */



import java.awt.Color;
import javax.swing.JFrame;
public class E2_11
{
    public static void main(String[] args)
    {
        //Buat frame, dan tampilkan
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        Color myColor = new Color(50,100,200);
        myColor = myColor.brighter();
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}