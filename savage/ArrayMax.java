package com.savage;

import java.util.Scanner;

class ArrayMax{
    public int arrayMax(int[] arr, int n)
    {
        int len = arr.length;
        if (len==0)
            return len;
        int[] LMin= new int[arr.length];
        int[] RMax = new int [arr.length];
        // calculate LMin[]

        LMin[0]= arr[0];
        for (int i=1;i< len;i++)
        {
            LMin[i]= Math.min(arr[i],LMin[i-1]);

        }

        RMax[len-1]= arr[len-1];
        for(int j=len-2;j>0;j--)
        {
            int i = 0;
            RMax[j]=Math.max(arr[i],RMax[j+1]);
        }

        // do the comparison
        int i=0;
        int j=0;
        int maxdiff=-1;// init as -1:as maxDiff can also be 0 if j=i.
        int maxDiff = 0;
        while(i<len && j<len)
        {
            if(LMin[i]< RMax[j])
            {
                maxDiff= Math.max(maxDiff,j-i);
                j++;// move RMax to check to see if there is a bigger maxDiff
            }
            else
                i++;// move LMin to find next MaxDiff.
        }

        return maxDiff;// ta-da
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int elem = sc.nextInt();
        int arr[] = new int[elem];
        for (int i = 0; i <= elem-1; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayMax max = new ArrayMax();
//        int arr[] = {5,4,3,2,1};
        int n = arr.length;
        int maxDiff = max.arrayMax(arr, n);
        System.out.println(maxDiff);
    }
}