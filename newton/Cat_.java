package com.newton;

import java.util.Scanner;

public class Cat_ {
    static void catalan(int n)
    {
        int cat_ = 1;

        // For the first number
        System.out.print(cat_+" "); // C(0)

        // Iterate till N
        for (int i = 1; i < n; i++)
        {
            // Calculate the number
            // and print it
            cat_ *= (4 * i - 2);
            cat_ /= (i + 1);
            System.out.print(cat_+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        catalan(n);
    }
}
