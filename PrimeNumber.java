package com.savage;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//        // [2, 3, 5 , 7 , 11, 13, 17, 19, 23, 27]
//        //  1111
//        Scanner sc = new Scanner(System.in);
//        int inputNum = sc.nextInt();
//        if(inputNum == 2){
//            System.out.println("Prime");
//        }
//
        // 5 fizz ,3 buzz, (5 3) fizzbuzz


        while(true){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            //input
            if((num%3 == 0) && (num%5 == 0)){
                System.out.println("FizzBuzz");
            }
            else if(num%3 == 0){
                System.out.println("fizz");
            }
            else if (num%5 == 0){
                System.out.println("buzz");
            }
            else{
                System.out.println(num);
            }
            // if (num%3 == 0) && (num%5 == 0) ---> Fizzbuzz
            //else if (num%3 == 0)------>buzz
            //else if (num % 5 == 0)----->fizz

        }
        //1, 1, 2, 4, 8, 16 ...




    }
}
