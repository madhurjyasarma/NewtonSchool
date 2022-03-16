package com.Arena;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElemInsertion {
    static int[] copyArray(int arrOriginal[]){
        int finalArr[] = new int[arrOriginal.length + 1];
        for (int i=0; i< arrOriginal.length; i++){
            finalArr[i] = arrOriginal[i];
        }
        return finalArr;
    }
    static int[] insertLastElem(int[] array, int element)
    {
        int result[] = copyArray(array);
        result[result.length - 1] = element;
        return result;
    }
    static void printArray(int [] arr){
         for (int i=0; i<arr.length;i++){
             System.out.print(arr[i] + " ");
         }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T --> 0)
        {
            int size = scan.nextInt();
            int element = scan.nextInt();
            int array[] = new int[size];
            for (int i=0; i<array.length; i++){
                array[i] = scan.nextInt();
            }
            int outputArray[] = insertLastElem(array,element);
            printArray(outputArray);

        }

    }
}
