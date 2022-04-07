/*
4,5,1,2,3

1,2,3,4,5
2,3,4,5,1

* */


package com.savage;

import java.util.Scanner;

public class Mock {
    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rightRotateArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // last -> first(Swap)
            int temp = arr[i];
            arr[i] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
    }

    static void leftRotateArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // first -> last
            int temp = arr[arr.length - 1];
            arr[arr.length - 1] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        int T = sc.nextInt();
        if (T > 0) {
            while (T-- > 0) {
                rightRotateArr(arr);
            }
        }
            printArr(arr);
    }
}
