package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqArray {
    static void countFreq(int arr[], int n)
    {
        Map<Integer, Integer> mp = new HashMap<>();

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if (entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
//            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_num = sc.nextInt();
        int arr[] = new int[total_num];

        for (int i=0; i<total_num; i++){
            arr[i] = sc.nextInt();
        }

        int n = arr.length;
        countFreq(arr, n);

    }
}
