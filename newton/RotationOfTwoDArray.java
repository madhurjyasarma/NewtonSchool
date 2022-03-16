package com.newton;

import java.util.Scanner;

public class RotationOfTwoDArray {
//    static int[][] rotation(int[][] arr) {
//        int arrFinal[][] = new int[2][2];
//        // int temp = arr[0][1];
//        arrFinal[0][0] = arr[0][1];
//        arrFinal[0][1] = arr[1][1];
////        System.out.println();
//        arrFinal[1][1] = arr[1][0];
//        arrFinal[1][0] = arr[0][0];
//
//        System.out.print(arrFinal[0][0] + arrFinal[0][1]+"\n");
//        System.out.print(arrFinal[1][0] + arrFinal[1][1]+"\n");
//
//        return arrFinal;
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr_dimention = 2;
        int rotation_num = sc.nextInt();
        int arr[][] = new int[2][2];
        int arrFinal[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        arrFinal[0][0] = arr[0][1];
        arrFinal[0][1] = arr[1][1];
//        System.out.println();
        arrFinal[1][1] = arr[1][0];
        arrFinal[1][0] = arr[0][0];

        System.out.print(arrFinal[0][0] + arrFinal[0][1]+"\n");
        System.out.print(arrFinal[1][0] + arrFinal[1][1]+"\n");

        while (rotation_num-- > 0) {
            for(int i=0; i<2; i++){
                for(int j=0;j<2; j++){
                    System.out.println(arrFinal[i][j]);
                }
            }
            System.out.println();

        }

    }
}
