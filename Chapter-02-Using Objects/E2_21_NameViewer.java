import javax.swing.JFrame;

public class E2_21_NameViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(140,90);
        frame.setTitle("Name Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        E2_21_NameComponent component = new E2_21_NameComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}