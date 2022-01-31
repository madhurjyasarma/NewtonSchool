package com.savage;


// Java program for the above approach
class FindMaximum2 {
    /* For a given array arr[],
        returns the maximum j-i such
       that arr[j] > arr[i] */
    int maxIndexDiff(int arr[], int n)
    {
        int maxDiff = -1;
        int i, j;

        for (i = 0; i < n; ++i) {
            for (j = n - 1; j > i; --j) {
                if (arr[j] > arr[i] && maxDiff < (j - i))
                    maxDiff = j - i;
            }
        }

        return maxDiff;
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        FindMaximum max = new FindMaximum();
        int arr[] = { 5, 4, 3, 2, 1};
        int n = arr.length;
        int maxDiff = max.maxIndexDiff(arr, n);
        System.out.println(maxDiff);
    }
}