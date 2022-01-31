//num of arr elements
//arr elem
//largest 3

import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //total arr
        int totalArr = sc.nextInt();
        for(int i=0; i<totalArr; i++){
            int array[] = new int[i];
            // System.out.println("Good going");
        
            for(int a=0; a< totalArr; a++){
                System.out.println(array[a]);
            }
        }


        

        /*
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println(numbers[i]);
        }*/
        sc.close();
    }
}