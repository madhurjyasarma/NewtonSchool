package com.newton;

import java.util.Scanner;

public class FreqArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T -->= 0)
        {

            String str = sc.nextLine();
            int[] freq = new int[72];
            // loop through input string
            for (int i = 0; i < str.length(); i++)
                freq[str.charAt(i) - 65]++; // increment freq array's index of that particular char(i)

            // loop through freq array
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > 1) {
                    char c = (char) (65 + i);
                    System.out.print(c + "" + freq[i] );
                }
            }
        }
    }

}
