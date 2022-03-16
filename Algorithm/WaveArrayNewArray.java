package com.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArrayNewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();


        int arr[] = new int[total -1];
        int arrFinal[] = new int[total-1];

        for(int i=0; i<total-1; i++){
            arr[i] = sc.nextInt();
        }

        if(total%2 == 0){
            Arrays.sort(arr);
            for (int i=0; i<arr.length; i+=2){
//                int temp;
                arrFinal[i] = arr[i+1];
                arrFinal[i+1] = arr[i];
            }


        }
        for (int i=0; i<arrFinal.length; i++){
            System.out.print(arrFinal[i]+" ");
        }

    }
}
