package com.newton;

import java.util.Scanner;

public class ModInv {
    static int modInverse(int a, int m)
    {
        for (int x = 1; x < m; x++)
            if (((a%m) * (x%m)) % m == 1)
                return x;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i=0; i<input; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(i == input-1){
                System.out.println(modInverse(x,y));
            }

        }
    }
}
