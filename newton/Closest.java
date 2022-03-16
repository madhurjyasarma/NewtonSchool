package com.newton;

import java.util.Scanner;

public class Closest {
    public static int findGCD(int a, int b)
    {
        while(b != 0)
        {
            if(a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        return a;
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);      //Scanner Obj
        int N = scan.nextInt();     //input for array size
        int[] array = new int[N+2];     //array of size [N+2]

        for(int x=1 ; x<=N ; x++){      //array input loop
            array[x]=scan.nextInt();
        }
        for(int i=1 ; i<=N ; i++){
            int flag=0;
            if(findGCD(array[i],array[i])==1){
                System.out.print(i+" ");
                flag=1;
            }
            else{
                int j=1;
                while(i-j>=0 || i+j <N+2){      //or
                    if(i-j>=0){
                        if(findGCD(array[i],array[i-j])==1){
                            System.out.print(i-j+" ");
                            flag=1;
                            break;
                        }
                    }if(i+j<N+2){
                        if(findGCD(array[i],array[i+j])==1){
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
