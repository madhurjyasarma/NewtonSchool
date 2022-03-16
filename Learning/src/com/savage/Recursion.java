package com.savage;

public class Recursion {
    public static int sum(int k){
        // condition
        if (k > 0){
            // calling itself means recursion
            return k + sum(k - 1);
        }else{
            // base case
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
}
/*
10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
* */
