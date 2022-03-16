package com.newton;

import java.util.*;
class SaraswatiPuja {
    //function for inverse of mod
    static int modInverse(int a, int m)     // parameter a, m
    {
        for (int x = 1; x < m; x++)     // From 1 to m-1
            if (((a%m) * (x%m)) % m == 1)   // Logic
                return x;
        return 1;
    }

    //Driver Code
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Approach 1
        int x = sc.nextInt(); // Scanner Object

        int arr[] = new int[(x*2)+1];   //  arr[size = (2*2)+1] //i.e. arr[5]

        //Input for loop
        for(int i=0; i<(arr.length)-1; i++) {    // From 0 to arr.length, i++
            arr[i] = sc.nextInt();          //input at index arr[0 - arr.length]
        }
        for(int y=0; y<(arr.length)-1; y++) {
            int result = 0;
            int num1 = arr[y];
            int num2 = arr[y + 1];
            result = modInverse(num1, num2);
            System.out.println(result);
            y++;
        }
    }
}

