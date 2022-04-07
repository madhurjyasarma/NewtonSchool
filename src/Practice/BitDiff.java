package Practice;

import java.util.Scanner;

public class BitDiff {
    static int countBits(int number)
    {

        // log function in base 2
        // take only integer part
        return (int)(Math.log(number) /
                Math.log(2) + 1);
    }

    static int sumBitDifferences(int arr[], int n)
    {

        int ans = 0; // Initialize result
        int arrLength = arr.length;

        // traverse over all bits
        for (int i = 0; i < countBits(arrLength
        ); i++) {

            // count number of elements
            // with i'th bit set
            int count = 0;

            for (int j = 0; j < n; j++)
                if ((arr[j] & (1 << i)) != 0)
                    count++;

            // Add "count * (n - count) * 2"
            // to the answer...(n - count = unset bit count)
            ans += (count * (n - count) * 2);
        }

        return ans;
    }

    // Driver program
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumBitDifferences(arr,size));
    }
}
