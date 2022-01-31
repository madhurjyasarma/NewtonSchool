package com.savage;

import java.util.Scanner;
//1 <= n <= 100000
//0 <= money <= 100000

public class FuckinEdgeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size];

        //populate the array

        for(int i=0; (i<size) && (arr[i]<=100000); i++) { //this
            if(arr[i]<=100000){
                arr[i] = sc.nextInt();
            }else{
                break;
            }

        }
        int highest_elem=arr[0];

        for (int i=1; i<size; i++) {
            if(arr[i]>highest_elem && arr[i]>arr[i-1]) {
                if(highest_elem<arr[i]) {
                    highest_elem = arr[i];
                }

                // do nothing

            } else {
                arr2[i] = highest_elem - arr[i];
                if(highest_elem<arr[i]) {
                    highest_elem = arr[i];
                }
            }
        }



        int sum =0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        for(int i=0; i<arr2.length; i++) {
            sum += arr2[i];
        }

        for (int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.print('\n');
        System.out.println(sum);
    }
}
