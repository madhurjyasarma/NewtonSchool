package com.newton;

import java.util.Scanner;


public class CatalanNum {
    static int factorial(int n){
        if(n ==0)
            return 1;
        if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNum = sc.nextInt();
        final int m = 1000000007;
        for(int i=0; i<totalNum; i++){
            int num = sc.nextInt();
            int result;
            result = (factorial(2*num) / factorial(num+1) * factorial(num));
            System.out.println(result);

        }

    }
}
