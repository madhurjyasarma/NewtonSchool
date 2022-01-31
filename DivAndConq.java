import java.util.Scanner;

public class DivAndConq {
    public static void main(String[] args) {
        my_func();
        
    }

    static void my_func(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want to put: ");
        // System.out.println("Enter a number to search: ");
        
        

        int a =sc.nextInt();
        int my_array[] = new int[a];
          
        for(int i=0; i<a; i++) {
            my_array[i]=sc.nextInt();  
        }
        System.out.println("Enter number to search: ");
        int findNum = sc.nextInt();

        System.out.println('\n');
        for (int element: my_array) {
            // System.out.println(element);
            if(findNum == element ){
                System.out.println(element + "is in the array");
                break;
            }
            else{
                System.out.println("Not in the array");
            }
        }

        sc.close();
    }
    
}
