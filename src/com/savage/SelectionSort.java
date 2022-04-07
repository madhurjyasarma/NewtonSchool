package com.savage;

public class SelectionSort {
    static void printArr(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    static void selectionSort(int arr[]){
        for (int i=0; i< arr.length-1; i++){
            int smallest = i;
            for (int j=i+1; j< arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,8,1,2,3};

        selectionSort(arr);
        printArr(arr);


    }
}
