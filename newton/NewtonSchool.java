package com.newton;

import java.util.Scanner;

public class NewtonSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            if ((i%3 == 0) && (i%5 ==0)){
                System.out.print("NewtonSchool" + " ");
            }
            else if(i%3 == 0){
                System.out.print("Newton" + " ");
            }
            else if(i%5 == 0){
                System.out.print("School" + " ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
