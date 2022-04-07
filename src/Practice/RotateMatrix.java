package Practice;

import java.util.Scanner;

public class RotateMatrix {
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();

    static void rotate90Clockwise(int a[][])
    {

        // Traverse each cycle
        for (int i = 0; i < N / 2; i++)
        {
            for (int j = i; j < N - i - 1; j++)
            {

                // Swap elements of each cycle
                // in clockwise direction
                int temp = a[i][j];
                a[i][j] = a[N - 1 - j][i];
                a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
                a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
                a[j][N - 1 - i] = temp;
            }
        }
    }
    static void printMatrix(int arr[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print( arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[N][N];

        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        rotate90Clockwise(arr);
        printMatrix(arr);

        System.out.println();

        rotate90Clockwise(arr);
        printMatrix(arr);

    }
}
