/*
PRACTICE EXERCISES E1.16
Type in and run the following program. Then modify it to print “Hello, name!”, displaying the name that the user typed in.
import javax.swing.JOptionPane;
public class DialogViewer
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
    }
}
---
Nama class dan file kita ubah dari DialogViewer menjadi E1)16.
Kalau kalian menggunakan perintah System.out.println(name), nama kalian hanya akan keluar di terminal, bukan jadi kotak yang terpop-up seperti di soal E1.15.
Jadi, perlu dimodifikasi dulu, disamakan dengan yang di E1.15.
*/

import javax.swing.JOptionPane;

public class E1_16
{
    public static void main(String[] args)
    {
        //Untuk memunculkan input dialog box
        String name = JOptionPane.showInputDialog("What is your name?");
        //Untuk memunculkan message box
        JOptionPane.showMessageDialog(null,"Hello, "+name+"!");
    }
}