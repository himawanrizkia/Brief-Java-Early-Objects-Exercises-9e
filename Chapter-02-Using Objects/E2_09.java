/* PRACTICE EXERCISES E2_09


The StringBuilder class has a method for reversing a string.
In a ReverseTester class, construct a StringBuilder from a given string (such as "desserts"), call the reverse method followed by the toString method, and print the result.
Also print the expected value.

Nama ReverseTester diubah menjad E2_09
*/

public class E2_09
{
    public static void main(String[] args)
    {
        StringBuilder kata = new StringBuilder("desserts");
        String kataReversed = kata.reverse().toString();
        System.out.println(kataReversed);
        System.out.println("Expected result : stressed");
    }
}