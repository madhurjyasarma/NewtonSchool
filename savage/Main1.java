package com.savage;

import java.util.Scanner;

public class Main1 {

        // Function to find the maximum value of `j-i` such that nums[j] > nums[i]
        public static int findMaxDiff(int[] nums)
        {
            int diff = Integer.MIN_VALUE;

            // base case
            if (nums == null || nums.length == 0) {
                return diff;
            }

            for (int i = 0; i < nums.length; i++)
            {
                for (int j = nums.length - 1; j > i; j--)
                {
                    if (nums[j] > nums[i] && diff < j - i) {
                        diff = j - i;
                    }
                }
            }
            return diff;
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int elem = sc.nextInt();
            int arr[] = new int[elem];
            for (int i = 0; i <= elem-1; i++) {
                arr[i] = sc.nextInt();
            }
//            int[] nums = { 5, 4, 3, 2, 1};
            System.out.println("The maximum value is " + findMaxDiff(arr));
        }
    }

