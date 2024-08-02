/* PRACTICE EXERCISES E2_07
Write a program ReplaceTester that encodes a string by replacing all letters "i" with "!" and all letters "s" with "$".
Use the replace method. Demonstrate that you can correctly encode the string "Mississippi".
Print both the actual and expected result.

Nama program diganti menjadi E2_07
*/

public class E2_07
{
    public static void main(String[] args)
    {
        String kata = "Mississippi";
        String kata1 = kata.replace("i","!");
        String kata2 = kata1.replace("s","$");
        System.out.println("Hasilnya: "+kata2);
        System.out.println("Expected result : M!$$!$$!pp!");
    }
}