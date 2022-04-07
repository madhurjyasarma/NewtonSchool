//package com.savage;
//
//public class BitDiff {
//    long long sumBitDiff(int arr[], int n)
//    {
//        int ans = 0;
//
//        for (int i = 0; i < 32; i++) {
//            int count = 0;
//            for (int j = 0; j < n; j++)
//                if ((arr[j] & (1 << i)))
//                    count++;
//
//            ans += (count * (n - count) * 2);
//        }
//
//        return ans;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
