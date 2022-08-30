/*
* Given an array that is sorted, but after sorting some elements are moved to either of the adjacent positions or not moved at all, i.e.,
arr[i] may be present at arr[i+1] or arr[i-1] or are[i] itself, search the given element in this array
input: [6, 3, 10, 7, 20], target = 10

output: 2

3, 6, 7, 10, 20

6, 3, 10, 7, 20

3, 7, 6, 20, 10*/

package com.savage;

public class SortArrayMock {
    public static int binarySearch(int[] nums, int l, int r, int x) {
        // while l <= r
        // find mid
        //      check mid == x
        //      elseif x in left part ---------> binarySearch in left
        //      elseif  in right part ---------> binarySearch in right

        while (l <= r) {

            int mid = l + (r - l) / 2;
            // checks if mid element is x
            if (nums[mid] == x) return mid;

            if (mid > l && nums[mid - 1] == x ) return mid-1;
            if (mid < r && nums[mid + 1] == x ) return mid+1;

            if (nums[mid] > x)
                return binarySearch(nums, l, mid - 1, x);
            return binarySearch(nums, mid+ 1, r, x);
        }

        // not found
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{6, 3, 10, 7, 20};
        int res = binarySearch(nums,0, nums.length, 10);
        System.out.println(res);
    }
}
