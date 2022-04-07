package Practice;

import java.util.Scanner;

public class MaxContSubArr {
    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0){
            int num = sc.nextInt();
            int arr[] = new int[num];

            for (int i=0; i<num; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(maxSubArraySum(arr));
        }
    }
}
