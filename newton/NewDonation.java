/*Sample Input:-
10
1 2 3 2 4 3 6 6 7 6

Sample Output:-
0 0 0 1 0 1 0 0 0 1
43

Sample Input:-
7
10 20 30 40 30 20 10

Sample Output:-
0 0 0 0 10 20 30
220
*/
package com.newton;

import java.util.Scanner;

public class NewDonation {
    public static void main(String[] args) {
        // input size
        // create arr [size + 1 ]
        // create arrFinal [size + 1 ]
        // input in arr
        // int total = 0;
        // for(i=0; i<size; i++)
        //      if(arr[i]<arr[i+1])
        //          arrFinal[i] = 0;
        //      else
        //          arrFinal[i] = arr[i+1] - total

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size +1];
        int arrFinal[] = new int[size+1];

        // input in arr loop
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int total = arr[0];
        for (int x =0; x<size; x++)
        {
            if (arr[x] < arr[x+1])
            {
                arrFinal[x] = 0;
                total = arr[x+1];
                System.out.println(total);
            }
            else
            {
                total = total - arr[x];
            }
        }

        for(int i=0; i<size; i++)
        {
            System.out.print(arrFinal[i] + " ");
        }

    }
}
