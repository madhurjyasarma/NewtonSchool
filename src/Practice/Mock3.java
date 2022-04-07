/*
* Problem 1:
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
Example 1:
Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation: 0s 1s and 2s are segregated into ascending order.


Problem 2:
You are given an unsorted array with both positive and negative elements. You have to find the smallest positive number missing from the array.
Input:  {2, 3, 7, 6, 8, -1, -10, 15}
Output: 1
Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
Output: 4
Input: {1, 1, 0, -1, -2}
Output: 2*/


package Practice;

import java.util.Scanner;

public class Mock3 {
    static void sortZero(int arr[]){
        // arr = 0 2 1 2 0
        // go through the arr
        // find number of 0,1,2
        // print the number of 0 1 and 2
        int zero = 0;
        int one = 0;
        int two = 0;

        int arrLength = arr.length;
        int finalarr[] = new int[arrLength];

        for (int i=0; i<arrLength; i++){
            if (arr[i] == 0){
                zero++;
                continue;
            }
            else if (arr[i] == 1){
                one++;
                continue;
            }
            else if (arr[i] == 2){
                two++;
                continue;
            }

        }
//        System.out.println(zero);
//        System.out.println(one);
//        System.out.println(two);

        for (int i=0; i<arrLength; i++){
            if (zero != 0){
                while (zero --> 0){
                    finalarr[i] = 0;
                    break;
                }
            }
            else if (one != 0){
                while (one --> 0){
                    finalarr[i] = 1;
                    break;
                }
            }
            else if (two !=0){
                while (two --> 0){
                    finalarr[i] = 2;
                    break;
                }
            }
        }

        for (int i=0; i<arrLength; i++){
            System.out.print(finalarr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
//        int arr[] = new int[]{0, 2, 1, 2, 0};
        sortZero(arr);
    }
}
