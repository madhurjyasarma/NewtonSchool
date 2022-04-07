/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/
package Practice;

import java.util.*;

public class RomanToInt {
    static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.toUpperCase(Locale.ROOT);

        int strlength = str.length();   // reduce time complexity
        char chars[] = new char[strlength];
        // To put chars in chars
        for (int i = 0; i < strlength; i++) {
            chars[i] = str.charAt(i);
        }
        // print chars[]
        for (int i = 0; i < strlength; i++) {
            System.out.print(chars[i] + " ");
        }

        for (int i=0; i<strlength; i++){

        }
    }
}

