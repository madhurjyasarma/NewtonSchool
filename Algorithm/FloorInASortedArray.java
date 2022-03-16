package com.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

class FloorInASortedArray{
    static int floorSearch(int arr[], int n, int x)
    {
        // If last element is smaller than x
        if (x >= arr[n - 1])
            return n - 1;

        // If first element is greater than x
        if (x < arr[0])
            return -1;

        // Linearly search for the first element
        // greater than x
        for (int i = 1; i < n; i++)
            if (arr[i] > x)
                return (i - 1);

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->-0)
        {
            int size = sc.nextInt();
            int arr[] = new int[size+1];
            int x = sc.nextInt();
            for (int a =0; a<size; a++)
            {
                arr[a] = sc.nextInt();
            }
//            System.out.println();
            int result = floorSearch(arr, size, x);
            System.out.println(result);
        }
        System.out.println();

    }
}