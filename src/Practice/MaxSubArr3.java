package Practice;

import java.util.Scanner;

public class MaxSubArr3 {
    public static long maxSumSubArray(long arr[],long n){
        long maxSoFar= Integer.MIN_VALUE;
        long maxEndingHere=0;

        for(int i=0;i<n;i++)
        {
            maxEndingHere=maxEndingHere+arr[i];

            if(maxSoFar<maxEndingHere)
                maxSoFar=maxEndingHere;

            if(maxEndingHere<0)
                maxEndingHere=0;
        }

        return maxSoFar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            long num = sc.nextLong();
            long arr[] = new long[(int) num];
            for (int i=0; i<num; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(maxSumSubArray(arr,num));
        }
    }
}
