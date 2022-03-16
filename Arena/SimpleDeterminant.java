package com.Arena;

import java.util.Scanner;

public class SimpleDeterminant {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int arr[][] = new int[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int determinant = (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);
        System.out.println(determinant);

    }
}
