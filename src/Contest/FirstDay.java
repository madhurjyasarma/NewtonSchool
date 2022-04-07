package Contest;

import java.util.Locale;
import java.util.Scanner;

public class FirstDay {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        if (str == "Apple"){
//            System.out.println("Gravity");
//        }
//        else {
//            System.out.println("Space");
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        if (T % 2 == 1 ){
            String str = sc.next();
            str = str.toUpperCase(Locale.ROOT);
            int countN = 0;
            int countT = 0;
//            System.out.println(str);
            for (int i=0; i<str.length(); i++){
//                System.out.print(str.charAt(i) + " ");
                if (str.charAt(i) == 'N'){
                    countN++;
                    break;
                }
                if (str.charAt(i) == 'T'){
                    countT++;
                    break;
                }
            }
            if (countN>countT){
                System.out.println("Nutan");
            }
            if(countT>countN){
                System.out.println("Tusla");
            }
        }

    }
}
