import java.util.Scanner;

public class NewArray {

    static void print3largest(int arr[], int arr_size)
    {
        int i, first, second, third;
 
        /* There should be atleast three elements */
        if (arr_size < 3) {
            System.out.print(" Invalid Input ");
            return;
        }
 
        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is greater than
            first*/
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
 
            /* If arr[i] is in between first and
            second then update second  */
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
 
            else if (arr[i] > third)
                third = arr[i];
        }
 
        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of arr: ");
        int numOfArray = sc.nextInt();
        int myArray[] = new int[numOfArray];

        for(int i=0; i<numOfArray; i++){
            myArray[i] = sc.nextInt();
        }

        for(int i=0; i < numOfArray; i++){
            System.out.print(myArray[i]);
        }
    }
    
}
