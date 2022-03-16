package com.savage;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        boolean counter = true;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter two num: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int add = num1 + num1;
            int sub = num1 - num2;
            System.out.println("What do you want to do: Press (1) for add or Press(2 for sub)");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println(add);
            } else if(choice == 2){
                System.out.println(sub);
            } else {
                System.out.println("Please enter a valid num");
            }
            System.out.println("Do you wish to continue?'\n' Press 'Y' for yes and 'N' for no " );
            String switch1 = sc.next();
            if((switch1 == "y") || (switch1 == "Y") ){

            }
            else {
                counter = false;
            }



        }while(counter);

    }
}
