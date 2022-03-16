package com.savage;

import java.util.Scanner;

public class HipHipArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int[] reversedArr = new int[length];

        for (int i=length-1; i>=0; i--){
            reversedArr[length-i-1] = arr[i];
        }
        int sum =0;
        long prduct =1;
        for (int i=0; i<length; i++){
            if(i%2 == 0){
                sum += arr[i];
            }
            else{
                prduct *= arr[i];
            }
        }
        System.out.println(sum + " " + prduct);
    }
}
