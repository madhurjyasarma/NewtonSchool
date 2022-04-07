package Practice;

import java.util.Scanner;

public class ZigZagMatrix {

    // This method is to print an array
    static void printArray(int arr[] ){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // Wrapping things togather
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // x and y Dimentions of the array
        int x = sc.nextInt();
        int y = sc.nextInt();
        int arr[][] = new int[x][y];

        // for taking input in the Matrix
        for (int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        int size = 1;
        while (true)
        {
            int elem = 0;

            int oneDArr[] = new int [size];

            for (int a=0; a<size; a++){
                oneDArr[elem] = arr[elem][a];
                elem++;
                size++;
            }
            printArray(oneDArr);
            System.out.println();


        }
    }
}
