package com.newton;

import java.util.Scanner;

public class XorNew {
    static long pairORSum(int[] arr, int n)
    {
        // Initialize result
        long ans = 0;

        // Consider all pairs (arr[i], arr[j)
        // such that i < j
        for (int i = 0; i < n; i++)
//            for (int j = i + 1; j < n; j++)
                ans += (n - (i+1)) ^ arr[i];

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(pairORSum(arr,n));

//        for (int i=0; i<n; i++){
//            System.out.print(arr[i] +" ");
//        }
    }
}
