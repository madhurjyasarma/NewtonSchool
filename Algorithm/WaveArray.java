package com.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int total = sc.nextInt();
            int arr[] = new int[total+1];
            //input loop
            for(int i=0; i<total; i++){
                arr[i] = sc.nextInt();
            }
            int lastElem = arr[total - 1];

            Arrays.sort(arr);

            // swap
            for(int i=0; i<total; i+=2){
                int temp;
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

            //printing loop
            for(int i=0; i<total-1; i++){
                if(total%2 == 0){
                    System.out.print(arr[i] + " ");
                }
                else{
                    System.out.print(arr[i] + " ");
                }
            }
            if(total%2 !=0){
                System.out.print(lastElem);
            }
    }
}
