/* Transpose Matrix */

package Practice;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[][] = new int[N][N];

        for(int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }
}
