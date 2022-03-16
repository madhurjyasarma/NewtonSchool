package com.newton;

import java.math.BigInteger;
import java.util.Scanner;

import static java.math.BigInteger.valueOf;

public class DivThree {
    static boolean check(String str)
    {
        // Compute sum of digits
        int n = str.length();
        int digitSum = 0;
        for (int i=0; i<n; i++)
            digitSum += (str.charAt(i)-'0');

        // Check if sum of digits is
        // divisible by 3.
        return (digitSum % 3 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(check(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
