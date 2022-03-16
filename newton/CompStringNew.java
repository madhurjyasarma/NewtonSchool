/*
Input:
2
AAACCCBBD
ABCD

Output:
A3C3B2D1
A1B1C1D1
* */
package com.newton;

import java.util.Scanner;

public class CompStringNew {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        while(T --> -1)
        {
            String str = scan.nextLine();

            final int len = str.length();
            char arr[] = new char[len+1];

            for (int i=0; i<len; i++){
                arr[i] = str.charAt(i);
            }

            // Test String
            // String str = "AAAABBBCCDD";

            int count = 1;

            for (int i = 0; i < len ; i++)	// To access each element
            {
                if (arr[i] == arr[i+1])
                {
                    count++;
                }
                else if(arr[i] != arr[i+1])
                {
                    System.out.print(str.charAt(i)+""+(count)); 	// for casting
                    count = 1;										        // count reset
                }
            }
        }
    }
}
