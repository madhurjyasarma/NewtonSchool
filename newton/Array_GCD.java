package com.newton;

public class Array_GCD {

    static int gcd(int a, int b){
        if(a == 0) return b;
        if(b == 0) return a;
        if(a>b) return gcd(a-b,b);
        else return gcd(a,b-a);
    }

    public static void main(String[] args) {
        // given int a of size N
        // int i =0; i <= N; i++
        // find arr_index [ j ]
        // gcd( i, j)
        // and abs( i - j )
        // if no [j] return -1
        // --------------------------
        // approach 1
        // elem input
        // int array [elem + 2]
        // arr input

        // for(int i = 1; i <= N; i++)
        //      gcd(arr[i],arr[i+1])
        // return
    }
}
