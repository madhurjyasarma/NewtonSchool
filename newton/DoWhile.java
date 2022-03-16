package com.newton;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("List of operations: \n1.Addition \n2.Subtraction: ");

            byte operations = sc.nextByte();
            switch (operations) {
                case 1:
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Addition: " + (a + b));
                    break;
                case 2:
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("Subtraction: " + (x - y));
                    break;
                default:
                    System.out.println("Please enter a valid number. i.e. (1/2)");
            }

            System.out.println("You want to continue?\nPress (Y/N): ");
            ch = sc.next().toLowerCase(Locale.ROOT).charAt(0);
        } while (ch == "y".charAt(0));
    }
}
