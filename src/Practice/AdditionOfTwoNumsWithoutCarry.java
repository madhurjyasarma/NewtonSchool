package Practice;

import java.util.Arrays;
import java.util.Scanner;


public class AdditionOfTwoNumsWithoutCarry {
    public static boolean containsPairWithSum(int[] a, int x) {
        Arrays.sort(a);
        for (int i = 0, j = a.length - 1; i < j;) {
            int sum = a[i] + a[j];
            if (sum < x)
                i++;
            else if (sum > x)
                j--;
            else
                return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ar[] = new int[n];

        for (int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        boolean res = containsPairWithSum(ar,k);
        if (res)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
