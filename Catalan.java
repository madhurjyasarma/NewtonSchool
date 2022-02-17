package com.newton;

import java.util.Scanner;

public class Catalan {
    static long factorial(long n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int m = 1000000007;
        int t = sc.nextInt();
        int arr[] = new int[t];
        int arrFinal[] = new int[t];

        for(int i=0; i<t; i++){
            arr[i] = sc.nextInt();
            //            long result = (factorial(2 * arr[i]) / (factorial(arr[i] + 1) * factorial(arr[i])) % m);

        }
        for (int i=0; i<t; i++){
            arrFinal[i] = (int) (factorial(2 * arr[i]) / (factorial(arr[i] + 1) * factorial(arr[i])) % m);
        }
        for(int i=0; i<t; i++){
            System.out.println(arrFinal[i]);
        }
    }
}