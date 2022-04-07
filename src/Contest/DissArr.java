package Contest;

import java.util.Arrays;
import java.util.Scanner;

public class DissArr {
    public static int binarySearch(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == k) return arr[mid];
            else if (arr[mid] < k) l = mid + 1;
            else r = mid - 1;
        }
        return -1;

    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int r;
        for(int i=1;i<=arr.length;i++){
            r=binarySearch(arr,i);
            if(r==-1 && i!=r) System.out.print(i+" ");
        }
    }
}

