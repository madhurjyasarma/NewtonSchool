package com.newton;

import java.util.Arrays;
import java.util.Scanner;

public class Groot {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        while(T --> 0)
        {
            String str = scan.next();

            final int len = str.length();
            char arr[] = new char[len+1];


            for (int i=0; i<len; i++){
                arr[i] = str.charAt(i);
            }
//            Arrays.sort(arr);

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
            // System.out.println();
        }
        System.out.println();
    }
}
