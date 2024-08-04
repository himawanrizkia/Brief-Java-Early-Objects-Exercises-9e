/*
PROGRAMMING PROJECT P2-07
Write a program LotteryPrinter that picks a combination in a lottery.
In this lottery, players can choose 6 numbers (possibly repeated) between 1 and 49.
Construct an object of the Random class (see Exercise •• E2.13) and invoke an appropriate method to generate each number.
(In a real lottery, repetitions aren’t allowed, but we haven’t yet discussed the programming constructs that would be required to deal with that problem.)
Your program should print out a sentence such as “Play this combination—it’ll make you rich!”, followed by a lottery combination.
*/


import java.util.Random;

public class P2_07_LotteryPrinter
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int angka1 = rand.nextInt(48)+1;
        int angka2 = rand.nextInt(48)+1;
        int angka3 = rand.nextInt(48)+1;
        int angka4 = rand.nextInt(48)+1;
        int angka5 = rand.nextInt(48)+1;
        int angka6 = rand.nextInt(48)+1;

        System.out.println("Play this combination—it’ll make you rich!");
        System.out.print(angka1+" ");
        System.out.print(angka2+" ");
        System.out.print(angka3+" ");
        System.out.print(angka4+" ");
        System.out.print(angka5+" ");
        System.out.print(angka6+" ");
    }
}