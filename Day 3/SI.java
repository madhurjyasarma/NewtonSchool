import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of P: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of Q: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of R: ");
        int c = sc.nextInt();

        int result = (a * b * c)/100;
        System.out.println("The SI is: "+result);

    }
}
