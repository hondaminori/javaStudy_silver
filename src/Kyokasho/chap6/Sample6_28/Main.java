package Kyokasho.chap6.Sample6_28;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");     // 要素の追加
        fruits.add("Lemon");
        fruits.add(null);
        fruits.add(0, "Lemon"); // 位置を指定して重複要素を挿入
    //  fruits.add(100);
        System.out.print("Enhanced for statement... ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.print("\nBasic for statement...... ");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
        System.out.println();
        String val1 = fruits.remove(0);         // 削除
        boolean val2 = fruits.remove("Lemon");  // 削除
        String val3 = fruits.set(0, "Mango");   // 変更
        System.out.println("fruits.remove(0): " + val1);
        System.out.println("fruits.remove(\"Lemon\"): " + val2);
        System.out.println("fruits.set(0, \"Mango\"): " + val3);
        System.out.println(fruits);
    }
}
