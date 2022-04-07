package Practice;

import java.util.*;

public class CompString {
    static void comp(String str){
        int n = str.length();
        System.out.println(str);
        int i=0;
        while (i < n-1){
            int count = 1;
            while (i < n - 1 && (str.charAt(i) == str.charAt(i+1))) {
                count += 1;
                i += 1;
                i += 1;
            }
            System.out.println(str.charAt(i - 1) + count + "");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        comp(str);
    }
}
