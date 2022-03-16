//take input from user, print a newline at each num i.e. multiple of 5
// eg---- 1 2 3 4 5
//6 7 8 9 10
// 11 12....
package com.savage;

import java.util.Scanner;

public class NewlineAt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
// USING FOR LOOP
//        for (int i=1; i<=num; i++){
//            if(i % 5 == 0) {
//                System.out.println(i);
//            }else{
//                System.out.print(i+ " ");
//            }
//        }

        //Using while loop
        int i =0;
        while(i<num){
            i++;
            if(i%5 == 0){
                System.out.println(i);
            }else{
                System.out.print(i + " ");


            }
        }

    }
}
