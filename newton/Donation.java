package com.newton;

import java.util.Scanner;

public class Donation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size];

        //populate the array
        for(int i=0; i<size; i++) {
            if(arr[i]<=100000){
                arr[i] = sc.nextInt();
            }else {
                System.exit(0);
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
        sc.close();
    }
}
