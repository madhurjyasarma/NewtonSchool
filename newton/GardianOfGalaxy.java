package com.newton;

import java.util.Scanner;

public class GardianOfGalaxy {
    static boolean possible(int a[],long thrust){
        for(int i=0; i< a.length; i++){
            if(thrust < a[i]){
                thrust = thrust - (a[i] - thrust);
            }else {
                thrust = thrust + (thrust - a[i]);
            }
            if (thrust<0){
                return false;
            }
            if (thrust > (Integer.MAX_VALUE)) return true;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        long l=0, r=Integer.MAX_VALUE;
        while (l<r){
            long mid = (l+r) /2;
            if(possible(a,mid)){
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        System.out.println(l);
    }
}
