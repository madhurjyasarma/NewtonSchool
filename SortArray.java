package com.savage;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[size-1]+" "+arr[size-2]+" "+arr[size-3]);
        }
    }
}
