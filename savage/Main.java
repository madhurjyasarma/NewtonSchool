package com.savage;

import java.util.Scanner;

class Main{
    int maxIndexDiff(int arr[], int n)
    {
        int maxDiff = -1;
        int i, j;

        for (i = 0; i < n; ++i) {
            for (j = n - 1; j > i; --j) {
                if (arr[j] > arr[i] && maxDiff < (j - i))
                    maxDiff = j - i;
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int elem = sc.nextInt();
        int arr[] = new int[elem];
        for (int i = 0; i <= elem-1; i++) {
            arr[i] = sc.nextInt();
        }
        Main max = new Main();
//        int arr[] = { 9, 2, 3, 4, 5, 6, 7, 8, 18, 0 };
        int n = arr.length;
        int maxDiff = max.maxIndexDiff(arr, n);
        System.out.println(maxDiff);
    }
}