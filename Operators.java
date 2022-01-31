/*
Operators in java
These are Arithmatic operators
Madhurjya Sarma this side
*/

public class Operators {
    public static void main(String[] args) {
        int a = 10, b=4, res;

        System.out.println("a is: " + a +"\n" + "b is: " + b );

        //addition
        res = a + b;
        System.out.println("addition of these numbers: " + res );

        //sub
        res = a-b;
        System.out.println("sub: " +res);

        //mul
        res = a * b;
        System.out.println("Mul: " + res);

        // div
        res = a / b;
        System.out.println("div: " + res);

        //mod
        res = a % b;
        System.out.println("Mod: " + res);

        System.out.println("Result initially: 0 ");

        // increment
        res = 0;
        res ++;
        System.out.println("Increment: " + res);

        // decrement
        res --;
        System.out.println("decrement: " + res);

    }
}