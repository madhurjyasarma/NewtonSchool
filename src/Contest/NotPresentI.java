/*Sample Input :
5
1 2 3 4 4

Sample Output :
5

Sample Input:
7
4 1 3 2 5 5 4

Sample Output:
6 7

Explaination:
In the first test, only 5 is the integer from 1 to n, which is missing from the array.
In the second test, both 6 and 7 are missing.*/
package Contest;

import java.util.Arrays;
import java.util.Scanner;

public class NotPresentI {
    static void notPresentI(int arr[],int size){
        Arrays.sort(arr);
        int compArr[] = new int[arr.length-1];

        int count = 1;

        for (int i=0; i<compArr.length-1; i++){
            compArr[i] = count;
            count++;
        }

        for (int i=0; i<size; i++){
            if (arr[i] != compArr[i]){
                System.out.println(compArr[i]);
                return;
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        // input of arr
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        notPresentI(arr,size);
    }
}
