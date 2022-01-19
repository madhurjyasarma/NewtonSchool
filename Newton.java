import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Newton {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();

        // for t test cases
        while (t-->0) {
            Set<Integer> set = new HashSet<>();
            int a;
            byte b; // 30 2
            a = sc.nextInt();
            b = sc.nextByte();
            set.add(a);
            for (byte step=1; step<=b; step++) {
                Set<Integer> set2 = new HashSet<>();
                for (int element:set) {
                    int x = element + 3;
                    int y = element - 3;
                    int z = element * 2;

                    set2.add(x);
                    set2.add(y);
                    set2.add(z);
                }
                set.addAll(set2);
                set2 = new HashSet<>();
            }
            System.out.println(set.size());
        }
    }

}
