package com.newton;

import java.util.Scanner;

public class SumOfHuge2 {
    static String findSum(String str1, String str2)
    {

        // Before proceeding further, make sure length
        // of str2 is larger.
        if (str1.length() > str2.length()){
            String t = str1;
            str1 = str2;
            str2 = t;
        }

        // Take an empty String for storing result
        String str = "";

        // Calculate length of both String
        int n1 = str1.length(), n2 = str2.length();
        int diff = n2 - n1;

        // Initially take carry zero
        int carry = 0;

        // Traverse from end of both Strings
        for (int i = n1 - 1; i>=0; i--)
        {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((int)(str1.charAt(i)-'0') +
                    (int)(str2.charAt(i+diff)-'0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining digits of str2[]
        for (int i = n2 - n1 - 1; i >= 0; i--)
        {
            int sum = ((int)(str2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0)
            str += (char)(carry + '0');

        // reverse resultant String
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(findSum(str1,str2));
    }
}
