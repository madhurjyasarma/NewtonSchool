package com.newton;

import java.util.Scanner;

public class MohitFuckedUp {
    public static int findDisappearedNumbers(int[] nums)
    {
        int n=nums.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
            sum-=nums[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num-1];
        for(int i=0; i<num-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findDisappearedNumbers(arr));
    }
}
