/*
PROGRAMMING PROJECT P2-06
The BigInteger class represents integer numbers with an arbitrary number of digits.
(As you will see in Chapter 4, the int type cannot express very large integers.)
You can construct a BigInteger object by providing a string of its digits, such as
BigInteger a = new BigInteger("12345678987654321");
Write a program that prints the square, fourth power, and eighth power of a, using one of the methods of the BigInteger class.
*/

import java.math.BigInteger;
public class P2_06
{
    public static void main(String[] args)
    {
        BigInteger a = new BigInteger("12345678987654321");
        BigInteger aPangkat2 = a.multiply(a);
        BigInteger aPangkat4 = aPangkat2.multiply(aPangkat2);
        BigInteger aPangkat8 = aPangkat4.multiply(aPangkat4);

        System.out.println("a^2 = "+aPangkat2);
        System.out.println("a^4 = "+aPangkat4);
        System.out.println("a^8 = "+aPangkat8);
    }
}