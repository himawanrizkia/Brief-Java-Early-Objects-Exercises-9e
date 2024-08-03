import javax.swing.JFrame;
public class E2_20_TwoSquareViewer
{
    public static void main(String[] args)
    {
        //Ciptakan object
        JFrame frame = new JFrame();

        //Set ukuran jendela dan judulnya
        frame.setSize(500,800);
        frame.setTitle("Two Square Viewer");

        //Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //masukan komponen
        E2_20_TwoSquareComponent component = new E2_20_TwoSquareComponent();
        frame.add(component);

        //set frame agar muncul
        frame.setVisible(true);
    }
}