package com.Algorithm;

class BinarySearch
{
    // Binary Search Method using recursion
    int binarySearch(int arr[], int l, int r, int x)        // (Param) array arr, left , right, target
    {
        if(l <= r)          // if left less than equal to right, else two counter will cross
        {
            int mid = ( l + (r - 1) )/2;        // finding middle elem
            if (arr[mid] == x)          // if mid elem is x i.e. target
            {
                return mid;
            }
            if (x < mid)            // [.....x..... mid ..........]
            {
                return binarySearch(arr, l, mid-1,x);       // calling binarySearch method for left half
            }
            return binarySearch(arr,mid+1,r,x);             // else right half [....... mid ....x...]
        }
        return -1;          // if x not present in arr return -1
    }
    // Driver Code
    public static void main(String[] args)
    {
        BinarySearch bs = new BinarySearch(); // BinarySearch object
        int arr[] = {1,2,3,4,10,20,40};
        int n = arr.length;
        int x = 10;
        int res = bs.binarySearch(arr, 0,n-1,x);
        System.out.println(res);
    }

}