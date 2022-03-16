package com.newton;

public class MeClosest {
    public static int findGCD(int a, int b)
    {
        while(b != 0)
        {
            if(a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        return a;
    }


    public static void main(String[] args) {

    }
}
