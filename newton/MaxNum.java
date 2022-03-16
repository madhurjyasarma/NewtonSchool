/*Sample Input:
3
5
1 4 2 4 5
6
1 3 5 7 9 8
7
11 22 33 44 55 66 77

Sample Output:
5 4 4
9 8 7
77 66 55

Explanation(might now be the optimal solution):
Testcase 1:
[1 4 2 4 5]
First max = 5
Second max = 4
Third max = 4
*/

package com.newton;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArr = sc.nextInt();
        while (numArr --> 0) {
            int elem = sc.nextInt();
            int arr[] = new int[elem + 1];
            for (int i = 0; i < elem; i++) {
                arr[i] = sc.nextInt();
            }
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                int current = arr[i];
                if (first < current) {
                    third = second;
                    second = first;
                    first = current;
                } else if (second < current) {
                    third = second;
                    second = current;
                } else if (third < current) {
                    third = current;
                }
            }
            System.out.println(first + " " + second + " " + third);
            System.out.println();
        }

    }
}
