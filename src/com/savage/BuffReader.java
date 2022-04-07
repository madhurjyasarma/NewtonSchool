package com.savage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReader {
    public static void main(String[] args) throws Exception {

        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);

        int T = Integer.parseInt(br.readLine());
        while (T --> 0){

            long a = Long.parseLong(br.readLine());
            long b = Long.parseLong(br.readLine());
            long k = Long.parseLong(br.readLine());

//            System.out.println(a + " " + b + " " + c);
            long res = a;
            for (int x=1; x<=k; x++)
            {
                if ((x % 2) == 1){
                    res = res & b;
                }
                else {
                    res = res | b;
                }
            }
            System.out.println(res);
        }
    }
}

