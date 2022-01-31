import java.util.Scanner;

class SpaceX{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
        
    }

    static int factorial(int num){
        // recursion
        
        // base cond
        if ((num == 0) || (num == 1)){
            return 1;
        }
        else{
            return num * factorial(num -1);
            //recursive logic
        
        }
        
    }
}