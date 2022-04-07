package Practice;

import java.util.Scanner;

public class NY {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(subArray(arr,n,k));
    }
    static int subArray(int[] arr, int n, int k){
        int sum = 0;
        int left = 0;
        int result = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            sum += arr[i];
            while(sum >= k){
                result = Math.min(result, i+1-left);
                sum -= arr[left];
                left++;
            }
        }
        return(result == Integer.MAX_VALUE)?0 : result;
    }
}
