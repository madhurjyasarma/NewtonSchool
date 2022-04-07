package Contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisappearingNumArr {
    public static List <Long> findDisappearedNumbers(long[] nums) {
        List<Long> ans = new ArrayList<>();

        long[] temp = new long[nums.length];

        for (long i : nums) {
            temp[(int) (i - 1)]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if(temp[i] == 0){
                ans.add((long) (i+1));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long arr[] = new long[size];
        // input of arr
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        List<Long> result = findDisappearedNumbers(arr);
        long total = result.size();
//        result.get()
        for (int i=0; i<total; i++){
            System.out.print(result.get(i)+" ");
        }
//        System.out.println(result);
    }
}
