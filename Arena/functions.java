//functions
package com.Arena;

import java.util.Scanner;


public class functions {
    static void myMethod (String name, byte id){
        System.out.println("calling from myMethod");
        System.out.println(name);
        System.out.println(id);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("__Main Method__");
        String name = sc.nextLine();
        byte id = sc.nextByte();
        boolean reality = true;
        myMethod(name, id);
    }
}
