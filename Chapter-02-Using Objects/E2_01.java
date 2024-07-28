/* PRACTICE EXERCISES E2_01
Write a program that initializes a string with "Mississippi".
Then replace all "i" with "ii" and print the length of the resulting string.
In that string, replace all "ss" with "s" and print the length of the resulting string.
*/

public class E2_01
{
    public static void main(String[] args)
    {
        String word = "Mississippi";

        //Rekayasa Teks Pertama
        String word_1 = word.replace("i","ii");
        int word_1_length = word_1.length();

        System.out.println(word_1);
        System.out.println("Characters length: "+word_1_length);

        //Rekayasa Teks Kedua
        String word_2 = word_1.replace("ss","s");
        int word_2_length = word_2.length();

        System.out.println(word_2);
        System.out.println("Characters length: "+word_2_length);
    }
}
