/* Problem 1*/
package com.savage;

import java.util.HashMap;
public class TargetSumhash {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(nums[i])){
                return new int[] {map.get(num), i};
            }

            map.put(target - num, i);
        }

        return new int[]{};

    }
    public static void main(String[] args) {
        TargetSumhash twoSum = new TargetSumhash();

        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum.twoSum(arr,target);
        for (int i: result){
            System.out.print(i + " ");
        }
    }
}
