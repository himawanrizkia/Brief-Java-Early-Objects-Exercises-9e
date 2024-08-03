import javax.swing.JFrame;
public class E2_19_TwoSquareViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setTitle("Two Square Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        E2_19_TwoSquareComponent component = new E2_19_TwoSquareComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}