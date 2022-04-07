package Contest;

import java.util.HashSet;

public class FreqStringArr {
    // Returns count of pairs in arr[0..n-1] with XOR
    // value equals to x.
    static int xorPairCount(int arr[], int n, int x)
    {
        int result = 0; // Initialize result

        // create empty set that stores the visiting
        // element of array.
        // Refer below post for details of unordered_set
        // https://www.geeksforgeeks.org/unorderd_set-stl-uses/
        HashSet<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < n; i++)
        {
            // If there exist an element in set s
            // with XOR equals to x^arr[i], that means
            // there exist an element such that the
            // XOR of element with arr[i] is equal to
            // x, then increment count.
            if (s.contains(x ^ arr[i]) &&
                    (x ^ arr[i]) == (int) s.toArray()[s.size() - 1])
            {
                result++;
            }

            // Make element visited
            s.add(arr[i]);
        }

        // return total count of
        // pairs with XOR equal to x
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {3, 2};
        int n = arr.length;
        int x = 5;
        System.out.print("Count of pairs with given XOR = "
                + xorPairCount(arr, n, x));
    }
}
