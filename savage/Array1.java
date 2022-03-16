package com.savage;

import java.util.Scanner;

public class Array1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];   //
        int arrRev[] = new int[num];
        int evenAdd = 0;
        int oddMul = 1;
        //input
        for(int i=0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i< arr.length; i++){
            if(i%2 == 0){
                evenAdd += arr[i];
            }else{
                oddMul *= arr[i];
            }

        }
        for(int i=arr.length; i<=0; i--){
            i = arrRev[i];
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arrRev[i]+ " ");
        }
        System.out.print(evenAdd + " "+ oddMul);

    }
}
