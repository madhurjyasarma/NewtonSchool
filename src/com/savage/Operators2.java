package com.savage;

public class Operators2 {
    public static void main(String[] args) {
        int x,y;
        x = 100;
        y = 50;

        // Assignment operators

        x = y;
        System.out.println(x);  // x is 50

        x += y;     // x = x + y // x is 100
        System.out.println(x);

        x -= y;     // x = x -y // x is 50
        System.out.println(x);

        x *= y;     // x = x * y // x is 2500
        System.out.println(x);

        x /= y;     // x = x / y // x is 50
        System.out.println(x);

        x %= y;     // x = x % y // x is 0
        System.out.println(x);


        // Bitwise Operators

        /*
        a = 5 = 0101 (In Binary)
        b = 7 = 0111 (In Binary)

        Bitwise OR Operation of 5 and 7
            0101
          | 0111
          ________
            0111  = 7 (In decimal)
        */

        byte a = 5;
        byte b = 7;

        byte c1 = (byte) (a & b);
        System.out.println(c1);

        byte c2 = (byte) (a | b);
        System.out.println(c2);

        x &= y;     // x = x & y // x is 0 // And
        System.out.println(x);

        x |= y;     // x = x | y // x is 50 // Or
        System.out.println(x);

        x ^= y;     // x = x ^ y // x is 0 // xor
        System.out.println(x);

        x >>= y;    // x = x >> y // x is 0 //
        System.out.println(x);

        x <<= y;    // x = x << y // x is 0
        System.out.println(x);

    }
}
