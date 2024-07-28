/* PRACTICE EXERCISES E2_02
Look into the API documentation of the String class and locate the trim method.
Write a program demonstrating what it does. Then show how you can use the replace method to remove all spaces from a string.

*/

public class E2_02
{
    public static void main(String[] args)
    {
        // Input
        String word = " Selamat datang di Jakarta Raya. ";
        int word_length = word.length();
        System.out.println("Kata/kalimat yang akan diproses:");
        System.out.println(word);
        System.out.println("Jumlah karakter: " + word_length);

        // Triming
        String word_aftertrim = word.trim();
        int word_aftertrim_length = word_aftertrim.length();
        System.out.println("Hasil triming:");
        System.out.println(word_aftertrim);
        System.out.println("Jumlah karakter: " + word_aftertrim_length);

        //Remove all spaces in string
        String word_removeSpace = word.replace(" ","");
        System.out.println("Setelah spasinya dihilangkan semua:");
        System.out.println(word_removeSpace);
    }
}