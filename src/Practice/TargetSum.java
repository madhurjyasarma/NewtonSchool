package Practice;
import java.util.*;
public class TargetSum {
    // O(n^2)
    public static int[] twoSum(int[] nums, int target) {
        for (int i =0; i< nums.length; i++){
            for (int j=1; j<nums.length; j++){
                if ((nums[i]+nums[j]) == target){
                    int result[] = new int[2];
                    result[0] = nums[i];
                    result[1] = nums[j];
                    return result;
                }
            }
        }
        return null;
    }
    static void printArr(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
//        int arr[] = new int[5];
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int arrOrg[] = twoSum(arr,7);
        printArr(arrOrg);
    }
}
