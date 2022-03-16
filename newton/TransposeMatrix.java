package com.newton;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original[][] = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                original[i][j] = sc.nextInt();
            }
        }

//        int original[][]={{1,3,4},{2,4,3},{3,4,5}};

//        System.out.println("Printing Matrix without transpose:");

//
//        for(int i=0;i< original.length;i++){
//            for(int j=0;j< original.length;j++){
//                System.out.print(original[i][j]+" ");
//            }
//            System.out.println();//new line
//        }

//        System.out.println("Printing Matrix After Transpose:");
        for(int i=0;i<original.length;i++){
            for(int j=0;j< original.length;j++){
                System.out.print(original[j][i]+" ");
            }
            System.out.println();//new line
        }
    }
}
