import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

      switch (age){
          case 0:
              System.out.println("0");
              break;
          case 10:
              System.out.println("10");
              break;
          default:
              System.out.println("Default value");
        }
    }
}
