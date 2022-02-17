package com.newton;

import java.util.Scanner;

public class NewCar {
    public static long fact(int i) {
        if(i <= 1) {
            return 1;
        }
        return i * fact(i - 1);
    }
    public static void main (String[] args) {
        final int mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextByte();
        for(long i=0; i<t; i++ ){
            int n = sc.nextInt();
//            long result = fact()

        }

    }
}
