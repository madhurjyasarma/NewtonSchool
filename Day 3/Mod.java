/* Sir`
* for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

* */

public class Mod {
    public static void main(String[] args) {
//        boolean loop = true;    //Switch
        int a;
        a = 0;

        while (true) {
        if ( a <=100){
        if ((a % 3 == 0 && a % 5 == 0)){
            System.out.println(a);
            a++;
        }
        else {
            a++;
        }
        }

        }
    }
}
