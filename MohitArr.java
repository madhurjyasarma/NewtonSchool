package com.newton;

import java.util.Arrays;
import java.util.Scanner;

public class MohitArr {
    // input num of elements --- 3
    // arr [num -1]
    // arr.sort
    // for(int i=0; i<num-1; i++ )
    // if(arr[0] == i)
    //      continue
    // else if(arr[i] != i)
    //      return i


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr1[] = new int[num - 1];
        for(int i = 0; i<num-1; i++){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        for(int i=1; i<num+1; i++){
            if(arr1[i-1] == i){
                continue;
            }else {
                System.out.println(i);
                break;
            }
        }
    }
}
