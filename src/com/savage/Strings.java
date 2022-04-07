package com.savage;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        String name = "MVDZO";
        System.out.println(name);

        // Methods to use in String
        System.out.println(name.length());  //length of name
        System.out.println(name.charAt(3));     // Accessing char at char array "name"
        System.out.println(name.toLowerCase(Locale.ROOT));  // LowerCase all char in name
        System.out.println(name.toUpperCase(Locale.ROOT));  // UpperCase all char in name
        System.out.println(name.indexOf(0));    // Because no 0 in name
        System.out.println(name.indexOf('Z'));  // index of Z in name is 3 (0 Indexing)
        name.chars().forEach(System.out::print); // ASCII of each element eg. 77 for M

    }
}
