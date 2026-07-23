package Jishu.Kyokasho.chap6.Sample28;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Lemon");
        fruits.add(null);
        fruits.add(0, "Lemon");
        // fruits.add(100);
        System.out.println("Enhanced for statement... ");
        for(String fruit: fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println("\nBasic for statement...... ");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
        System.out.println();
        String val1 = fruits.remove(0);
        Boolean val2 = fruits.remove("Lemon");
        String val3 = fruits.set(0, "Mango");
        System.out.println("fruits.remove(0):" + val1);
        System.out.println("fruits.remove(\"Lemon\"):" + val2);
        System.out.println("fruits.set(0, \"Mango\"):" + val3);
        System.out.println(fruits);
    }
}
