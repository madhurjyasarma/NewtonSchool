package com.savage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final byte totalSub = 4;

        Scanner sc = new Scanner(System.in);
        byte a = (byte)sc.nextInt();
        byte b = (byte) sc.nextInt();
        byte c = (byte) sc.nextInt();
        byte d = (byte)sc.nextInt();

        byte res = 0;
        res= (byte) ((a+b+c+d)/totalSub);
        System.out.println(res);
    }
}
