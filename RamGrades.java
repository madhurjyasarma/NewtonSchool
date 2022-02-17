package com.newton;

import java.util.Scanner;

public class RamGrades {
    static Scanner sc = new Scanner(System.in);

    static int grade() {
        int arr[] = new int[4];
        for (int i = 0; i<4; i++) {
            arr[i] = sc.nextInt();
        }
        int result = ((arr[0] + arr[1] + arr[2] + arr[3]) / 4);

        return result;
    }

//driver code
    public static void main(String[] args) {
         System.out.println(grade());
    }
}
