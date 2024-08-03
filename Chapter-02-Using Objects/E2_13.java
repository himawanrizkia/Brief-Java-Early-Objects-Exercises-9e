/*
PRACTICE EXERCISES E2_13
The Random class implements a random number generator, which produces sequences of numbers that appear to be random.
To generate random integers, you construct an object of the Random class, and then apply the nextInt method.
For example, the call generator.nextInt(6) gives you a random number between 0 and 5.
Write a program DieSimulator that uses the Random class to simulate the cast of a die,
printing a random number between 1 and 6 every time that the program is run.

--
Nama program kita ubah dari DieSimulator jadi E2_13
*/
import java.util.Random;

public class E2_13
{
    public static void main(String[] args)
    {
        // memunculkan random class
        Random rand = new Random();

        // memunculkan random number 0 s.d. 5 nanti ditambah 1
        int dice = rand.nextInt(6)+1;

        // cetak nilai dadu
        System.out.println("Nilai dadu :"+dice);
    }
}