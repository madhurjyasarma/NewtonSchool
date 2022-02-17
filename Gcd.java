package com.newton;

import java.util.Scanner;

public class Gcd {
    static long gcd(long a, long b){
        if(a==0)
            return b;
        if(b==0)
            return a;
        if(a==b)
            return a;
        if (a>b)
            return gcd(a-b,b);
        return gcd(a,b-a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(gcd(a,b));
    }
}
