package Practice;

import java.util.Scanner;

public class BitMan {
    public static int binaryToGray(int n)
    {
        if (n == 0) {
            return 0;
        }
        // Extracting the last digit
        int a = n % 10;
        // Extracting the second last digit
        int b = (n / 10) % 10;
        // Else If last two digits
        // are opposite bits to each other
        if ((a & ~b) == 1 || (~a & b) == 1) {
            return (1 + 10 * binaryToGray(n / 10));
        }
        // Else If the last
        // two bits are same
        return (10 * binaryToGray(n / 10));
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int n = sc.nextInt();
            int res = Integer.parseInt(String.valueOf(binaryToGray(n)));
            System.out.println(res);
        }
    }
}
