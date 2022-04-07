package LinkedLists;

import java.util.LinkedList;

public class LL101 {
    public static void main(String[] args) {
        LinkedList <String> cars = new LinkedList<String>();
        LinkedList<Integer> num = new LinkedList<Integer>();
        // Adding items to the LL
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Mustang");
        cars.add("Aston Martin");
        // printing the LL
        System.out.println(cars);
        // Size of the LL
        System.out.println(cars.size());
        System.out.println(cars.get(0));
        cars.addFirst("Rolls Royals");
        cars.addLast("Lotus");
        System.out.println(cars);
        num.add(9);
        System.out.println(num);
    }
}
