/*
PRACTICE EXERCISES E1.17
Modify the program from Exercise E1.16 so that the dialog continues with the message
“My name is Hal! What would you like me to do?”

Discard the user’s input and display a message such as
I'm sorry, Dave. I'm afraid I can't do that.

Replace Dave with the name that was provided by the user.
*/

import javax.swing.JOptionPane;

public class E1_17
{
    public static void main(String[] args)
    {
        //Untuk memunculkan dialog box untuk input nama
        String name = JOptionPane.showInputDialog("What is your name?");
        //Untuk memunculkan dialog box untuk input order. Karena akan gak kepakai, mungkin sementara ini gpp untuk tidak set nama variabelnya dulu.
        JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
        //Untuk memunculkan message box permohonan maaf
        JOptionPane.showMessageDialog(null,"I'm sorry, "+name+". I'm afraid I can't do that.");
    }
}