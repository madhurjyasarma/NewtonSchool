//package com.newton;
//
//import java.util.Scanner;
//
//public class DiagonalSum {
//    static void printDiagonalSums(int [][]mat, int n)
//    {
//        int principal = 0, secondary = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//
//                // Condition for principal
//                // diagonal
//                if (i == j)
//                    principal += mat[i][j];
//
//                // Condition for secondary
//                // diagonal
//                if ((i + j) == (n - 1))
//                    secondary += mat[i][j];
//            }
//        }
//
//        System.out.print(principal+" ");
//
//        System.out.print(secondary);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[][] = new int[n][n];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        printDiagonalSums(arr,n);
//
//
//    }
//}
