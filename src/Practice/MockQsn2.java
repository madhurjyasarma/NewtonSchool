/*Problem 2:
You are given an unsorted array with both positive and negative elements. You have to find the smallest positive number missing from the array.
Input:  {2, 3, 7, 6, 8, -1, -10, 15}
Output: 1
Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
Output: 4
Input: {1, 1, 0, -1, -2}
Output: 2*/
package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MockQsn2 {
    static void findSmallest(int arr[]) {
        // sort the arr
        //
        // go through the arr
        // if the i element is greater then 1
        //

        int arrLength = arr.length;
        Arrays.sort(arr);       // nLog(n)
        int maxElem = arr[arrLength - 1];
        int finalArr[] = new int[maxElem];

        int fill = 1;
        for (int i = 0; i < finalArr.length; i++) {
            finalArr[i] = fill;
            fill++;
        }
        // printing finalarr
        for (int i = 0; i < finalArr.length; i++) {
            System.out.print(finalArr[i] + " ");
        }


        // printing the arr

        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");

//            if ((arr[i] >= 0) && (arr[i] != (arr[i] - 1))){
//                System.out.print(arr[i]+" ");
//                return;
//            }

//            if (arr[i] > 0){
//                if (arr[i] != arr[i] - 1){
//                    System.out.print(arr[i] -1);
//                    return;
//                }
//            }
//            else {
//                continue;
//            }
//        }

//            while (arr[i]>0){
//                if (arr[i] ! )
//            }

        }

    }

    public static void main(String[] args) {
        int arr1[] = new int[]{2, 3, 7, 6, 8, -1, -10, 15};
        findSmallest(arr1);
    }
}

