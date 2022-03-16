package com.newton;

import java.util.Scanner;

public class TwoDMatrixBoundary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0){

            int row = sc.nextInt();
            int colm = sc.nextInt();
            int arr[][] = new int[row][colm];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colm-i; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colm; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
}
