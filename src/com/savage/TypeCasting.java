package com.savage;

public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;    // Automatic casting

        System.out.println(myInt);
        System.out.println(myDouble);

        double myDouble1 = 3.1416D;
        int myInt1 = (int) myDouble1;   // manual casting

        System.out.println(myDouble1);
        System.out.println(myInt1);

    }
}
