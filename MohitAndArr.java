//sort both array
//arr, arrFinal (compare)
//if arr[i] == arrFinal[i]---->continue
//else--- print(i)
package com.newton;

import java.util.Scanner;

public class MohitAndArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elem = sc.nextInt();
        int arr[] = new int[elem];
        int arrFinal[] = new int[elem-1];
        //input
        for (int i=1; i<=elem; i++){
            arr[i-1] = i;
        }
        for (int i=1; i<= elem-1; i++){
            arrFinal[i-1] = sc.nextInt();
        }


        //print
//        for (int i=0; i<elem; i++){
//            System.out.print(arr[i] + " ");
//        }
        for (int i=0; i<=elem; i++){
            System.out.print(arrFinal[i] + " ");
        }
    }
}
