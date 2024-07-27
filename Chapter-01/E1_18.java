/*
PRACTICE EXERCISES E1.18

Type in and run the following program. Then modify it to show a different greeting and image.

import java.net.URL;
import javax.swing.ImageIcon; import javax.swing.JOptionPane;
public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif"); JOptionPane.showMessageDialog(null, "Hello", "Title",
        JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
---
1. Nama class dan file kita ubah jadi E1_18
2. URL("String") sudah depreciated sejak Java 20 dan perlu diganti dengan cara lain yaitu memakai URI("alamat webnya").toURL()
3. Jangan lupa untuk import java.net.URI juga

*/
import java.net.URL;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class E1_18
{
    public static void main(String[] args) throws Exception
    {
        // Dimana letak filenya?
        URL imageLocation = new URI("https://www.kemdikbud.go.id/main/addons/shared_addons/themes/november_theme/img/kemdikbud_64x64.png").toURL();
        // Setting Message Dialognya. Nama jendela kita set sebagai title, ucapan: "Selamat Datang", dan tampilan ImageIcon yang dapat diakses di imageLocation yang sudah dideclare di awal.
        JOptionPane.showMessageDialog(null,"Selamat datang!","Title",JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}



