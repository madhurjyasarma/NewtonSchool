/*Sample Input:
28

Sample Output:
4

K = x^2 + 3*x

Explaination:
42 + 3*4 = 28
There is no other positive integer that will give such result.*/
package Contest;

import java.util.Scanner;

public class FindIt {
    static void findIt(long num){
        long x = 0;
        boolean cond = true;
        while (cond){
            if ( ( (x * x) + (3*x) ) == num ){
                System.out.println(x);
                break;
            }else {
                x++;
            }
            if (x>num){
                cond = false;
            }

        }

        if (cond == false){
            System.out.println(-1);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        findIt(num);
    }

}
