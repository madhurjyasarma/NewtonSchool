package com.savage;

import java.util.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String myString = "asfajkfbaflabf";

        char[] myCharArr = myString.toCharArray();


        HashMap<Character, Integer> myMap = new HashMap<>();
        int count = 0;
        for(int i=0; i<myString.length(); i++){
            if (myMap.containsKey(myCharArr[i])){
                count++;
                myMap.put(myCharArr[i],count);

            } else {
                count = 1;
                myMap.put(myCharArr[i],count);
            }
        }

        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
            System.out.print(entry.getKey()+""+entry.getValue());
        }

    }
}
