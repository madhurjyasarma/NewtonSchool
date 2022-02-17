package com.newton;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

import java.util.Scanner;

public class test {

    // don't change the name of this class
// you can add inner classes if needed
    class Main {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            int max = 1;

            if(n<2 || n>100000){
                System.out.println("2 <= N <= 100000");
            }else{

                for(int i=0; i<n;i++){
                    arr[i] = sc.nextInt();
                }
                //   for(int i=0; i<n; i++){
                // 	 int gcda = gcd(n, arr[i]);
                // 	 n1 = gcda;
                // 	  if(max<gcda){
                // 		  max =gcda;
                // 	  }
                // 	  System.out.println(n1);
                //   }

                for(int i=0; i<n-1; i++){
                    for(int j = i+1; j<n; j++ ){
                        int gcda= gcd(arr[i],arr[j]);
                        if(max<gcda){
                            max =gcda;
                        }
                    }
                }
                System.out.println(max);

            }
        }

        static int gcd(int a , int b){
            if(b==0){
                return a;
            }
            return gcd(b,a%b);
        }
    }

}
