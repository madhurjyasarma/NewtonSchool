package com.Algorithm;

import java.util.Scanner;

public class BinarySearch2 {
    int binarySearch(int arr[], int left, int right, int target)
    {
        if(left<=right)
        {
            int middle = left + (right -1) / 2;
            if (arr[middle] == target)
            {
                return middle;
            }
            if(target<=middle)
            {
                binarySearch(arr, left,middle-1,target);
            }
            return binarySearch(arr, middle+1,right, target);
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BinarySearch bs = new BinarySearch();
        System.out.println("Enter Size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements below: ");
        int arr [] = new int[size+1];
        for (int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number to find: ");
        int target = sc.nextInt();
        int result = bs.binarySearch(arr,0,size-1,target);
        System.out.println("Number at index: " + result);
    }
}
