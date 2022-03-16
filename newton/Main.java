package com.newton;

import java.io.*; // for handling input/output
import java.util.*;
import java.math.BigInteger; // contains Collections framework
class Main {
    static int modInverse(int a, int m)
    {
        int m0 = m;
        int y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1) {

            int q = a / m;
            int t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }

        if (x < 0)
            x += m0;

        return x;
    }
    public static int binomialSum(int n){
        return (1<<n) - 1;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int m= 1000000007;
        int n= sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();

        int fact []= new int[n+1];
        fact[0]=1;

        for(int i=1;i<=n;i++){
            fact[i]= (i*fact[i-1])%m;
        }
        long n1=fact[n];
        int d1= modInverse(fact [n-a],m);
        int d2= modInverse(fact [a],m);
        int d3= modInverse(fact [n-b],m);
        int d4= modInverse(fact [b],m);

        long nca= ((n1*d1)%m*d2)%m;
        long ncb= ((n1*d3)%m*d4)%m;

        long candypair= binomialSum(n)-nca-ncb;
        System.out.println(candypair);
        // 3c0 3c1 3c2 3c3 === 2^3
        //

    }
}