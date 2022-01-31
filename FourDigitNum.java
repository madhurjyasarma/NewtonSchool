package com.savage;

import java.util.Scanner;

public class FourDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = (((((num + 8)/3)%5)*5));
//        num = num /3;
//        num = num % 5;
//        num = num * 5;
        System.out.println(num);
    }
}
