package com.newton;

import java.util.Scanner;

public class ClosestBuddy {
    // GCD Function
    static int isGCD(int a,int b){
        if(a == 0) return b;
        if(b == 0) return a;
        if(a == b) return b;
        if(a>b) return isGCD(a-b,b);
        else return isGCD(b-a,a);
    }


    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);      //Scanner Obj
        int N = scan.nextInt();     //input for array size
        int[] array = new int[N+2];     //array of size [N+2]

        for(int x=1 ; x<=N ; x++){      //from 1 to N
            array[x]=scan.nextInt();    //input
        }
        for(int i=1 ; i<=N ; i++){
            int flag=0;
            if(isGCD(array[i],array[i])==1){
                System.out.print(i+" ");
                flag=1;
            }
            else{
                int j=1;
                while(i-j>=0 || i+j <N+2){
                    if(i-j>=0){
                        if(isGCD(array[i],array[i-j])==1){
                            System.out.print(i-j+" ");
                            flag=1;
                            break;
                        }
                    }if(i+j<N+2){
                        if(isGCD(array[i],array[i+j])==1){
                            System.out.print(i+j+" ");
                            flag=1;
                            break;
                        }
                    }
                    j++;

                }
            }
            if(flag==0){
                System.out.print(-1+" ");

            }

        }
    }
}
