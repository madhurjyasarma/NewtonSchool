package com.savage;

import java.util.Scanner;

public class TowerOfHanoi {
    // Java recursive function to solve tower of hanoi puzzle
    static void towerOfHanoi(int n, char from_rod,
                             char to_rod, char aux_rod)
    {
        if (n == 0)
        {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println(n + ":" +
                from_rod +"_>" + to_rod );
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    // Driver code
    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }
}
