package com.savage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name here: ");
        String name = sc.nextLine();
        String says = "MVDZO says hello to ";
        System.out.println(says + name);
    }
}
