package com.newton;

import java.util.Scanner;

public class GOG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int thrust = 3;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {

            if(thrust >= arr[i]) {
                thrust += (thrust - arr[i]);
            } else {
                thrust -= (arr[i] - thrust);
            }
            if(thrust == 0) {
                System.out.print(arr[i+1]);
                break;
            }
        }
    }
}
