package com.savage;

public class targetSum {
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;

        int[] result = new int[2];

        if (len == 2){
            if (nums[0] + nums[1] == target){
                result[0] = 0;
                result[1] = 1;

                return result;
            }
        }

        for (int i=0; i<len; ++i){
            for (int j=1; j<len; ++j){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }

            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,3};
        int[] result = twoSum(arr, 6);
        for (int num:result) {
            System.out.println(num);
        }
    }
}
