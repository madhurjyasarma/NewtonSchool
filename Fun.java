package com.newton;

public class Fun {
    public static String fun(int a,int b){
        if(a>b){
            return "a";
        }
        if(a==0){
            return "b";
        }
        return "lol";
    }

    public static void main(String[] args) {
        fun(4,1);
    }

}
