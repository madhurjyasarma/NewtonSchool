package Practice;

import java.util.Scanner;

public class ZigZag {
    public static Scanner sc = new Scanner(System.in);

    static final int ROW = sc.nextInt();
    static final int COL = sc.nextInt();

    public static void main(String[] args) {

//        int M[][] = {
//                { 1, 2, 3, 4 },     { 5, 6, 7, 8 },
//                { 9, 10, 11, 12 },  { 13, 14, 15, 16 },
//                { 17, 18, 19, 20 },
//        };

        int M[][] = new int[ROW][COL];

        for (int i=0; i<ROW; i++) {
            for (int j = 0; j < COL; j++) {
                M[i][j] = sc.nextInt();

            }
        }
        System.out.print("Given matrix is \n");
        printMatrix(M);

        System.out.print(
                "\nDiagonal printing of matrix is \n");
        diagonalOrder(M);
    }

    static int min(int a, int b)
    {
        return (a < b) ? a : b;
    }

    static int min(int a, int b, int c)
    {
        return min(min(a, b), c);
    }

    static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }
    static void diagonalOrder(int matrix[][])
    {

        // There will be ROW+COL-1 lines in the output
        for (int line = 1;
             line <= (ROW + COL - 1);
             line++) {

            // Get column index of the first
            // element in this line of output.
            // The index is 0 for first ROW
            // lines and line - ROW for remaining lines
            int start_col = max(0, line - ROW);

            // Get count of elements in this line.
            // The count of elements is equal to
            // minimum of line number, COL-start_col and ROW
            int count = min(line, (COL - start_col),
                    ROW);

            // Print elements of this line
            for (int j = 0; j < count; j++)
                System.out.print(matrix[min(ROW, line)
                        - j- 1][start_col + j]
                        + " ");

            // Print elements of next diagonal on next line
            System.out.println();
        }
    }

    static void printMatrix(int matrix[][])
    {
        for (int i = 0; i < ROW; i++)
        {
            for (int j = 0; j < COL; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
    }

}
