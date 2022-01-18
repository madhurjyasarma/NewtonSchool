import java.util.Scanner;

public class Fundamentals {
    public static void main(String[] args) {        /*              multiline comment
                                                     access modifier //static type object //returns nothing //main function
                                                    */

        Scanner sc = new Scanner(System.in);        //take input // Creating a new Scanner object i.e. sc.
        System.out.println("Input:");               // output

        int a, b;        //var declaration       // int of 4 bytes
        a = sc.nextInt();      // assigning 'a' to the Scanner object
        b = sc.nextInt();       //assigning 'b'

        long c;         // another int datatype // long is 8 bytes i.e. 64 bits

        c = a + b;      // assigning c // '+' is call an operator // + adds a and b and storing in c
        System.out.println("Addition of two numbers: " + c);        // printing c
    }
}