package com.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

/*
* Passed all test cases
* */

public class WaveONLogN {
   static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    static void sortInWave(int arr[], int n)
    {
        Arrays.sort(arr);
        // Traverse all even elements
        for (int i = 0; i < n; i+=2)
        {
            // If current even element is smaller
            // than previous
            if (i>0 && arr[i-1] > arr[i] )
                swap(arr, i-1, i);

            // If current even element is smaller
            // than next
            if (i<n-1 && arr[i] < arr[i+1] )
                swap(arr, i, i + 1);
        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int n = arr.length;

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i+" ");
    }

}
