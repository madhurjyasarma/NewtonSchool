/*
* Given an array Arr[] that contains N integers (may be positive, negative or zero).
*  Find the product of the maximum product subarray.
Input: arr[] = {6, -3, -10, 0, 2}

Output: 180*/

package com.savage;

public class Maxproduct {
    public static int maxProductArr(int[] nums){

        int max = nums[0];
        int min = nums[0];
        int res = nums[0];


        for (int i=1; i< nums.length; i++){

            // swapping of min and max
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i],max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            res = Math.max(max, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6, -3, -10, 0, 2};
        int res = maxProductArr(nums);
        System.out.println(res);
    }

}
