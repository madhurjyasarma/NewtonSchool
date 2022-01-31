import java.util.Scanner;   //importing Scanner
import java.util.Arrays;    //Array class import

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArray = sc.nextInt();
        for(int i=0; i<=numArray;i++){
            printLargest3();
        }
            

    }


    static void printLargest3(){
        Scanner sc = new Scanner(System.in);    //Scanner object
        int size = sc.nextInt();       //take input of size of the array
        int myArray[];   //declearing an array
        myArray = new int [size];    //allocating memory
        // int elements = sc.nextInt();
        for(int i=0; i<myArray.length; i++){    //take input in array to 
            int elements = sc.nextInt();    //taking input and inserting elements in array
            myArray[i] = elements; 
        }
        for(int i=0; i<myArray.length; i++){    //for loop to print the elements
            Arrays.sort(myArray);       //Sorting of the array by Array.sort() method
            System.out.print(myArray[i]);   //printing each elements
            
        }
        int lastElement1 = myArray[myArray.length - 1];     //getting last  3 elements i.e. maximum nums 
        int lastElement2 = myArray[myArray.length - 2];
        int lastElement3 = myArray[myArray.length - 3];
        System.out.println('\n');
        sc.close();
        System.out.println(lastElement1 + " " + lastElement2 + " " + lastElement3);     // printing elements
        
    }
}
