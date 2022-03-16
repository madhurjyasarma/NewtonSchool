package com.newton;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input
        String str = sc.nextLine();
        //char arr
        char arr[] = new char[str.length()+1];
        // new char arr2
        char newArr[] = new char[str.length()+1];

        for(int i=0; i<str.length(); i++)
        {
            arr[i] = str.charAt(i);
//            System.out.print(arr[i]+" ");
        }
        // from 0 - str.length check every char
        for(int j=0; j<arr.length; j++)
        {
            int count=0;
            char BASE = arr[j];

        }
        // arr[i] = BASE
        // if BASE in arr
        // count += count + 1
        // newArr.append(BASE + count)

    }
}
