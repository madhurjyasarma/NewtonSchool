/*Sample Input
5
1 2 3 4 5

Sample Output
17

Explanation
(5-1)xor1 = 5, (5-2)xor2 = 1, (5-3)xor3 = 1, (5-4)xor4 = 5, (5-5)xor5 = 5.

Sample Input
5
1 1 0 4 6

Sample Output
20
*/

package com.newton;

import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNum = sc.nextInt();
        int arr[] = new int[totalNum+1];
        int result = 0;

        //input arr
        for (int i=0; i<totalNum; i++){
            arr[ i] = sc.nextInt();
        }


        //output
        for (int j=0; j<totalNum-1; j++){
//            result += ((totalNum - arr[j]) ^ arr[j]);
            int part = (totalNum - j);
            result += (part ^ arr[j]) -1;
        }

        System.out.println(result);
    }
}
