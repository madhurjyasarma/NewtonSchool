package com.newton;

import java.util.Arrays;
import java.util.Scanner;

public class pairEmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // for even num
        if(size % 2 == 0)
        {
//            int max = 0;
            int arr[] = new int[size];
//            int arrFinal[] = new int[size];
            //input in arr
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            // sort the array
            Arrays.sort(arr);

//            for(int i=0; i<size; i++){
//                System.out.print(arr[i] + " ");
//            }

            // (1,1) 2    (1,3) 4   (1, 4) 5
            //  min elem + last elem
            System.out.println(arr[0] + arr[size-1]);


//            for(int x=0; x<size; x++ ){
//                arrFinal[x] = arr[x] + arr[size-1];
//            }
//            System.out.println();
//            for(int i=0; i<size; i++){
//                System.out.print(arrFinal[i] + " ");
//            }


        }
    }
}
