package Practice;

import java.util.Scanner;

public class MaxSubArr2 {
    static int maxSubArraySum(int a[],int size)
    {

        int max_so_far = a[0], max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0)
                max_ending_here = 0;

        /* Do not compare for all
           elements. Compare only
           when max_ending_here > 0 */
            else if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;

        }
        return max_so_far;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int num = sc.nextInt();
            int arr[] = new int[num];
            for (int i=0; i<num; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(maxSubArraySum(arr,num));
        }
    }
}
