package com.savage;

public class MethodOverloading {
    // Method overloading
    // Same method name, different parameters
    static int addition(int x , int y){
        return x+y;
    }
    static double addition(double x , double y){
        return x+y;
    }
    static float addition(float x , float y){
        return x+y;
    }

    public static void main(String[] args) {
        // int addition method gets called
        System.out.println(addition(5,10));

        // double addition method gets called
        System.out.println(addition(5.9,10.6));

        // float addition method gets called
        System.out.println(addition(5f,10f));


    }

}
