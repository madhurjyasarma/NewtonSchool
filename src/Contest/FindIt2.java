package Contest;

import java.util.Scanner;

public class FindIt2 {
    static void findIt(long num){
        long x =0;
        for (int i=0; i<2147483647; i++){
            if (((x^2) + (3*x))==num){
                System.out.println(x);
                return;
            }
            else
                x++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        findIt(num);
    }
}
